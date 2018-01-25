package com.model;

public class data_device_relation {
	private int ddr_id;
	private String device_hw_type;
	private String 	device_hw_ver;
	private String 	device_sw_ver;
	private String 	data_tab_name;
	
	
	public data_device_relation (int ddr_id) {
		this.ddr_id=ddr_id;
		
		this.device_hw_type=null;
		this.device_hw_ver=null;
		this.device_sw_ver=null;
		this.data_tab_name=null;
		
	}


	public int getDdr_id() {
		return ddr_id;
	}


	public void setDdr_id(int ddr_id) {
		this.ddr_id = ddr_id;
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


	public String getData_tab_name() {
		return data_tab_name;
	}


	public void setData_tab_name(String data_tab_name) {
		this.data_tab_name = data_tab_name;
	}
}
