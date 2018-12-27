package com.obit.homeautomation.business;

import org.springframework.stereotype.Component;

@Component
public class Alarm {
	
	private boolean active;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
