package com;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class Setting3_controller implements Initializable{
	@FXML
	private ChoiceBox<String> tasktype;
	private ObservableList<String> tasktypelist=FXCollections.observableArrayList();
	@FXML
	private ChoiceBox<String> devicenumber;
	private ObservableList<String> devicenumberlist=FXCollections.observableArrayList();

	
	private MainView application;   
//	private Stage stage;
    public void setApp(MainView application){
        this.application = application;
    }
//	public void setDialogStage(Stage stage) {
//		this.stage= stage;
//}
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		choicebox_data();
	}
	public void choicebox_data()
	{
		tasktype.setItems(tasktypelist);
		tasktypelist.add(new String("打开"));
		tasktypelist.add(new String("关闭"));
		tasktype.setValue("打开");
		
		devicenumber.setItems(devicenumberlist);
		devicenumberlist.add(new String("01"));
		devicenumberlist.add(new String("02"));
		devicenumberlist.add(new String("03"));
		devicenumber.setValue("01");
	}
}
