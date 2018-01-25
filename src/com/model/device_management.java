package com.model;

public class device_management {
	private int device_id;
	private String device_hw_address;
	private String device_hw_subaddress;
	private String device_hw_type;
	private String device_hw_ver;
	private String device_sw_ver;
	private String device_terminal_pws;
	private int device_validity;
	
	public  device_management(int device_id) {
		this.device_id=device_id;
		this.device_hw_address=null;
		this.device_hw_subaddress=null;
		this.device_hw_type=null;
		this.device_hw_ver=null;
		this.device_sw_ver=null;
		this.device_terminal_pws=null;
		this.device_validity=(Integer) null;
	}

	public int getDevice_id() {
		return device_id;
	}

	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}

	public String getDevice_hw_address() {
		return device_hw_address;
	}

	public void setDevice_hw_address(String device_hw_address) {
		this.device_hw_address = device_hw_address;
	}

	public String getDevice_hw_subaddress() {
		return device_hw_subaddress;
	}

	public void setDevice_hw_subaddress(String device_hw_subaddress) {
		this.device_hw_subaddress = device_hw_subaddress;
	}

	public String getDevice_hw_type() {
		return device_hw_type;
	}

	public void setDevice_hw_type(String device_hw_type) {
		this.device_hw_type = device_hw_type;
	}

	public String getDevice_hw_ver() {
		return device_hw_ver;
	}

	public void setDevice_hw_ver(String device_hw_ver) {
		this.device_hw_ver = device_hw_ver;
	}

	public String getDevice_sw_ver() {
		return device_sw_ver;
	}

	public void setDevice_sw_ver(String device_sw_ver) {
		this.device_sw_ver = device_sw_ver;
	}

	public String getDevice_terminal_pws() {
		return device_terminal_pws;
	}

	public void setDevice_terminal_pws(String device_terminal_pws) {
		this.device_terminal_pws = device_terminal_pws;
	}

	public int getDevice_validity() {
		return device_validity;
	}

	public void setDevice_validity(int device_validity) {
		this.device_validity = device_validity;
	}
}
