package com.obit.homeautomation.device;

public interface Lamp {
	
	boolean turnOn();
	boolean turnOff();
	boolean turnNightModeOn();
	boolean turnNightModeOff();
	boolean isLampOn();
	boolean isNightModeOn();

}
