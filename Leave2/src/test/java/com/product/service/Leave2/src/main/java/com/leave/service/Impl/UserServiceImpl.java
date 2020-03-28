package com.leave.service.Impl;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leave.dto.UserRequestDto;
import com.leave.dto.UserResponseDto;
import com.leave.entity.User;
import com.leave.exception.UserNotFoundException;
import com.leave.repo.UserRepo;
import com.leave.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;

	
	@Transactional
	public Optional<UserResponseDto> login(UserRequestDto userDto) throws UserNotFoundException {
		Optional<User>login=userRepo.findByUserEmailIdAndUserPassword(userDto.getUserEmailId(), userDto.getUserPassword());
		if(!login.isPresent())
		{
			throw new UserNotFoundException();
		}
		UserResponseDto response=new UserResponseDto();
		response.setUserEmailId(login.get().getUserEmailId());
		return Optional.of(response);
	}


}
