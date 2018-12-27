package com.obit.homeautomation.model;


public class MeasuredValue {
	
	private double value;
	private String unitSymbol;
	
	public MeasuredValue(double value, String unitSymbol) {
		this.value = value;
		this.unitSymbol = unitSymbol;
	}
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getUnitSymbol() {
		return unitSymbol;
	}

	public void setUnitSymbol(String unitSymbol) {
		this.unitSymbol = unitSymbol;
	}
	
	public enum Unit{
		CELSIUS("°C"), 
		RELATIVE_HUMIDITY("%RH");
		
		private String unitSymbol;
		
		private Unit(String unitSymbol) {
			this.unitSymbol = unitSymbol;
		}
		
		public String getUnitSymbol() {
			return unitSymbol;
		}
		
	}
	
}
