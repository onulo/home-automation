package com.obit.homeautomation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obit.homeautomation.device.Lamp;
import com.obit.homeautomation.model.LampStatus;

@RestController
public class LampControler {

	@Autowired
	private Lamp lamp;
	
	@GetMapping("/lamp/status")
	public LampStatus getLampStatus() {
		return new LampStatus(
				lamp.isLampOn(), 
				lamp.isNightModeOn());
	}

	@GetMapping("/lamp/on")
	public Boolean turnOnLamp() {
		return lamp.turnOn();
	}

	@GetMapping("/lamp/off")
	public Boolean turnOffLamp() {
		return lamp.turnOff();
	}
	
	@GetMapping("/lamp/nightModeOn")
	public Boolean turnOnNightMode() {
		return lamp.turnNightModeOn();
	}
	
	@GetMapping("/lamp/nightModeOff")
	public Boolean turnOffNightMode() {
		return lamp.turnNightModeOff();
	}

}
