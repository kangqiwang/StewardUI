package com.model;

import java.sql.Date;
import java.sql.Time;

public class schedule {
	private int schedule_id;
	private String schedule_name;
	private Date schedule_start_date;
	private Time schedule_start_time;
	private Date schedule_stop_date;
	private Time schedule_stop_time;
	private String task_type;
	private String device_position;
	private String operator;
	private int device_id;
	private String device_type;
	
	public String getDevice_type() {
		return device_type;
	}

	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}

	public Time getSchedule_start_time() {
		return schedule_start_time;
	}

	public void setSchedule_start_time(Time schedule_start_time) {
		this.schedule_start_time = schedule_start_time;
	}

	public Time getSchedule_stop_time() {
		return schedule_stop_time;
	}

	public void setSchedule_stop_time(Time schedule_stop_time) {
		this.schedule_stop_time = schedule_stop_time;
	}

	public Date getSchedule_stop_date() {
		return schedule_stop_date;
	}

	public void setSchedule_stop_date(Date schedule_stop_date) {
		this.schedule_stop_date = schedule_stop_date;
	}

	public String getTask_type() {
		return task_type;
	}

	public void setTask_type(String task_typeString) {
		this.task_type = task_typeString;
	}

	public String getDevice_position() {
		return device_position;
	}

	public void setDevice_position(String device_position) {
		this.device_position = device_position;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operatorString) {
		this.operator = operatorString;
	}

	public int getDevice_id() {
		return device_id;
	}

	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}

	public int getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}

	public String getSchedule_name() {
		return schedule_name;
	}

	public void setSchedule_name(String schedule_name) {
		this.schedule_name = schedule_name;
	}

	public Date getSchedule_start_date() {
		return schedule_start_date;
	}

	public void setSchedule_start_date(Date schedule_start_date) {
		this.schedule_start_date = schedule_start_date;
	}

	public Date getSchedule_end_date() {
		return schedule_stop_date;
	}

	public void setSchedule_end_date(Date schedule_end_date) {
		this.schedule_stop_date = schedule_end_date;
	}
	
}
