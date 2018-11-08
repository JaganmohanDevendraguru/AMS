package com.sse.model;

public class Course {
	private String courseCode;
	private String level;
	private int hours;
	private String title;
	private int credits;
	private String description;
	
	public Course() {
		super();
	}
	
	public Course(String level, int hours, String title, int credits, String description) {
		super();
		this.level = level;
		this.hours = hours;
		this.title = title;
		this.credits = credits;
		this.description = description;
	}
	
	public Course(String courseCode, String level, int hours, String title, int credits, String description) {
		super();
		this.courseCode = courseCode;
		this.level = level;
		this.hours = hours;
		this.title = title;
		this.credits = credits;
		this.description = description;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", level=" + level + ", hours=" + hours + ", title=" + title
				+ ", credits=" + credits + ", description=" + description + "]";
	}
}
