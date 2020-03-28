package com.leave.service;

import java.util.Optional;

import com.leave.dto.UserRequestDto;
import com.leave.dto.UserResponseDto;
import com.leave.exception.UserNotFoundException;

public interface UserService {
	
	public Optional<UserResponseDto> login(UserRequestDto userDto)throws UserNotFoundException;

	
	

	
}
