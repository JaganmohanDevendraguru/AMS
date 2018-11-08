package com.sse.model;

public class CourseSchedule {
	private String semesterCode;
	private String courseCode;
	private int professor;
	private String dayOfWeek;
	private String building;
	private String lectureHall;
	private String startTime;
	private String endTime;
	
	public CourseSchedule() {
		super();
	}
	
	public CourseSchedule(String building,
			String lectureHall, String startTime, String endTime) {
		super();
		this.building = building;
		this.lectureHall = lectureHall;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public CourseSchedule(String semesterCode, String courseCode, int professor, String dayOfWeek, String building,
			String lectureHall, String startTime, String endTime) {
		super();
		this.semesterCode = semesterCode;
		this.courseCode = courseCode;
		this.professor = professor;
		this.dayOfWeek = dayOfWeek;
		this.building = building;
		this.lectureHall = lectureHall;
		this.startTime = startTime;
		this.endTime = endTime;
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
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getLectureHall() {
		return lectureHall;
	}
	public void setLectureHall(String lectureHall) {
		this.lectureHall = lectureHall;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "CourseSchedule [semesterCode=" + semesterCode + ", courseCode=" + courseCode + ", professor="
				+ professor + ", dayOfWeek=" + dayOfWeek + ", building=" + building + ", lectureHall=" + lectureHall
				+ ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
}
