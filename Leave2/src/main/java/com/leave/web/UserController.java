package com.leave.web;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leave.dto.UserRequestDto;
import com.leave.dto.UserResponseDto;
import com.leave.exception.UserNotFoundException;
import com.leave.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService us;
	
	@PostMapping(value="user/login")
	public ResponseEntity<Optional<UserResponseDto>>login(@RequestBody UserRequestDto userDto)throws UserNotFoundException{
		Optional<UserResponseDto> response=us.login(userDto);
		if(!response.isPresent())
		{
			throw new UserNotFoundException();
		}
		response.get().setStatusCode("200");
		response.get().setMessage("Login Successfull");
		return new ResponseEntity<Optional<UserResponseDto>>(response,HttpStatus.OK);
	}
	
	

}
