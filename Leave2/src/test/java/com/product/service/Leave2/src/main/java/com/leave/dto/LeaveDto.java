package com.leave.dto;

public class LeaveDto {
	
	private Long userId;
	private int annualHoliday;
	private int restrictedHoliday;
	private int totalLeaveDays;
	private int availableLeaveDays;
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
	
	

}
