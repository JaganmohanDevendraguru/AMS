package com.sse.model;

import java.util.Date;

public class Semester {
	private String semeCode;
	private String level;
	private int year;
	private String desc;
	private Date startDate;
	private Date endDate;
	
	public Semester() {
		super();
	}
	
	public Semester(String level, int year, String desc, Date startDate, Date endDate) {
		super();
		this.level = level;
		this.year = year;
		this.desc = desc;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Semester(String semeCode, String level, int year, String desc, Date startDate, Date endDate) {
		super();
		this.semeCode = semeCode;
		this.level = level;
		this.year = year;
		this.desc = desc;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String getSemeCode() {
		return semeCode;
	}
	public void setSemeCode(String semeCode) {
		this.semeCode = semeCode;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Semester [semeCode=" + semeCode + ", level=" + level + ", year=" + year + ", desc=" + desc
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
}
