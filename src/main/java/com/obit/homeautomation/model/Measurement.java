package com.obit.homeautomation.model;

public class Measurement {

	private Integer sensorId;
	private String sensorName;
	private String sensorDesc;
	private MeasuredValue measuredValue;

	private Measurement(MeasurementBuilder builder) {
		this.sensorId = builder.sensorId;
		this.sensorName = builder.sensorName;
		this.sensorDesc = builder.sensorDesc;
		this.measuredValue = builder.measuredValue;
	}

	public Integer getSensorId() {
		return sensorId;
	}

	public String getSensorName() {
		return sensorName;
	}

	public String getSensorDesc() {
		return sensorDesc;
	}

	public MeasuredValue getMeasuredValue() {
		return measuredValue;
	}

	public static class MeasurementBuilder {

		private Integer sensorId;
		private String sensorName;
		private String sensorDesc;
		private MeasuredValue measuredValue;

		public MeasurementBuilder withSensorId(Integer sensorId) {
			this.sensorId = sensorId;
			return this;
		}

		public MeasurementBuilder withSensorName(String sensorName) {
			this.sensorName = sensorName;
			return this;
		}

		public MeasurementBuilder withSensorDesc(String sensorDesc) {
			this.sensorDesc = sensorDesc;
			return this;
		}

		public MeasurementBuilder withMeasuredValue(MeasuredValue measuredValue) {
			this.measuredValue = measuredValue;
			return this;
		}

		public Measurement build() {
			return new Measurement(this);
		}

	}

}
