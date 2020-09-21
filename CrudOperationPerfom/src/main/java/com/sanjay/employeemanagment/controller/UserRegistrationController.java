package com.sanjay.employeemanagment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanjay.employeemanagment.entity.User;
import com.sanjay.employeemanagment.service.UserService;

@Controller

public class UserRegistrationController {
	
	@Autowired
     
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@GetMapping("/register")
	
	public String userRegistration(Model theModel)
	
	{
		theModel.addAttribute("register",new User());
		
		return "register";
	}
	@PostMapping("/registerprocess")
	@Transactional
	public String userSave(User user)
	{
		userService.userSave(user);
		return "successregister"; 
		
		
	}

}
