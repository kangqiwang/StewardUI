package com.model;

public class device_status {
	private int device_id;
	private String device_read_status;
	private String device_write_status;
	private int device_write_ischange;
	
	public  device_status(int device_id) {
		this.device_id=device_id;
		this.device_read_status=null;
		this.device_write_status=null;
		this.device_write_ischange=(Integer) null;
	}

	public int getDevice_id() {
		return device_id;
	}

	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}

	public String getDevice_read_status() {
		return device_read_status;
	}

	public void setDevice_read_status(String device_read_status) {
		this.device_read_status = device_read_status;
	}

	public String getDevice_write_status() {
		return device_write_status;
	}

	public void setDevice_write_status(String device_write_status) {
		this.device_write_status = device_write_status;
	}

	public int getDevice_write_ischange() {
		return device_write_ischange;
	}

	public void setDevice_write_ischange(int device_write_ischange) {
		this.device_write_ischange = device_write_ischange;
	}
	
}
