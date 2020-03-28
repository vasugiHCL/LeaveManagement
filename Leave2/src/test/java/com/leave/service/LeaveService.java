package com.leave.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.leave.dto.ApplyLeaveDto;
import com.leave.entity.ApplyLeave;
import com.leave.entity.LeaveType;
import com.leave.exception.LeaveIdNotFoundException;
import com.leave.exception.UserIdNotFoundException;
import com.leave.exception.UserNotFoundException;
import com.leave.repo.ApplyLeaveRepo;
import com.leave.repo.LeaveRepository;
import com.leave.service.Impl.LeaveTypeServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class LeaveService {
	
	@InjectMocks
	LeaveTypeServiceImpl leaveType;
	
	@Mock
	LeaveRepository leaveRepo;
	
	@Mock
	ApplyLeaveRepo applyRepo;
	
	ApplyLeave applyLeave=null;
	  ApplyLeaveDto apply=null;
	
	@Test
	public void testApplyLeave() throws UserIdNotFoundException,LeaveIdNotFoundException{
		applyLeave=new ApplyLeave();
		applyLeave.setUserId(100L);
		applyLeave.setLeaveTypeName("Annual Holiday");
		applyLeave.setFromDate(LocalDate.of(2010,10,10));
		applyLeave.setToDate(LocalDate.of(2010, 12, 11));
		applyLeave.setNoOfDays(3);
		applyLeave.setReason("vacation");
		
	
		Mockito.when(applyRepo.findById(100L)).thenReturn(Optional.of(applyLeave));
		Mockito.when(applyRepo.save(applyLeave)).thenReturn(applyLeave);
		ApplyLeave ap=leaveType.applyLeave(apply);
		assertEquals(apply.getLeaveTypeName(),ap.getLeaveTypeName());
	}
	
	@Test
	public void testGetAllLeave() throws UserIdNotFoundException,UserNotFoundException{
		
		applyLeave=new ApplyLeave();
		applyLeave.setUserId(100L);
		
		LeaveType leave=new LeaveType();
		leave.setUserId(100L);
		
		Long userId=100L;
		Mockito.when(leaveRepo.findById(userId)).thenReturn(Optional.of(leave));
		leaveType.getAllLeave(100L);
		assertNotNull(leave);
		
		
	}

}
