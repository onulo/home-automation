package com.obit.homeautomation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obit.homeautomation.device.HumSensor;
import com.obit.homeautomation.device.TempSensor;
import com.obit.homeautomation.model.Measurement;

@RestController
public class MeasurementController {
	
	@Autowired
	private TempSensor roomTempSensor;
	
	@Autowired
	private TempSensor outdoorTempHumSensor;
	
	@Autowired
	private TempSensor tempHumSensor;
	
	@Autowired
	@Qualifier("indoor")
	private HumSensor indoorHumSensor;
	
	@Autowired
	@Qualifier("outdoor")
	private HumSensor outdoorHumSensor;
	
	@GetMapping("/measurements")
	public List<Measurement> getMesurements(){
		List<Measurement> measurements = new ArrayList<>();
		measurements.add(tempHumSensor.getTemperature());
		measurements.add(indoorHumSensor.getHumidity());
		measurements.add(outdoorTempHumSensor.getTemperature());
		measurements.add(outdoorHumSensor.getHumidity());
		measurements.add(roomTempSensor.getTemperature());
		return measurements;
	}

}
