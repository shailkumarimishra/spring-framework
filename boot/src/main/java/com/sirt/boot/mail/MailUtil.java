package com.sirt.boot.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MailUtil {
	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail() {
		log.info("Preparing Simple Message");
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setTo("shailtinu2000@gmail.com","kalawati.ambe12@gmail.com");
		msg.setSubject("Testing From Shail Mishra");
		msg.setText("Hi\n This is Test Mail from Shail Mishra");
		mailSender.send(msg);
		log.info("Mail has been sent");
	}

	public void sendEmailWithAttachment() {
		log.info("Preparing mail with attachment");
		MimeMessage createMimeMessage = mailSender.createMimeMessage();
		try {
			MimeMessageHelper helper=new MimeMessageHelper(createMimeMessage,true);
			String[] recepients= {"kalawati.ambe12@gmail.com","shradha.jadiya1999@gmail.com","anjalijatav28@gmail.com"};
		    helper.setTo(recepients);
			helper.setSubject("Testing From Shail Mishra");
			helper.setText("Hi\n This is Test Mail from Shail Mishra");
			helper.addAttachment("MyPhoto.jpg",new ClassPathResource("photo.jpg"));
			mailSender.send(createMimeMessage);
			log.info("Attachment has been sent");
		} catch (MessagingException e) {
			log.error("some exception occurs while sending attachment {}",e.getMessage());
		}
		
	}
}
