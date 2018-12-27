package com.obit.homeautomation.business;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailService {
	
	private static final Logger log = LogManager.getLogger(MailService.class);
	
	@Autowired
	private JavaMailSender emailSender;

	public void sendAlarmEmail() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("ondrej.barci@gmail.com");
		message.setSubject("Alarm - Motion detected");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
		String format = LocalDateTime.now().format(formatter);
		
		message.setText("Motion detected at " + format);
		emailSender.send(message);
		log.info("Mail sent.");
		
	}
}