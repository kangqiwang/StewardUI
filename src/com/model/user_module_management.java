package com.model;

public class user_module_management {
	private int user_id;
	private int module_device_kongtiao;
	private int module_device_xinfengjizu;
	private int module_device_paifeng;
	private int module_device_geishui;
	private int module_device_paishui;
	private int module_device_zhaoming;
	private int module_device_dianti;
	private int module_device_management;
	private int module_user_management;

	public user_module_management(int user_id) {
			this.user_id=user_id;
			this.module_device_kongtiao=(Integer) null;
			this.module_device_xinfengjizu=(Integer) null;
			this.module_device_paifeng=(Integer) null;
			this.module_device_geishui=(Integer) null;
			this.module_device_paishui=(Integer) null;
			this.module_device_zhaoming=(Integer) null;
			this.module_device_dianti=(Integer) null;
			this.module_device_management=(Integer) null;
			this.module_user_management=(Integer) null;
			
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getModule_device_kongtiao() {
		return module_device_kongtiao;
	}

	public void setModule_device_kongtiao(int module_device_kongtiao) {
		this.module_device_kongtiao = module_device_kongtiao;
	}

	public int getModule_device_xinfengjizu() {
		return module_device_xinfengjizu;
	}

	public void setModule_device_xinfengjizu(int module_device_xinfengjizu) {
		this.module_device_xinfengjizu = module_device_xinfengjizu;
	}

	public int getModule_device_paifeng() {
		return module_device_paifeng;
	}

	public void setModule_device_paifeng(int module_device_paifeng) {
		this.module_device_paifeng = module_device_paifeng;
	}

	public int getModule_device_geishui() {
		return module_device_geishui;
	}

	public void setModule_device_geishui(int module_device_geishui) {
		this.module_device_geishui = module_device_geishui;
	}

	public int getModule_device_paishui() {
		return module_device_paishui;
	}

	public void setModule_device_paishui(int module_device_paishui) {
		this.module_device_paishui = module_device_paishui;
	}

	public int getModule_device_zhaoming() {
		return module_device_zhaoming;
	}

	public void setModule_device_zhaoming(int module_device_zhaoming) {
		this.module_device_zhaoming = module_device_zhaoming;
	}

	public int getModule_device_dianti() {
		return module_device_dianti;
	}

	public void setModule_device_dianti(int module_device_dianti) {
		this.module_device_dianti = module_device_dianti;
	}

	public int getModule_device_management() {
		return module_device_management;
	}

	public void setModule_device_management(int module_device_management) {
		this.module_device_management = module_device_management;
	}

	public int getModule_user_management() {
		return module_user_management;
	}

	public void setModule_user_management(int module_user_management) {
		this.module_user_management = module_user_management;
	}
}
