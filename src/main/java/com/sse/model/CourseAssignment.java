package com.sse.model;

public class CourseAssignment {
	private String assignmentType;
	private String courseCode;
	private double markPerAssign;
	private int numOfAssign;
	private double tot;
	
	public CourseAssignment(double markPerAssign, int numOfAssign, double tot) {
		super();
		this.markPerAssign = markPerAssign;
		this.numOfAssign = numOfAssign;
		this.tot = tot;
	}
	
	public CourseAssignment() {
		super();
	}
	
	public CourseAssignment(String assignmentType, String courseCode, double markPerAssign, int numOfAssign, double tot) {
		super();
		this.assignmentType = assignmentType;
		this.courseCode = courseCode;
		this.markPerAssign = markPerAssign;
		this.numOfAssign = numOfAssign;
		this.tot = tot;
	}

	public String getAssignmentType() {
		return assignmentType;
	}

	public void setAssignmentType(String assignmentType) {
		this.assignmentType = assignmentType;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public double getMarkPerAssign() {
		return markPerAssign;
	}

	public void setMarkPerAssign(double markPerAssign) {
		this.markPerAssign = markPerAssign;
	}

	public int getNumOfAssign() {
		return numOfAssign;
	}

	public void setNumOfAssign(int numOfAssign) {
		this.numOfAssign = numOfAssign;
	}

	public double getTot() {
		return tot;
	}

	public void setTot(double tot) {
		this.tot = tot;
	}

	@Override
	public String toString() {
		return "CourseAssignment [assignmentType=" + assignmentType + ", courseCode=" + courseCode + ", markPerAssign="
				+ markPerAssign + ", numOfAssign=" + numOfAssign + ", tot=" + tot + "]";
	}
}
