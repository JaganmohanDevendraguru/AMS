package com.sse.model;

public class DegreeCategory {
	private int catId;
	private String category;
	
	public DegreeCategory() {
		super();
	}
	
	public DegreeCategory(int catId, String category) {
		super();
		this.category = category;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "DegreeCategory [catId=" + catId + ", category=" + category + "]";
	}
}
