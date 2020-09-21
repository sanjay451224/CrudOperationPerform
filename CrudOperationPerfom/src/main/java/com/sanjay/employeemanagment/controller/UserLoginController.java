package com.sanjay.employeemanagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sanjay.employeemanagment.entity.User;
import com.sanjay.employeemanagment.service.UserService;

@Controller
public class UserLoginController {
	
	@Autowired
	
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@GetMapping("/login")
	public String loginUser()
	{
		return "login";
		
	}
	@PostMapping("/loginprocess")
    @Transactional
	public String loginProcess(@RequestParam("username") String username,@RequestParam("password") String password)
	{
		User user = new User();
	     user.getUsername();
		  user.getPassword();
	    List<User> login = userService.findByUsername(username);
		if(login!=userService.findByUsername(username))
		{
			return "login";

		}
		
		return "list-employees"	;	
	}

}
