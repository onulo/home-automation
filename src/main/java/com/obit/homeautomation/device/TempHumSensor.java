package com.obit.homeautomation.device;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.obit.homeautomation.model.HumValue;
import com.obit.homeautomation.model.Measurement;
import com.obit.homeautomation.model.TempValue;
import com.obit.homeautomation.model.Measurement.MeasurementBuilder;

@Component
@Qualifier("indoor")
public class TempHumSensor implements TempSensor, HumSensor {
	
	private static final String READ_TEMP_HUM_SH = "./readTempHum.sh";
	private Double temp;
	private static final String TEMP_SENSOR_DESC = "Temperature";
	private Double hum;
	private static final String HUM_SENSOR_DESC = "Humidity";

	private static final Logger log = LogManager.getLogger(TempHumSensor.class);

	@Scheduled(fixedDelay = 5000)
	public void getOutput() throws InterruptedException {
		try {
			Process process;
			process = Runtime.getRuntime().exec(READ_TEMP_HUM_SH);
			StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), this::parseTempHum);
			Executors.newSingleThreadExecutor().submit(streamGobbler);
			int exitCode = process.waitFor();
			assert exitCode == 0;
		} catch (IOException e) {
			log.error("Can't load external file." + READ_TEMP_HUM_SH);
			
			this.temp = generaterandomTemerature();
			this.hum = generaterandomHumidity();
		}
		
	}
	
	private double generaterandomTemerature() {
		Random r = new Random();
		int low = 15;
		int high = 32;
		return r.nextInt(high-low) + low;
	}
	
	private double generaterandomHumidity() {
		Random r = new Random();
		int low = 45;
		int high = 65;
		return r.nextInt(high-low) + low;
	}
	
	private void parseTempHum(String stringOutput) {
		stringOutput = stringOutput.substring(stringOutput.indexOf("=") + 1);
		String s = stringOutput.substring(0, stringOutput.indexOf("*"));
		temp = Double.valueOf(s);
		
		stringOutput = stringOutput.substring(stringOutput.indexOf("=") + 1);
		stringOutput = stringOutput.substring(0, stringOutput.indexOf("%"));
		hum = Double.valueOf(stringOutput);
		
	}

	private static class StreamGobbler implements Runnable {
		private InputStream inputStream;
		private Consumer<String> consumer;

		public StreamGobbler(InputStream inputStream, Consumer<String> consumer) {
			this.inputStream = inputStream;
			this.consumer = consumer;
		}

		@Override
		public void run() {
			new BufferedReader(new InputStreamReader(inputStream)).lines().forEach(consumer);
		}
	}

	@Override
	public Measurement getHumidity() {
		return new Measurement.MeasurementBuilder()
				.withSensorId(1)
				.withSensorName(this.getClass().getSimpleName())
				.withSensorDesc(HUM_SENSOR_DESC)
				.withMeasuredValue(new HumValue(hum)).build();
	}

	@Override
	public Measurement getTemperature() {
		return new Measurement.MeasurementBuilder()
				.withSensorId(3)
				.withSensorName(this.getClass().getSimpleName())
				.withSensorDesc(TEMP_SENSOR_DESC)
				.withMeasuredValue(new TempValue(temp)).build();
	}

}
