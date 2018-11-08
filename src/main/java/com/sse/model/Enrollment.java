package com.sse.model;

public class Enrollment {
	private int studentId;
	private String semesterCode;
	private String courseCode;
	private int professor;
	private String assignType;
	private String dayOfWeek;
	private int instanceNo;
	private double markEarned;
	private String gradeEarned;
	private double gpaEarned;
	private String status;
	private String notes;
	
	public Enrollment() {
		super();
	}

	public Enrollment(int instanceNo, double markEarned, String gradeEarned, double gpaEarned, String status,
			String notes) {
		super();
		this.instanceNo = instanceNo;
		this.markEarned = markEarned;
		this.gradeEarned = gradeEarned;
		this.gpaEarned = gpaEarned;
		this.status = status;
		this.notes = notes;
	}
	
	public Enrollment(int studentId, String semesterCode, String courseCode, int professor, String assignType,
			String dayOfWeek, int instanceNo, double markEarned, String gradeEarned, double gpaEarned, String status,
			String notes) {
		super();
		this.studentId = studentId;
		this.semesterCode = semesterCode;
		this.courseCode = courseCode;
		this.professor = professor;
		this.assignType = assignType;
		this.dayOfWeek = dayOfWeek;
		this.instanceNo = instanceNo;
		this.markEarned = markEarned;
		this.gradeEarned = gradeEarned;
		this.gpaEarned = gpaEarned;
		this.status = status;
		this.notes = notes;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSemesterCode() {
		return semesterCode;
	}

	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getProfessor() {
		return professor;
	}

	public void setProfessor(int professor) {
		this.professor = professor;
	}

	public String getAssignType() {
		return assignType;
	}

	public void setAssignType(String assignType) {
		this.assignType = assignType;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public int getInstanceNo() {
		return instanceNo;
	}

	public void setInstanceNo(int instanceNo) {
		this.instanceNo = instanceNo;
	}

	public double getMarkEarned() {
		return markEarned;
	}

	public void setMarkEarned(double markEarned) {
		this.markEarned = markEarned;
	}

	public String getGradeEarned() {
		return gradeEarned;
	}

	public void setGradeEarned(String gradeEarned) {
		this.gradeEarned = gradeEarned;
	}

	public double getGpaEarned() {
		return gpaEarned;
	}

	public void setGpaEarned(double gpaEarned) {
		this.gpaEarned = gpaEarned;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Enrollment [studentId=" + studentId + ", semesterCode=" + semesterCode + ", courseCode=" + courseCode
				+ ", professor=" + professor + ", assignType=" + assignType + ", dayOfWeek=" + dayOfWeek
				+ ", instanceNo=" + instanceNo + ", markEarned=" + markEarned + ", gradeEarned=" + gradeEarned
				+ ", gpaEarned=" + gpaEarned + ", status=" + status + ", notes=" + notes + "]";
	}
	
}
