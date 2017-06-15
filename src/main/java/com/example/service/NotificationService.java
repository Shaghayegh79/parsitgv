/*package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin
@Service
public class NotificationService {
	@Autowired
	private JavaMailSender javaMailSender;
	public void sendNotification(String emailAddress)
	{
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setTo(emailAddress);
		mail.setFrom("maxfree0610@gmail.com");
		mail.setText("this is a test");
		mail.setSubject("teeest");
		try{
			javaMailSender.send(mail);
			System.out.print("mail sent");
		}catch (Exception e){
			System.out.print(e.getMessage());
		} 
			
		
		
	}
	
}
*/