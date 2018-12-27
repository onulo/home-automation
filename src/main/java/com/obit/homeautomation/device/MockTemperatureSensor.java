package com.obit.homeautomation.device;

import java.util.Map;

import com.pi4j.component.temperature.TemperatureListener;
import com.pi4j.component.temperature.TemperatureSensor;
import com.pi4j.temperature.TemperatureScale;

public class MockTemperatureSensor implements TemperatureSensor {

	@Override
	public void removeAllListeners() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTag(Object tag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getTag() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProperty(String key, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasProperty(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getProperty(String key, String defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProperty(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeProperty(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearProperties() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTemperature() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTemperature(TemperatureScale scale) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TemperatureScale getScale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addListener(TemperatureListener... listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListener(TemperatureListener... listener) {
		// TODO Auto-generated method stub
		
	}

}
