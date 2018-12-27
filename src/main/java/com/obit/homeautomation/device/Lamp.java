package com.obit.homeautomation.device;

public interface Lamp {
	
	public boolean turnOn();
	public boolean turnOff();
	public boolean turnNightModeOn();
	public boolean turnNightModeOff();
	public boolean isLampOn();
	public boolean isNightModeOn();

}
