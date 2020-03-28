package com.leave.dto;

import com.leave.entity.ApplyLeave;

public class ResponseDto {
	
	private String message;
	private ApplyLeave apply;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ApplyLeave getApply() {
		return apply;
	}
	public void setApply(ApplyLeave apply) {
		this.apply = apply;
	}
	
	
	

}
