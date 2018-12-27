package com.obit.homeautomation.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.obit.homeautomation.business.MotionSersorEvent.EventType;

@Service
public class MotionSensorService {

	private static final Logger log = LogManager.getLogger(MotionSensorService.class);
	
	@Autowired
	private Alarm alarm;
	
	@Autowired
	private MailService mailService;
	
	@Async
	@EventListener
	public void handleAlarm(MotionSersorEvent event) {
		if (EventType.MOTION_DETECTED.equals(event.getEventType()) && alarm.isActive()) {
			log.info("Event " + event.getEventType().toString() + "catched. Sending email...");
			mailService.sendAlarmEmail();
		}

	}
	
	
}
