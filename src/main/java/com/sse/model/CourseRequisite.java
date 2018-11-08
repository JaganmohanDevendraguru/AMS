package com.sse.model;

public class CourseRequisite {
	private String courseCode;
	private String requisiteCode;
	
	public CourseRequisite() {
		super();
	}
	
	public CourseRequisite(String requisiteCode) {
		super();
		this.requisiteCode = requisiteCode;
	}
	
	public CourseRequisite(String requisiteCode, String courseCode) {
		super();
		this.courseCode = courseCode;
		this.requisiteCode = requisiteCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getRequisiteCode() {
		return requisiteCode;
	}

	public void setRequisiteCode(String requisiteCode) {
		this.requisiteCode = requisiteCode;
	}

	@Override
	public String toString() {
		return "CourseRequisite [courseCode=" + courseCode + ", requisiteCode=" + requisiteCode + "]";
	}
	
}
