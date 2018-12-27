package com.obit.homeautomation.device;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MockLamp implements Lamp {
	
	private Boolean isLampOn;
	private Boolean isNightModeOn;
	
	public MockLamp() {
		if(isLampOn == null) {
			isLampOn = true;
		}
		if(isNightModeOn == null) {
			isNightModeOn = true;
		}
	}

	@Override
	public boolean turnOn() {
		this.isLampOn = true;
		return this.isLampOn;
	}

	@Override
	public boolean turnOff() {
		this.isLampOn = false;
		return this.isLampOn;
	}

	@Override
	public boolean turnNightModeOn() {
		this.isNightModeOn = true;
		return this.isNightModeOn;
	}

	@Override
	public boolean turnNightModeOff() {
		this.isNightModeOn = false;
		return this.isNightModeOn;
	}

	@Override
	public boolean isLampOn() {
		return isLampOn;
	}

	@Override
	public boolean isNightModeOn() {
		return isNightModeOn;
	}

}
