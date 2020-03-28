package com.leave.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leave.dto.ApplyLeaveDto;
import com.leave.dto.LeaveDto;
import com.leave.entity.ApplyLeave;
import com.leave.entity.LeaveType;
import com.leave.exception.LeaveIdNotFoundException;
import com.leave.exception.UserIdNotFoundException;
import com.leave.repo.ApplyLeaveRepo;
import com.leave.repo.LeaveRepository;
import com.leave.service.LeaveService;


@Service
public class LeaveTypeServiceImpl implements LeaveService{
	
	@Autowired
	private LeaveRepository repo;


	@Autowired
	private ApplyLeaveRepo applyRepo;

	@Override
	public LeaveType getAllLeave(Long userId)throws LeaveIdNotFoundException {
		LeaveType leave=repo.findById(userId).orElseThrow(UserIdNotFoundException::new);
		return leave;
	}




	@Override
	public ApplyLeave applyLeave(ApplyLeaveDto applyLeaveDto)throws LeaveIdNotFoundException {
		ApplyLeave apply=new ApplyLeave(applyLeaveDto.getUserId(),applyLeaveDto.getLeaveTypeName(),applyLeaveDto.getReason(),
				applyLeaveDto.getFromDate(),applyLeaveDto.getToDate(),applyLeaveDto.getNoOfDays());
		return applyRepo.save(apply);
	}


	

}
