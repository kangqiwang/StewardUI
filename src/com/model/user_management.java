package com.model;

public class user_management {
	private int user_id;
	private String user_name;
	private String user_password;
	private String user_types;
	private user_permission user_permissions;
	
	public  user_management(int user_id) {
		this.user_id=user_id;
		this.user_name=null;
		this.user_password=null;
		this.user_types=null;
		this.user_permissions=user_permission.general;
				
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_types() {
		return user_types;
	}

	public void setUser_types(String user_types) {
		this.user_types = user_types;
	}

	public user_permission getUser_permissions() {
		return user_permissions;
	}

	public void setUser_permissions(user_permission user_permissions) {
		this.user_permissions = user_permissions;
	}
}
