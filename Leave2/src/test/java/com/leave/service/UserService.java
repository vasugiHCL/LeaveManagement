package com.leave.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.leave.dto.UserRequestDto;
import com.leave.dto.UserResponseDto;
import com.leave.entity.User;
import com.leave.exception.UserNotFoundException;
import com.leave.repo.UserRepo;
import com.leave.service.Impl.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserService {

	@Mock
	UserRepo repo;
	
	@InjectMocks
	UserServiceImpl userImpl;
	
	
	UserRequestDto request=new UserRequestDto();
	UserResponseDto response=new UserResponseDto();
	
	User user=new User();
	
	@Test
	public void testUserLogin() throws UserNotFoundException{
		request.setUserEmailId("vasu@gmail.com");
		request.setUserPassword("vasu");
		user.setUserEmailId("vasu@gmail.com");
		
		Mockito.when(repo.findByUserEmailIdAndUserPassword("vasu@gmail.com", "vasu")).thenReturn(Optional.of(user));
		userImpl.login(request);
		assertNotNull(response);
	}
	
	
}
