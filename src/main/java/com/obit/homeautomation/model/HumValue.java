package com.obit.homeautomation.model;

public class HumValue extends MeasuredValue{
	
	public HumValue (double value) {
		super(value, Unit.RELATIVE_HUMIDITY.getUnitSymbol());
	}

}
