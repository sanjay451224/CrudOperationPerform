package com.sanjay.employeemanagment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sanjay.employeemanagment.entity.User;
@Service()
public interface UserService {
	
	public List<User>  findByUsername(String username);
	public void userSave(User user);

}
