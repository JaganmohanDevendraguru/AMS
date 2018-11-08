package com.sse.model;

public class EmpProfile {
	private String empProfileId;
	private String title;
	
	public EmpProfile(){
		super();
	}
	
	public EmpProfile(String title){
		super();
		this.title = title;
	}
	
	public EmpProfile(String profileId, String title){
		super();
		this.empProfileId = profileId;
		this.title = title;
	}

	public String getEmpProfileId() {
		return empProfileId;
	}

	public void setEmpProfileId(String empProfileId) {
		this.empProfileId = empProfileId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "empProfile [empProfileId=" + empProfileId + ", title=" + title + "]";
	}
	
	
		
}
