package com.sse.model;

public class EmpType {
	private String empType;
	private String typeDesc;
	
	public EmpType() {
		super();
	}
	
	public EmpType(String typeDesc) {
		super();
		this.typeDesc = typeDesc;
	}
	
	public EmpType(String empType, String typeDesc) {
		super();
		this.empType = empType;
		this.typeDesc = typeDesc;
	}

	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	@Override
	public String toString() {
		return "empType [empType=" + empType + ", typeDesc=" + typeDesc + "]";
	}
}
