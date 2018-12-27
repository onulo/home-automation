package com.obit.homeautomation.device;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.obit.homeautomation.model.HumValue;
import com.obit.homeautomation.model.Measurement;
import com.obit.homeautomation.model.TempValue;
import com.obit.homeautomation.model.Measurement.MeasurementBuilder;

@Component
@Qualifier("outdoor")
public class OutdoorTempHumSensor implements TempSensor, HumSensor {

	private static final int TEMP_SENSOR_ID = 2;
	private static final int HUM_SENSOR_ID = 3;
	private static final String TEMP_SENSOR_DESC = "Temperature";
	private static final String HUM_SENSOR_DESC = "Humidity";

	private double temperature;
	private double humidity;

	@Scheduled(fixedDelay = 60000)
	public void setTemperature() throws IOException {
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> res = template.getForEntity("http://api.openweathermap.org/data/2.5/weather?id=3060972&units=metric&APPID=f6222e0b24d9af2b1aa817ceb29fcab8", String.class);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(res.getBody());
		JsonNode main = root.path("main");
		JsonNode temp = main.get("temp");
		JsonNode hum = main.get("humidity");
		this.temperature = Double.valueOf(temp.toString());
		this.humidity = Double.valueOf(hum.toString());
	}

	@Override
	public Measurement getTemperature() {
		return new Measurement.MeasurementBuilder()
				.withSensorId(TEMP_SENSOR_ID)
				.withSensorName(this.getClass().getSimpleName())
				.withSensorDesc(TEMP_SENSOR_DESC)
				.withMeasuredValue(new TempValue(temperature)).build();
	}

	@Override
	public Measurement getHumidity() {
		return new Measurement.MeasurementBuilder()
				.withSensorId(HUM_SENSOR_ID)
				.withSensorName(this.getClass().getSimpleName())
				.withSensorDesc(HUM_SENSOR_DESC)
				.withMeasuredValue(new HumValue(humidity)).build();
	}
	
}
