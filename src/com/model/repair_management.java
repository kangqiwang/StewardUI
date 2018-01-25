package com.model;

import java.sql.Date;

public class repair_management {
	private int repair_id;
	private int device_id;
	private String device_serial_number;
	private String device_name;
	private Date repair_time;
	private String repair_position;
	private String repairman;
	private String property_staff;
	private Date last_repair_time;
	private String repair_cause;
	private String fills;
	
	public String getRepairman() {
		return repairman;
	}

	public void setRepairman(String repairman) {
		this.repairman = repairman;
	}

//	public  repair_management(int repair_id) {
//		this.repair_id=repair_id;
//		
//		this.device_id=(Integer) null;
//		this.device_serial_number=null;
//		this.device_name=null;
//		this.repair_time=null;
//		this.repair_position=null;
//		this.property_staff=null;
//		this.last_repair_time=null;
//		this.repair_cause=null;
//		this.fills=null;
//	}

	public int getRepair_id() {
		return repair_id;
	}

	public void setRepair_id(int repair_id) {
		this.repair_id = repair_id;
	}

	public int getDevice_id() {
		return device_id;
	}

	public void setDevice_id(int device_id) {
		this.device_id = device_id;
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

	public Date getRepair_time() {
		return repair_time;
	}

	public void setRepair_time(Date repair_time) {
		this.repair_time = repair_time;
	}

	public String getRepair_position() {
		return repair_position;
	}

	public void setRepair_position(String repair_position) {
		this.repair_position = repair_position;
	}

	public String getProperty_staff() {
		return property_staff;
	}

	public void setProperty_staff(String property_staff) {
		this.property_staff = property_staff;
	}

	public Date getLast_repair_time() {
		return last_repair_time;
	}

	public void setLast_repair_time(Date last_repair_time) {
		this.last_repair_time = last_repair_time;
	}

	public String getRepair_cause() {
		return repair_cause;
	}

	public void setRepair_cause(String repair_cause) {
		this.repair_cause = repair_cause;
	}

	public String getFills() {
		return fills;
	}

	public void setFills(String fills) {
		this.fills = fills;
	}
}
