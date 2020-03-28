package com.leave.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeaveType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long leaveTypeId;
	private Long userId;
	private int annualHoliday;
	private int restrictedHoliday;
	private int totalLeaveDays;
	private int availableLeaveDays;
	
	public LeaveType(Long userId, int annualHoliday, int restrictedHoliday, int totalLeaveDays,
			int availableLeaveDays) {
		super();
		this.userId = userId;
		this.annualHoliday = annualHoliday;
		this.restrictedHoliday = restrictedHoliday;
		this.totalLeaveDays = totalLeaveDays;
		this.availableLeaveDays = availableLeaveDays;
	}

	
	
	public Long getLeaveTypeId() {
		return leaveTypeId;
	}



	public void setLeaveTypeId(Long leaveTypeId) {
		this.leaveTypeId = leaveTypeId;
	}



	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public int getAnnualHoliday() {
		return annualHoliday;
	}



	public void setAnnualHoliday(int annualHoliday) {
		this.annualHoliday = annualHoliday;
	}



	public int getRestrictedHoliday() {
		return restrictedHoliday;
	}



	public void setRestrictedHoliday(int restrictedHoliday) {
		this.restrictedHoliday = restrictedHoliday;
	}



	public int getTotalLeaveDays() {
		return totalLeaveDays;
	}



	public void setTotalLeaveDays(int totalLeaveDays) {
		this.totalLeaveDays = totalLeaveDays;
	}



	public int getAvailableLeaveDays() {
		return availableLeaveDays;
	}



	public void setAvailableLeaveDays(int availableLeaveDays) {
		this.availableLeaveDays = availableLeaveDays;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public LeaveType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
