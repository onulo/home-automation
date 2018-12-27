package com.obit.homeautomation.device;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

@Component
@Profile("!dev")
public class LedLight {
	
	private static GpioPinDigitalOutput ledControlPin;
	
	@Autowired
	private GpioController pinController;

	@PostConstruct
	public void init() {
		ledControlPin = pinController.provisionDigitalOutputPin(RaspiPin.GPIO_05, PinState.LOW); 
	}
	
	public void turnOn() {
		ledControlPin.high();
	}
	
	public void turnOff() {
		ledControlPin.low();
	}

}
