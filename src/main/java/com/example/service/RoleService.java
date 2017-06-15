package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Role;
import com.example.repository.RoleRepository;
//@CrossOrigin
@Service
public class RoleService {
	@Autowired
	private RoleRepository roleRepository;
	public Role getRole(int id){
		return roleRepository.findOne(id);
	}

}
