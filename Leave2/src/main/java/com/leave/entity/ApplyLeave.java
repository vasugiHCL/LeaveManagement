package com.leave.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplyLeave implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long leaveId;
	private Long userId;
	private String leaveTypeName;
	private String reason;
	private LocalDate fromDate;
	private LocalDate toDate;
	private int noOfDays;
	
	public ApplyLeave(Long userId, String leaveTypeName, String reason, LocalDate fromDate, LocalDate toDate,
			int noOfDays) {
		super();
		this.userId = userId;
		this.leaveTypeName = leaveTypeName;
		this.reason = reason;
		this.fromDate = LocalDate.now();
		this.toDate = LocalDate.now();
		this.noOfDays = noOfDays;
	}

	public Long getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(Long leaveId) {
		this.leaveId = leaveId;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ApplyLeave() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
