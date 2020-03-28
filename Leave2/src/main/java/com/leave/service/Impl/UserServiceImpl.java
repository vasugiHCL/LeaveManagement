package com.leave.service.Impl;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leave.entity.User;
import com.leave.repo.UserRepo;
import com.leave.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;

	
	/*@Transactional
	@Override
	public String userLogin(String userEmailId, String userPassword) {
		User user=userRepo.findById(userEmailId,userPassword);
		user.setIsLoggedIn(true);
		return "Login Successfull";
	}*/

	

}
