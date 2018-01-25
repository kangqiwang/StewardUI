package com.model;

import java.sql.Date;

public class data_runtime_DrainagePump {
	private int data_id;
	private int device_id;
	private Date device_time;	
	private int total_working_time;
	private int swap_working_time;
	private int working_time;
	private int total_energy_consumption;
	private float water_height;
	private float temperature;
	private float dynamic_a_phase_current;
	private float dynamic_b_phase_current;
	private float dynamic_c_phase_current;
	private float dynamic_a_phase_voltage;
	private float dynamic_b_phase_voltage;
	private float dynamic_c_phase_voltage;
	private String device_type;
	private String device_position;
	
//	public  data_runtime_DrainagePump(int data_id) {
//		this.data_id=data_id;
//		this.device_id=(Integer) null;
//		this.device_time=null;
//		this.total_working_time=(Integer) null;
//		this.swap_working_time=(Integer) null;
//		this.working_time=(Integer) null;
//		this.total_energy_consumption=(Integer) null;
//		this.water_height=(Float) null;
//		this.temperature=(Float) null;
//		this.dynamic_a_phase_current=(Float) null;
//		this.dynamic_b_phase_current=(Float) null;
//		this.dynamic_c_phase_current=(Float) null;
//		this.dynamic_a_phase_voltage=(Float) null;
//		this.dynamic_b_phase_voltage=(Float) null;
//		this.dynamic_c_phase_voltage=(Float) null;
//	}

	public String getDevice_type() {
		return device_type;
	}

	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}

	public String getDevice_position() {
		return device_position;
	}

	public void setDevice_position(String device_position) {
		this.device_position = device_position;
	}

	public int getData_id() {
		return data_id;
	}

	public void setData_id(int data_id) {
		this.data_id = data_id;
	}

	public int getDevice_id() {
		return device_id;
	}

	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}

	public Date getDevice_time() {
		return device_time;
	}

	public void setDevice_time(Date device_time) {
		this.device_time = device_time;
	}

	public int getTotal_working_time() {
		return total_working_time;
	}

	public void setTotal_working_time(int total_working_time) {
		this.total_working_time = total_working_time;
	}

	public int getSwap_working_time() {
		return swap_working_time;
	}

	public void setSwap_working_time(int swap_working_time) {
		this.swap_working_time = swap_working_time;
	}

	public int getWorking_time() {
		return working_time;
	}

	public void setWorking_time(int working_time) {
		this.working_time = working_time;
	}

	public int getTotal_energy_consumption() {
		return total_energy_consumption;
	}

	public void setTotal_energy_consumption(int total_energy_consumption) {
		this.total_energy_consumption = total_energy_consumption;
	}

	public float getWater_height() {
		return water_height;
	}

	public void setWater_height(float water_height) {
		this.water_height = water_height;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getDynamic_a_phase_current() {
		return dynamic_a_phase_current;
	}

	public void setDynamic_a_phase_current(float dynamic_a_phase_current) {
		this.dynamic_a_phase_current = dynamic_a_phase_current;
	}

	public float getDynamic_b_phase_current() {
		return dynamic_b_phase_current;
	}

	public void setDynamic_b_phase_current(float dynamic_b_phase_current) {
		this.dynamic_b_phase_current = dynamic_b_phase_current;
	}

	public float getDynamic_c_phase_current() {
		return dynamic_c_phase_current;
	}

	public void setDynamic_c_phase_current(float dynamic_c_phase_current) {
		this.dynamic_c_phase_current = dynamic_c_phase_current;
	}

	public float getDynamic_a_phase_voltage() {
		return dynamic_a_phase_voltage;
	}

	public void setDynamic_a_phase_voltage(float dynamic_a_phase_voltage) {
		this.dynamic_a_phase_voltage = dynamic_a_phase_voltage;
	}

	public float getDynamic_b_phase_voltage() {
		return dynamic_b_phase_voltage;
	}

	public void setDynamic_b_phase_voltage(float dynamic_b_phase_voltage) {
		this.dynamic_b_phase_voltage = dynamic_b_phase_voltage;
	}

	public float getDynamic_c_phase_voltage() {
		return dynamic_c_phase_voltage;
	}

	public void setDynamic_c_phase_voltage(float dynamic_c_phase_voltage) {
		this.dynamic_c_phase_voltage = dynamic_c_phase_voltage;
	}
	 
}
