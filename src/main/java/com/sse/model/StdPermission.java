package com.sse.model;

import java.util.Date;

public class StdPermission {
	private String permissionId;
	private String desc;
	private Date lastUpdate;
	private int lastUser;
	
	public StdPermission() {
		super();
	}
	
	public StdPermission(String desc, Date lastUpdate, int lastUser) {
		super();
		this.desc = desc;
		this.lastUpdate = lastUpdate;
		this.lastUser = lastUser;
	}
	
	public StdPermission(String permissionId, String desc, Date lastUpdate, int lastUser) {
		super();
		this.permissionId = permissionId;
		this.desc = desc;
		this.lastUpdate = lastUpdate;
		this.lastUser = lastUser;
	}
	
	public String getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public int getLastUser() {
		return lastUser;
	}
	public void setLastUser(int lastUser) {
		this.lastUser = lastUser;
	}
	@Override
	public String toString() {
		return "StdPermission [permissionId=" + permissionId + ", desc=" + desc + ", lastUpdate=" + lastUpdate
				+ ", lastUser=" + lastUser + "]";
	}
}
