/*package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Email;
import com.example.service.EmailService;
import com.example.service.NotificationService;

@RestController
@CrossOrigin
public class emailController {
	//private String emailAddress;

	@Autowired 	
	private EmailService emailService;
	
	@Autowired 	
	private NotificationService notificationService;

	@GetMapping("/emails/{emailId}")
	public boolean sendEmail(@PathVariable String emailId){
		String emailAddress;
		Email email=emailService.findEmail(emailId);
		if (email!=null) 
		{
			emailAddress = emailId+"@"+email.getSuffisso();
			notificationService.sendNotification(emailAddress);
			return true;
		}else return false;
	}
	
}*/
