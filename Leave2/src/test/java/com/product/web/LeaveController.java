package com.product.web;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.leave.dto.ApplyLeaveDto;
import com.leave.dto.LeaveDto;
import com.leave.dto.ResponseDto;
import com.leave.entity.ApplyLeave;
import com.leave.entity.LeaveType;
import com.leave.exception.UserIdNotFoundException;
import com.leave.service.LeaveService;
import com.mysql.cj.protocol.x.Ok;

@RunWith(MockitoJUnitRunner.class)
public class LeaveController {
	
	
	@Mock
	LeaveService leaveService;
	
	@InjectMocks
	com.leave.web.LeaveController leaveControl;
	
	  ApplyLeave applyLeave=null;
	  ApplyLeaveDto apply=null;
	
	@Test
	public void testApplyLeave()throws UserIdNotFoundException{
		applyLeave=new ApplyLeave();
		applyLeave.setUserId(100L);
		applyLeave.setLeaveTypeName("Annual Holiday");
		applyLeave.setFromDate(LocalDate.of(2010,10,10));
		applyLeave.setToDate(LocalDate.of(2010, 12, 11));
		applyLeave.setNoOfDays(3);
		applyLeave.setReason("vacation");
		
		apply=new ApplyLeaveDto();
		apply.setUserId(100L);
		apply.setLeaveTypeName("Annual Holiday");
		apply.setFromDate(LocalDate.of(2010, 10, 10));
		apply.setToDate(LocalDate.of(2010, 12, 11));
		apply.setNoOfDays(3);
		apply.setReason("vacation");
		
		Mockito.when(leaveService.applyLeave(apply)).thenReturn(applyLeave);
		ResponseEntity<ResponseDto>res=leaveControl.applyLeave(apply);
		assertEquals(HttpStatus.CREATED,res.getStatusCode());	
		
	}
	@Test
	public void getAllLeaveTest()throws UserIdNotFoundException{
		LeaveType leave=new LeaveType();
		
		
		leave.setUserId(100L);
		Long userId=100L;
		Mockito.when(leaveService.getAllLeave(userId)).thenReturn(leave);
		ResponseEntity<LeaveType>lea=leaveControl.getAllLeave(userId);
		assertEquals(HttpStatus.OK,lea.getStatusCode());
		
		
	}
	
}
