package com.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Email;
import com.example.repository.EmailRepository;
//@CrossOrigin
@Service
public class EmailService {
	@Autowired
	private EmailRepository emailRepository;
	public Email findEmail(String emailId)
	{
		Email email=emailRepository.findByEmailid(emailId);
		if (emailRepository.findByEmailid(emailId)!=null) 
		{
			return email;
		}
		else return null;
	}
	
}
