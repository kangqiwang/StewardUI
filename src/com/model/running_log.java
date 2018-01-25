package com.model;
import java.sql.Date;

public class running_log {
	private int log_id;
	private String log_type;//enum
	
	private String log_message;
	private Date log_time;
	private int device_id;
	private String log_disposal;
	private int user_id;
	private String user_type;//enum
	
//	public  running_log(String log_id) {
//		this.log_id=log_id;
//		this.log_types=log_type.operation;
//		this.log_message=null;
//		this.log_time=null;
//		this.device_id=(Integer) null;
//		this.log_disposal=null;
//		this.user_id=(Integer) null;
//		this.user_types=user_type.local;
//		
//	}

	public int getLog_id() {
		return log_id;
	}

	public void setLog_id(int log_id) {
		this.log_id = log_id;
	}

	public String getLog_type() {
		return log_type;
	}

	public void setLog_type(String log_type) {
		this.log_type = log_type;
	}

	public String getLog_message() {
		return log_message;
	}

	public void setLog_message(String log_message) {
		this.log_message = log_message;
	}

	public Date getLog_time() {
		return log_time;
	}

	public void setLog_time(Date log_time) {
		this.log_time = log_time;
	}

	public int getDevice_id() {
		return device_id;
	}

	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}

	public String getLog_disposal() {
		return log_disposal;
	}

	public void setLog_disposal(String log_disposal) {
		this.log_disposal = log_disposal;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
}
