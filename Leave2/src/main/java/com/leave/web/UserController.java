package com.leave.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.leave.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService us;
	
	
	/*@PostMapping(value="users/login")
	public ResponseEntity<String>login(@RequestParam String userEmailId,@RequestParam String userPassword){
		String login=us.userLogin(userEmailId, userPassword);
		return new ResponseEntity<String>(login,HttpStatus.OK);
		
		
	}*/

}
