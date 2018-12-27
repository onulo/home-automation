package com.obit.homeautomation.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.obit.homeautomation.device.MockGpioController;
import com.obit.homeautomation.device.MockTemperatureSensor;
import com.pi4j.component.temperature.TemperatureSensor;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.w1.W1Master;

@Configuration
public class PinControllerConfiguration {
	
	@Bean
	@Profile("!dev")
	public GpioController gpioController() {
		GpioController pinController = GpioFactory.getInstance();
		pinController.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
		return pinController; 
	}
	
	@Bean
	@Profile("dev")
	public GpioController mockGpioController() {
		return new MockGpioController(); 
	}
	
	@Bean
	@Profile("!dev")
	public List<TemperatureSensor> temperatureSensors() {
		W1Master master = new W1Master();
		return master.getDevices(TemperatureSensor.class);
	}
	
	@Bean
	@Profile("dev")
	public List<TemperatureSensor> mockTemperatureSensors() {
		return java.util.Arrays.asList(new MockTemperatureSensor());
	}

}
