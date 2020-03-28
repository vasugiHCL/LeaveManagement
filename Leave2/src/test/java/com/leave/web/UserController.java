package com.leave.web;

import static org.junit.Assert.assertNotNull;

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
import com.leave.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserController {
	
	@Mock
	UserService userService;
	
	@InjectMocks
	com.leave.web.UserController userController;
	
	
	User user=new User();
	UserRequestDto request=new UserRequestDto();
	UserResponseDto response=new UserResponseDto();
	
	
	@Test
	public void testUserLogin() throws UserNotFoundException{
		request.setUserEmailId("vasu@gmail.com");
		request.setUserPassword("vasu");
		
		response.setUserEmailId("vasu@gmail.com");
		
		Mockito.when(userService.login(request)).thenReturn(Optional.of(response));
		userController.login(request);
		assertNotNull(response);
	}
}
