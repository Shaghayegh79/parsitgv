package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Role;
//@CrossOrigin
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
