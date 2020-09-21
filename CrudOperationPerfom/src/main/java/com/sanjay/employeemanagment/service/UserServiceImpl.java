package com.sanjay.employeemanagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjay.employeemanagment.dao.UserRepository;
import com.sanjay.employeemanagment.entity.User;
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}

	@Override
	public void userSave(User user) {
				userRepository.save(user);
	}
	
	


}
