package com.leave.service;


import com.leave.dto.ApplyLeaveDto;
import com.leave.entity.ApplyLeave;
import com.leave.entity.LeaveType;
import com.leave.exception.LeaveIdNotFoundException;
import com.leave.exception.UserIdNotFoundException;

public interface LeaveService {
	
	LeaveType getAllLeave(Long userId)throws UserIdNotFoundException;
	
	public ApplyLeave applyLeave(ApplyLeaveDto applyLeaveDto)throws UserIdNotFoundException;
	

}
