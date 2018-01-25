package com;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

class Tableview {
	private SimpleIntegerProperty adnumber = new SimpleIntegerProperty();
	private SimpleStringProperty debuild=new SimpleStringProperty();
	private SimpleStringProperty dvtype=new SimpleStringProperty();
	private SimpleStringProperty dvnumber=new SimpleStringProperty();
	private SimpleStringProperty start_condition=new SimpleStringProperty();
	private SimpleStringProperty stop_condition=new SimpleStringProperty();
	private SimpleStringProperty normal_condition=new SimpleStringProperty();
	private SimpleStringProperty abnormal_condition=new SimpleStringProperty();
	private SimpleStringProperty dvtemperature_parameter=new SimpleStringProperty();
	private SimpleStringProperty waterH_parameter=new SimpleStringProperty();
	private SimpleStringProperty waterL_parameter=new SimpleStringProperty();
	private SimpleStringProperty water_parameter=new SimpleStringProperty();
	public  Integer getadnumber(){
		return adnumber.get();
	}
	public String getdebuild(){
		return debuild.get();
	}
	public String getdvtype(){
		return dvtype.get();
	}
	public String getdvnumber(){
		return dvnumber.get();
	}
	 
}