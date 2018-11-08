package com.sse.model;

public class DegreeLevel {
	private String levelId;
	private String desc;
	
	public DegreeLevel(){
		super();
	}
	
	public DegreeLevel(String desc){
		super();
		this.desc = desc;
	}
	
	public DegreeLevel(String levelId, String desc){
		super();
		this.levelId = levelId;
		this.desc = desc;
	}

	public String getLevelId() {
		return levelId;
	}

	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "DegreeLevel [levelId=" + levelId + ", desc=" + desc + "]";
	}
		
}
