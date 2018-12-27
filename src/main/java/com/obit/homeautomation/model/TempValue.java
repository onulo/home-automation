package com.obit.homeautomation.model;

public class TempValue extends MeasuredValue{

	public TempValue(double value) {
		super(value, Unit.CELSIUS.getUnitSymbol());
	}

}
