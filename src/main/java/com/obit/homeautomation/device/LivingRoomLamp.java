package com.obit.homeautomation.device;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

@Component
@Profile("!dev")
public class LivingRoomLamp implements Lamp {

	private static GpioPinDigitalOutput lampControlPin;

	private static boolean isNightModeOn;

	@Autowired
	private GpioController pinController;

	@PostConstruct
	public void init() {
		lampControlPin = pinController.provisionDigitalOutputPin(RaspiPin.GPIO_01, "lampControlPin");
	}

	@Override
	public boolean turnOn() {
		lampControlPin.high();
		return lampControlPin.isHigh();
	}

	@Override
	public boolean turnOff() {
		lampControlPin.low();
		return lampControlPin.isHigh();
	}

	@Override
	public boolean turnNightModeOn() {
		isNightModeOn = true;
		return isNightModeOn;
	}

	@Override
	public boolean turnNightModeOff() {
		isNightModeOn = false;
		return isNightModeOn;
	}

	@Override
	public boolean isLampOn() {
		return lampControlPin.isHigh();
	}

	@Override
	public boolean isNightModeOn() {
		return isNightModeOn;
	}

}
