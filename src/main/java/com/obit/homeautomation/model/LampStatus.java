package com.obit.homeautomation.model;

public class LampStatus {
	
	private boolean isLampOn;
	private boolean isNightModeOn;

	public LampStatus(boolean isLampOn, boolean isNightModeOn) {
		this.isLampOn = isLampOn;
		this.isNightModeOn = isNightModeOn;
	}
	
	public boolean isLampOn() {
		return isLampOn;
	}
	
	public boolean isNightModeOn() {
		return isNightModeOn;
	}

}
