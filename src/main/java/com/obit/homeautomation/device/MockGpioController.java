package com.obit.homeautomation.device;

import java.util.Collection;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioPin;
import com.pi4j.io.gpio.GpioPinAnalog;
import com.pi4j.io.gpio.GpioPinAnalogInput;
import com.pi4j.io.gpio.GpioPinAnalogOutput;
import com.pi4j.io.gpio.GpioPinDigital;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalMultipurpose;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.GpioPinInput;
import com.pi4j.io.gpio.GpioPinPwmOutput;
import com.pi4j.io.gpio.GpioPinShutdown;
import com.pi4j.io.gpio.GpioProvider;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinMode;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.event.GpioPinListener;
import com.pi4j.io.gpio.trigger.GpioTrigger;

public class MockGpioController implements GpioController{

	@Override
	public void export(PinMode mode, PinState defaultState, GpioPin... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void export(PinMode mode, GpioPin... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isExported(GpioPin... pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void unexport(Pin... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unexport(GpioPin... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unexportAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMode(PinMode mode, GpioPin... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PinMode getMode(GpioPin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMode(PinMode mode, GpioPin... pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPullResistance(PinPullResistance resistance, GpioPin... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PinPullResistance getPullResistance(GpioPin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPullResistance(PinPullResistance resistance, GpioPin... pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void high(GpioPinDigitalOutput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isHigh(GpioPinDigital... pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void low(GpioPinDigitalOutput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLow(GpioPinDigital... pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setState(PinState state, GpioPinDigitalOutput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setState(boolean state, GpioPinDigitalOutput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isState(PinState state, GpioPinDigital... pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PinState getState(GpioPinDigital pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void toggle(GpioPinDigitalOutput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pulse(long milliseconds, GpioPinDigitalOutput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValue(double value, GpioPinAnalogOutput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getValue(GpioPinAnalog pin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addListener(GpioPinListener listener, GpioPinInput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addListener(GpioPinListener[] listeners, GpioPinInput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListener(GpioPinListener listener, GpioPinInput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListener(GpioPinListener[] listeners, GpioPinInput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAllListeners() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTrigger(GpioTrigger trigger, GpioPinInput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTrigger(GpioTrigger[] triggers, GpioPinInput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTrigger(GpioTrigger trigger, GpioPinInput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTrigger(GpioTrigger[] triggers, GpioPinInput... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAllTriggers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(GpioProvider provider, Pin pin, String name,
			PinMode mode, PinPullResistance resistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(GpioProvider provider, Pin pin, PinMode mode,
			PinPullResistance resistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(GpioProvider provider, Pin pin, String name,
			PinMode mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(GpioProvider provider, Pin pin, PinMode mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(Pin pin, String name, PinMode mode,
			PinPullResistance resistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(Pin pin, PinMode mode,
			PinPullResistance resistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(Pin pin, String name, PinMode mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(Pin pin, PinMode mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalInput provisionDigitalInputPin(GpioProvider provider, Pin pin, String name,
			PinPullResistance resistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalInput provisionDigitalInputPin(GpioProvider provider, Pin pin, PinPullResistance resistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalInput provisionDigitalInputPin(GpioProvider provider, Pin pin, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalInput provisionDigitalInputPin(GpioProvider provider, Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalInput provisionDigitalInputPin(Pin pin, String name, PinPullResistance resistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalInput provisionDigitalInputPin(Pin pin, PinPullResistance resistance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalInput provisionDigitalInputPin(Pin pin, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalInput provisionDigitalInputPin(Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalOutput provisionDigitalOutputPin(GpioProvider provider, Pin pin, String name,
			PinState defaultState) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalOutput provisionDigitalOutputPin(GpioProvider provider, Pin pin, PinState defaultState) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalOutput provisionDigitalOutputPin(GpioProvider provider, Pin pin, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalOutput provisionDigitalOutputPin(GpioProvider provider, Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalOutput provisionDigitalOutputPin(Pin pin, String name, PinState defaultState) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalOutput provisionDigitalOutputPin(Pin pin, PinState defaultState) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalOutput provisionDigitalOutputPin(Pin pin, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinDigitalOutput provisionDigitalOutputPin(Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinAnalogInput provisionAnalogInputPin(GpioProvider provider, Pin pin, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinAnalogInput provisionAnalogInputPin(GpioProvider provider, Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinAnalogInput provisionAnalogInputPin(Pin pin, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinAnalogInput provisionAnalogInputPin(Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinAnalogOutput provisionAnalogOutputPin(GpioProvider provider, Pin pin, String name,
			double defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinAnalogOutput provisionAnalogOutputPin(GpioProvider provider, Pin pin, double defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinAnalogOutput provisionAnalogOutputPin(GpioProvider provider, Pin pin, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinAnalogOutput provisionAnalogOutputPin(GpioProvider provider, Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinAnalogOutput provisionAnalogOutputPin(Pin pin, String name, double defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinAnalogOutput provisionAnalogOutputPin(Pin pin, double defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinAnalogOutput provisionAnalogOutputPin(Pin pin, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinAnalogOutput provisionAnalogOutputPin(Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionPwmOutputPin(GpioProvider provider, Pin pin, String name, int defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionPwmOutputPin(GpioProvider provider, Pin pin, int defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionPwmOutputPin(GpioProvider provider, Pin pin, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionPwmOutputPin(GpioProvider provider, Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionPwmOutputPin(Pin pin, String name, int defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionPwmOutputPin(Pin pin, int defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionPwmOutputPin(Pin pin, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionPwmOutputPin(Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionSoftPwmOutputPin(GpioProvider provider, Pin pin, String name, int defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionSoftPwmOutputPin(GpioProvider provider, Pin pin, int defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionSoftPwmOutputPin(GpioProvider provider, Pin pin, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionSoftPwmOutputPin(GpioProvider provider, Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionSoftPwmOutputPin(Pin pin, String name, int defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionSoftPwmOutputPin(Pin pin, int defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionSoftPwmOutputPin(Pin pin, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPinPwmOutput provisionSoftPwmOutputPin(Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPin provisionPin(GpioProvider provider, Pin pin, String name, PinMode mode, PinState defaultState) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPin provisionPin(GpioProvider provider, Pin pin, String name, PinMode mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPin provisionPin(GpioProvider provider, Pin pin, PinMode mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPin provisionPin(Pin pin, String name, PinMode mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPin provisionPin(Pin pin, PinMode mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setShutdownOptions(GpioPinShutdown options, GpioPin... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShutdownOptions(Boolean unexport, GpioPin... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShutdownOptions(Boolean unexport, PinState state, GpioPin... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShutdownOptions(Boolean unexport, PinState state, PinPullResistance resistance, GpioPin... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShutdownOptions(Boolean unexport, PinState state, PinPullResistance resistance, PinMode mode,
			GpioPin... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<GpioPin> getProvisionedPins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPin getProvisionedPin(Pin pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GpioPin getProvisionedPin(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void unprovisionPin(GpioPin... pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isShutdown() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		
	}

}
