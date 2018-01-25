package com.model;

public class data_parameter_DrainagePump {
	private int info_id;
	private int device_id;
	private String device_position;
	private String device_type_name;
	private int device_ids;
	private String repaired;
	private int overcurrent_alert_threshold;
	private int overvoltage_alert_threshold;
	private int undervoltage_alert_threshold;
	private int overcurrent_stop_threshold;
	private int overvoltage_stop_threshold;
	private int undervoltage_stop_threshold;
	private String start;
	private String stop;
	private String normal;
	private String abnormal;
	private String pump_temperature_alert_threshold;
	private float pump_temperature_stop_threshold;
	private float pump_water_height_stop;
	private float pump_water_height_start;
	
	
//	public  data_parameter_DrainagePump() {
//		this.info_id=(Integer) null;
//		this.device_id=(Integer)null;
//		this.device_position=null;
//		this.device_type_name=null;
//		this.overcurrent_alert_threshold=(Integer) null;
//		this.overvoltage_alert_threshold=(Integer) null;
//		this.undervoltage_alert_threshold=(Integer) null;
//		this.overcurrent_stop_threshold=(Integer) null;
//		this.overvoltage_stop_threshold=(Integer) null;
//		this.undervoltage_stop_threshold=(Integer) null;
//		this.pump_temperature_alert_threshold=(String) null;
//		this.pump_temperature_stop_threshold=(Float) null;
//		this.pump_water_height_stop=(Float) null;
//		this.pump_water_height_start=(Float) null;
//		
//	}


	public int getOvercurrent_alert_threshold() {
		return overcurrent_alert_threshold;
	}


	public void setOvercurrent_alert_threshold(int overcurrent_alert_threshold) {
		this.overcurrent_alert_threshold = overcurrent_alert_threshold;
	}


	public int getOvervoltage_alert_threshold() {
		return overvoltage_alert_threshold;
	}


	public void setOvervoltage_alert_threshold(int overvoltage_alert_threshold) {
		this.overvoltage_alert_threshold = overvoltage_alert_threshold;
	}


	public int getUndervoltage_alert_threshold() {
		return undervoltage_alert_threshold;
	}


	public void setUndervoltage_alert_threshold(int undervoltage_alert_threshold) {
		this.undervoltage_alert_threshold = undervoltage_alert_threshold;
	}


	public int getOvercurrent_stop_threshold() {
		return overcurrent_stop_threshold;
	}


	public void setOvercurrent_stop_threshold(int overcurrent_stop_threshold) {
		this.overcurrent_stop_threshold = overcurrent_stop_threshold;
	}


	public int getOvervoltage_stop_threshold() {
		return overvoltage_stop_threshold;
	}


	public void setOvervoltage_stop_threshold(int overvoltage_stop_threshold) {
		this.overvoltage_stop_threshold = overvoltage_stop_threshold;
	}


	public int getUndervoltage_stop_threshold() {
		return undervoltage_stop_threshold;
	}


	public void setUndervoltage_stop_threshold(int undervoltage_stop_threshold) {
		this.undervoltage_stop_threshold = undervoltage_stop_threshold;
	}


	public int getDevice_ids() {
		return device_ids;
	}


	public void setDevice_ids(int device_ids) {
		this.device_ids = device_ids;
	}


	public String getRepaired() {
		return repaired;
	}


	public void setRepaired(String repaired) {
		this.repaired = repaired;
	}


	public String getStart() {
		return start;
	}


	public void setStart(String start) {
		this.start = start;
	}


	public String getStop() {
		return stop;
	}


	public void setStop(String stop) {
		this.stop = stop;
	}


	public String getNormal() {
		return normal;
	}


	public void setNormal(String normal) {
		this.normal = normal;
	}


	public String getAbnormal() {
		return abnormal;
	}


	public void setAbnormal(String abnormal) {
		this.abnormal = abnormal;
	}


	public int getInfo_id() {
		return info_id;
	}


	public void setInfo_id(int info_id) {
		this.info_id = info_id;
	}


	public String getDevice_position() {
		return device_position;
	}


	public void setDevice_position(String device_position) {
		this.device_position = device_position;
	}


	public String getDevice_type_name() {
		return device_type_name;
	}


	public void setDevice_type_name(String device_type_name) {
		this.device_type_name = device_type_name;
	}


	public int getDevice_id() {
		return device_id;
	}


	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}


//	public int getOvercurrent_alert_threshold() {
//		return overcurrent_alert_threshold;
//	}
//
//
//	public void setOvercurrent_alert_threshold(int overcurrent_alert_threshold) {
//		this.overcurrent_alert_threshold = overcurrent_alert_threshold;
//	}
//
//
//	public int getOvervoltage_alert_threshold() {
//		return overvoltage_alert_threshold;
//	}
//
//
//	public void setOvervoltage_alert_threshold(int overvoltage_alert_threshold) {
//		this.overvoltage_alert_threshold = overvoltage_alert_threshold;
//	}
//
//
//	public int getUndervoltage_alert_threshold() {
//		return undervoltage_alert_threshold;
//	}
//
//
//	public void setUndervoltage_alert_threshold(int undervoltage_alert_threshold) {
//		this.undervoltage_alert_threshold = undervoltage_alert_threshold;
//	}
//
//
//	public int getOvercurrent_stop_threshold() {
//		return overcurrent_stop_threshold;
//	}
//
//
//	public void setOvercurrent_stop_threshold(int overcurrent_stop_threshold) {
//		this.overcurrent_stop_threshold = overcurrent_stop_threshold;
//	}
//
//
//	public int getOvervoltage_stop_threshold() {
//		return overvoltage_stop_threshold;
//	}
//
//
//	public void setOvervoltage_stop_threshold(int overvoltage_stop_threshold) {
//		this.overvoltage_stop_threshold = overvoltage_stop_threshold;
//	}
//
//
//	public int getUndervoltage_stop_threshold() {
//		return undervoltage_stop_threshold;
//	}
//
//
//	public void setUndervoltage_stop_threshold(int undervoltage_stop_threshold) {
//		this.undervoltage_stop_threshold = undervoltage_stop_threshold;
//	}


	public String getPump_temperature_alert_threshold() {
		return pump_temperature_alert_threshold;
	}


	public void setPump_temperature_alert_threshold(
			String pump_temperature_alert_threshold) {
		this.pump_temperature_alert_threshold = pump_temperature_alert_threshold;
	}


	public float getPump_temperature_stop_threshold() {
		return pump_temperature_stop_threshold;
	}


	public void setPump_temperature_stop_threshold(
			float pump_temperature_stop_threshold) {
		this.pump_temperature_stop_threshold = pump_temperature_stop_threshold;
	}


	public float getPump_water_height_stop() {
		return pump_water_height_stop;
	}


	public void setPump_water_height_stop(float pump_water_height_stop) {
		this.pump_water_height_stop = pump_water_height_stop;
	}


	public float getPump_water_height_start() {
		return pump_water_height_start;
	}


	public void setPump_water_height_start(float pump_water_height_start) {
		this.pump_water_height_start = pump_water_height_start;
	}
}
