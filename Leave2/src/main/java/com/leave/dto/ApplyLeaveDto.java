package com.leave.dto;

import java.time.LocalDate;

public class ApplyLeaveDto {
	
	private Long userId;
	private String leaveTypeName;
	private String reason;
	private LocalDate fromDate;
	private LocalDate toDate;
	private int noOfDays;
	
	private Long LeaveNum;
	
	
	
	
	public Long getLeaveNum() {
		return LeaveNum;
	}
	public void setLeaveNum(Long leaveNum) {
		LeaveNum = leaveNum;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getLeaveTypeName() {
		return leaveTypeName;
	}
	public void setLeaveTypeName(String leaveTypeName) {
		this.leaveTypeName = leaveTypeName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	

}
