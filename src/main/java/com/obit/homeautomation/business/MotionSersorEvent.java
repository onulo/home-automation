package com.obit.homeautomation.business;

import org.springframework.context.ApplicationEvent;

public class MotionSersorEvent extends ApplicationEvent{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EventType eventType;
	
	public enum EventType{
		MOTION_DETECTED,
		QUIET_DETECTED;
		
	}

	public MotionSersorEvent(Object source, EventType eventType) {
		super(source);
		this.eventType = eventType;
	}

	public EventType getEventType() {
		return eventType;
	}


}
