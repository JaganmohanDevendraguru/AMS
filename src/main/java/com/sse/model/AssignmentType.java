package com.sse.model;

public class AssignmentType {
	private String assignmentType;
	private String description;
	
	public AssignmentType() {
		super();
	}
	
	public AssignmentType(String description) {
		super();
		this.description = description;
	}
	
	public AssignmentType(String assignmentType, String description) {
		super();
		this.assignmentType = assignmentType;
		this.description = description;
	}
	public String getAssignmentType() {
		return assignmentType;
	}
	public void setAssignmentType(String assignmentType) {
		this.assignmentType = assignmentType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AssignmentType [assignmentType=" + assignmentType + ", description=" + description + "]";
	}
}
