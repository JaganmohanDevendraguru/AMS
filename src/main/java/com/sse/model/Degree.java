package com.sse.model;

import java.util.Date;

public class Degree {
	private int degreeId;
	private String degreeCode;
	private String degreeName;
	private Date createDate;
	
	public Degree() {
		super();
	}
	
	public Degree(int degreeId, String degreeCode, String degreeName, Date createDate) {
		super();
		this.degreeCode = degreeCode;
		this.degreeName = degreeName;
		this.createDate = createDate;
	}
	
	public int getDegreeId() {
		return degreeId;
	}
	public void setDegreeId(int degreeId) {
		this.degreeId = degreeId;
	}
	public String getDegreeCode() {
		return degreeCode;
	}
	public void setDegreeCode(String degreeCode) {
		this.degreeCode = degreeCode;
	}
	public String getDegreeName() {
		return degreeName;
	}
	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return "Degree [degreeId=" + degreeId + ", degreeCode=" + degreeCode + ", degreeName=" + degreeName
				+ ", createDate=" + createDate + "]";
	}
	
}
