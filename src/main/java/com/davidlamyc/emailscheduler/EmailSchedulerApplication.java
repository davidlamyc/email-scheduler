package com.davidlamyc.emailscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@SpringBootApplication
public class EmailSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailSchedulerApplication.class, args);

//		sendSimpleMessage("davidlam.yc@gmail.com", "test text", "test desc");
	}

//	@Bean
//	public static JavaMailSender getJavaMailSender() {
//		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//		mailSender.setHost("smtp.gmail.com");
//		mailSender.setPort(587);
//
//		mailSender.setUsername("");
//		mailSender.setPassword("");
//
//		Properties props = mailSender.getJavaMailProperties();
//		props.put("mail.transport.protocol", "smtp");
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.starttls.enable", "true");
//		props.put("mail.debug", "true");
//
//		return mailSender;
//	}
//
//	public static void sendSimpleMessage(
//			String to, String subject, String text) {
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setFrom("davidlam.yc@gmail.com");
//		message.setTo(to);
//		message.setSubject(subject);
//		message.setText(text);
//		getJavaMailSender().send(message);
//	}
}
