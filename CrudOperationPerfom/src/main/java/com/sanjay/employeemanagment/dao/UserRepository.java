package com.sanjay.employeemanagment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sanjay.employeemanagment.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	public List<User> findByUsername(String username);

}
