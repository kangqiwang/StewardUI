package com;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.model.data_parameter_DrainagePump;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Setting2_controller implements Initializable {
	
	@FXML
	private ChoiceBox<String> devicetype_1;
	private ObservableList<String> devicetype_choice = FXCollections.observableArrayList();
	@FXML
	private ChoiceBox<String> device_ids_1;
	private ObservableList<String> device_ids_choice=FXCollections.observableArrayList();
	@FXML
	private ChoiceBox<String> decoratebuild_1;
	private ObservableList<String> decoratebuild_choice=FXCollections.observableArrayList();
	@FXML
	private ChoiceBox<String> devicenumber_1;
	private ObservableList<String> devicenumber_choice=FXCollections.observableArrayList();
	@FXML
	private ChoiceBox<String> repaired_cycle;
	private ObservableList<String> repaired_choice=FXCollections.observableArrayList();
	
	
	
	@FXML
	private TableView<data_parameter_DrainagePump> setting_2_tableview;
	@FXML
	private TableColumn<data_parameter_DrainagePump, Integer> managenumber; // 管理编号
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> decoratebuild; // 布置建筑
	@FXML
	private TableColumn<data_parameter_DrainagePump, Integer> devicenumber; // 设备类型
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> devicetype; // 设备编号
	@FXML
	private TableColumn<data_parameter_DrainagePump, Integer> device_ids; // 启动
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> repaired; // 停止
	@FXML 
	private Button confirmButton;
	@FXML 
	private Button cancelButton;

	private Stage stage;
	private MainView application;   
    public void setApp(MainView application){
        this.application = application;
    }
    @FXML
    private void confirmButton_event() {
		// TODO Auto-generated method stub
    	
	}
    
    @FXML 
    private void cancelButton_event()
    {
    	stage.close();
    }
	
		public void setDialogStage(Stage stage) {
			this.stage = stage;
	}
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			assert setting_2_tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'UserMaster.fxml'.";
			managenumber
					.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, Integer>(
							"info_id"));
			decoratebuild
					.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
							"device_position"));
			devicenumber
			.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, Integer>(
					"device_id"));
			devicetype
					.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
							"device_type_name"));
			
			device_ids.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, Integer>("device_ids"));
			repaired.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>("repaired"));
			
			buildData();
			choicebox_data();
			
			
		}
		
		
		public void buildData() {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String password = "19930317";
			ObservableList<data_parameter_DrainagePump> Administrator_data_1 = null;
			ObservableList<String> devicetype_1 = null;
			Connection con = null;
			Statement statement1;
			ResultSet rs = null;
			try {
				Administrator_data_1 = FXCollections.observableArrayList();
				devicetype_1 = FXCollections.observableArrayList();
				Class.forName(driver);

				con = DriverManager.getConnection(url, user, password);
				statement1 = con.createStatement();
				String sql = "select info_id,device_position,device_id,device_type_name,device_ids,repaired from data_parameter_drainagepump";
				rs = statement1.executeQuery(sql);

				data_parameter_DrainagePump ad = null;
				while (rs.next()) {
					ad = new data_parameter_DrainagePump();
					ad.setInfo_id(rs.getInt("info_id"));
					ad.setDevice_position(rs.getString("device_position"));
					ad.setDevice_type_name(rs.getString("device_type_name"));
					ad.setDevice_id(rs.getInt("device_id"));
					
					ad.setDevice_ids(rs
							.getInt("device_ids"));
					ad.setRepaired(rs
							.getString("repaired"));
					devicetype_1.add(ad.getDevice_type_name());
					 Administrator_data_1.add(ad);
				}

				
				try {
					setting_2_tableview.setItems(Administrator_data_1);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("捕捉异常");
				}

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
		public void choicebox_data()
		{
			devicetype_1.setItems(devicetype_choice);
			devicetype_choice.add(new String("照明"));
			devicetype_1.setValue("照明");
			
			device_ids_1.setItems(device_ids_choice);
			device_ids_choice.add(new String("1"));
			device_ids_choice.add(new String("2"));
			device_ids_choice.add(new String("3"));
			device_ids_1.setValue("1");
			
			decoratebuild_1.setItems(decoratebuild_choice);
			decoratebuild_choice.add(new String("1#"));
			decoratebuild_choice.add(new String("2#"));
			decoratebuild_choice.add(new String("3#"));
			decoratebuild_1.setValue("1#");
			
			devicenumber_1.setItems(devicenumber_choice);
			devicenumber_choice.add(new String("1"));
			devicenumber_choice.add(new String("2"));
			devicenumber_choice.add(new String("3"));
			devicenumber_1.setValue("1");
			
			repaired_cycle.setItems(repaired_choice);
			repaired_choice.add(new String("yes"));
			repaired_choice.add(new String("no"));
			repaired_cycle.setValue("yes");
		}
	
}
