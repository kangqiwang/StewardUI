package com.model;

import java.sql.Time;

public class schedule_cycle {
	private int cycle_id;
	private int schedule_id;
	private Time period_start_time;
	private Time period_end_time;
	private String device_type;
	

	public Time getPeriod_start_time() {
		return period_start_time;
	}

	public Time getPeriod_end_time() {
		return period_end_time;
	}

	public String getDevice_type() {
		return device_type;
	}

	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}

	public void setPeriod_start_time(Time period_start_time) {
		this.period_start_time = period_start_time;
	}

	public void setPeriod_end_time(Time period_end_time) {
		this.period_end_time = period_end_time;
	}

	public int getCycle_id() {
		return cycle_id;
	}

	public void setCycle_id(int cycle_id) {
		this.cycle_id = cycle_id;
	}

	public int getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}


}
