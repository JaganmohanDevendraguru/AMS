package com.sse.model;

public class DegreeMajor {
	private String majorCode;
	private String major;
	
	public DegreeMajor(){
		super();
	}
	
	public DegreeMajor(String major){
		super();
		this.major = major;
	}
	
	public DegreeMajor(String majorCode, String major){
		super();
		this.majorCode = majorCode;
		this.major = major;
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
		return "DegreeMajor [majorCode=" + majorCode + ", major=" + major + "]";
	}	
}
