package com.obit.homeautomation.device;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.obit.homeautomation.model.Measurement;
import com.obit.homeautomation.model.TempValue;
import com.obit.homeautomation.model.Measurement.MeasurementBuilder;
import com.pi4j.component.temperature.TemperatureSensor;
import com.pi4j.temperature.TemperatureScale;

@Component
public class RoomTempSensor implements TempSensor {

	private static final Logger log = LogManager.getLogger(RoomTempSensor.class);
	
	private static final int SENSOR_ID = 0;
	private static final String SENSOR_DESC = "Living Room:";

	private double temperature;

	@Autowired
	private List<TemperatureSensor> temperatureSensors;

	@Scheduled(fixedDelay = 5000)
	public void readTemperature() {
		if (temperatureSensors.size() >= 1) {
			TemperatureSensor tempSensor = temperatureSensors.get(SENSOR_ID);
			temperature = tempSensor.getTemperature(TemperatureScale.CELSIUS);
		} else {
			log.info("Temperature sensor not found!");
			temperature = 21.5;
		}
	}

	@Override
	public Measurement getTemperature() {
		return new Measurement.MeasurementBuilder()
				.withSensorId(SENSOR_ID)
				.withSensorName(this.getClass().getSimpleName())
				.withSensorDesc(SENSOR_DESC)
				.withMeasuredValue(new TempValue(this.temperature)).build();
				
	}

}
