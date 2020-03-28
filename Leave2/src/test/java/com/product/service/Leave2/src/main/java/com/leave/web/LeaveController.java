package com.leave.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leave.dto.ApplyLeaveDto;
import com.leave.dto.ResponseDto;
import com.leave.entity.ApplyLeave;
import com.leave.entity.LeaveType;
import com.leave.exception.LeaveIdNotFoundException;
import com.leave.exception.UserIdNotFoundException;
import com.leave.service.LeaveService;

@RestController
public class LeaveController {
	
	@Autowired
	private LeaveService ls;
	
	@GetMapping(value="user/getAllLeave/{userId}")
	public ResponseEntity<LeaveType>getAllLeave(@PathVariable("userId")Long userId)throws UserIdNotFoundException{
		LeaveType leave=ls.getAllLeave(userId);
		return new ResponseEntity<LeaveType>(leave,HttpStatus.OK);
	}
	
	@PostMapping(value="users/applyLeave")
	public ResponseEntity<ResponseDto>applyLeave(@RequestBody ApplyLeaveDto dto)throws UserIdNotFoundException,LeaveIdNotFoundException{
		ApplyLeave ap=ls.applyLeave(dto);
		ResponseDto res=new ResponseDto();
		res.setMessage("Leave applied successfuly");
		res.setApply(ap);
		return new ResponseEntity<ResponseDto>(res,HttpStatus.CREATED);
	}

}
