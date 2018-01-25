package com.model;

import java.sql.Date;

public class device_basic_info {
	private int info_id;
	private int device_id;
	private String device_name;
	private String device_type_name;
	private String device_serial_number;
	private String device_position;
	private String device_manufacturer;
	private String device_telephone;
	private String device_contacts;
	private Date device_manufacture_date;
	private Date device_start_time;
	private int device_designed_life;
	
	
	private  device_basic_info(int info_id) {
		this.info_id=info_id;
		
		this.device_id=(Integer) null;
		this.device_name=null;
		this.device_type_name=null;
		this.device_serial_number=null;
		this.device_position=null;
		this.device_manufacturer=null;
		this.device_telephone=null;
		this.device_contacts=null;
		this.device_manufacture_date=null;
		this.device_start_time=null;
		this.device_designed_life=(Integer) null;
	
		
		
	}


	public int getInfo_id() {
		return info_id;
	}


	public void setInfo_id(int info_id) {
		this.info_id = info_id;
	}


	public int getDevice_id() {
		return device_id;
	}


	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}


	public String getDevice_name() {
		return device_name;
	}


	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}


	public String getDevice_type_name() {
		return device_type_name;
	}


	public void setDevice_type_name(String device_type_name) {
		this.device_type_name = device_type_name;
	}


	public String getDevice_serial_number() {
		return device_serial_number;
	}


	public void setDevice_serial_number(String device_serial_number) {
		this.device_serial_number = device_serial_number;
	}


	public String getDevice_position() {
		return device_position;
	}


	public void setDevice_position(String device_position) {
		this.device_position = device_position;
	}


	public String getDevice_manufacturer() {
		return device_manufacturer;
	}


	public void setDevice_manufacturer(String device_manufacturer) {
		this.device_manufacturer = device_manufacturer;
	}


	public String getDevice_telephone() {
		return device_telephone;
	}


	public void setDevice_telephone(String device_telephone) {
		this.device_telephone = device_telephone;
	}


	public String getDevice_contacts() {
		return device_contacts;
	}


	public void setDevice_contacts(String device_contacts) {
		this.device_contacts = device_contacts;
	}


	public Date getDevice_manufacture_date() {
		return device_manufacture_date;
	}


	public void setDevice_manufacture_date(Date device_manufacture_date) {
		this.device_manufacture_date = device_manufacture_date;
	}


	public Date getDevice_start_time() {
		return device_start_time;
	}


	public void setDevice_start_time(Date device_start_time) {
		this.device_start_time = device_start_time;
	}


	public int getDevice_designed_life() {
		return device_designed_life;
	}


	public void setDevice_designed_life(int device_designed_life) {
		this.device_designed_life = device_designed_life;
	}
	
}
