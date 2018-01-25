package com.model;


public class schedule_device_relation {
	private int sdr_id;
	private int schedule_id;
	private int device_id;
	private String device_hw_address;
	private String device_hw_subaddress;
	private String device_serial_number;
	private String device_name;
	
	public  schedule_device_relation(int sdr_id) {
		this.sdr_id= sdr_id;
		this.schedule_id=(Integer) null;
		this.device_id=(Integer) null;
		this.device_hw_address=null;
		this.device_hw_subaddress=null;
		this.device_serial_number=null;
		this.device_name=null;
	}

	public int getSdr_id() {
		return sdr_id;
	}

	public void setSdr_id(int sdr_id) {
		this.sdr_id = sdr_id;
	}

	public int getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
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

	public String getDevice_serial_number() {
		return device_serial_number;
	}

	public void setDevice_serial_number(String device_serial_number) {
		this.device_serial_number = device_serial_number;
	}

	public String getDevice_name() {
		return device_name;
	}

	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}
}
