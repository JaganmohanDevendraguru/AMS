package com.sse.model;

public class DegreeMajor {
	private int catId;
	private String levelId;
	private String majorCode;
	private String major;
	private int degreeId;

	public DegreeMajor() {
		super();
	}

	public DegreeMajor(int catId, String levelId, String major, int degreeId) {
		super();
		this.catId = catId;
		this.levelId = levelId;
		this.major = major;
		this.degreeId = degreeId;
	}

	public DegreeMajor(int catId, String levelId, String majorCode, String major, int degreeId) {
		super();
		this.catId = catId;
		this.levelId = levelId;
		this.majorCode = majorCode;
		this.major = major;
		this.degreeId = degreeId;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getLevelId() {
		return levelId;
	}

	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}

	public int getDegreeId() {
		return degreeId;
	}

	public void setDegreeId(int degreeId) {
		this.degreeId = degreeId;
	}

	public String getMajorCode() {
		return majorCode;
	}

	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "DegreeMajor [catId=" + catId + ", levelId=" + levelId + ", majorCode=" + majorCode + ", major=" + major
				+ ", degreeId=" + degreeId + "]";
	}
}
