package com.obit.homeautomation.device;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.obit.homeautomation.business.MotionSersorEvent;
import com.obit.homeautomation.business.MotionSersorEvent.EventType;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

@Component
@Profile("!dev")
public class LivingRoomMotionSensor {
	
	private static final Logger log = LogManager.getLogger(LivingRoomMotionSensor.class);
	
	private static GpioPinDigitalInput motionSensorPin;

	@Autowired
	private GpioController pinController;
	
	@Autowired
	private LedLight ledLight;

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	@PostConstruct
	public void init() {
		motionSensorPin = pinController.provisionDigitalInputPin(RaspiPin.GPIO_04, PinPullResistance.PULL_DOWN);
		motionSensorPin.addListener(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if (isMotionDetected(event)) {
					publishMotionSensorEvent(EventType.MOTION_DETECTED);
					ledLight.turnOn();
				}
				if (isQuietDetected(event)) {
					publishMotionSensorEvent(EventType.QUIET_DETECTED);
					ledLight.turnOff();
				}
			}
		});
	}
	
	private boolean isQuietDetected(GpioPinDigitalStateChangeEvent event) {
		return event.getState().isLow();
	}

	private void publishMotionSensorEvent(EventType eventType) {
		log.info("Event " + eventType.toString() + "fired.");
		eventPublisher.publishEvent(new MotionSersorEvent(this, eventType));
	}

	private boolean isMotionDetected(GpioPinDigitalStateChangeEvent event) {
		return event.getState().isHigh();
	}

}
