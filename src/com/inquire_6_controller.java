package com;


import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.model.repair_management;
import com.model.running_log;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class inquire_6_controller implements Initializable {

	@FXML
	private TableView<repair_management> inquire_6_tableview;
	@FXML
	private TableColumn<repair_management, Integer> repair_id; // 管理编号
	@FXML
	private TableColumn<repair_management, Integer> device_id; // 布置建筑
	@FXML
	private TableColumn<repair_management, String> device_name; // 设备编号
	@FXML
	private TableColumn<repair_management, Date> repair_time; // 启动
	@FXML
	private TableColumn<repair_management, String> repair_position; // 停止
	@FXML
	private TableColumn<repair_management, String> repair_cause; // 设备类型
	@FXML
	private TableColumn<repair_management, String> repairman;
	@FXML
	private Button confirmButton;
	@FXML
	private Button cancelButton;
	private Stage stage;
	private MainView application;

	public void setApp(MainView application) {
		this.application = application;
	}

	@FXML
	private void confirmButton_event() {
		// TODO Auto-generated method stub

	}

	@FXML
	private void cancelButton_event() {
		stage.close();
	}

	public void setDialogStage(Stage stage) {
		this.stage = stage;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		assert inquire_6_tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'UserMaster.fxml'.";
		repair_id
				.setCellValueFactory(new PropertyValueFactory<repair_management, Integer>(
						"repair_id"));

		device_id.setCellValueFactory(new PropertyValueFactory<repair_management, Integer>(
				"device_id"));
		device_name
				.setCellValueFactory(new PropertyValueFactory<repair_management, String>(
						"device_name"));
		repair_time
				.setCellValueFactory(new PropertyValueFactory<repair_management, Date>(
						"repair_time"));
		repair_position
				.setCellValueFactory(new PropertyValueFactory<repair_management, String>(
						"repair_position"));
		repair_cause
				.setCellValueFactory(new PropertyValueFactory<repair_management, String>(
						"repair_cause"));
		repairman
				.setCellValueFactory(new PropertyValueFactory<repair_management, String>(
						"repairman"));
		
		buildData();

	}

	public void buildData() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "19930317";
		ObservableList<repair_management> Administrator_data_6 = null;
		Connection con = null;
		Statement statement1;
		ResultSet rs = null;
		try {
			Administrator_data_6 = FXCollections.observableArrayList();
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, password);
			statement1 = con.createStatement();
			String sql = "select repair_id,device_id,device_name,repair_time,repair_position,repair_cause,repairman from repair_management";
			rs = statement1.executeQuery(sql);

			repair_management ad = null;
			while (rs.next()) {
				ad = new repair_management();
				ad.setRepair_id(rs.getInt("repair_id"));
				
				ad.setDevice_id(rs.getInt("device_id"));
				ad.setDevice_name(rs.getString("device_name"));
				ad.setRepair_time(rs.getDate("repair_time"));
				ad.setRepair_position(rs.getString("repair_position"));
				ad.setRepair_cause(rs.getString("repair_cause"));
				ad.setRepairman(rs.getString("repairman"));
				Administrator_data_6.add(ad);
			}

			try {
				inquire_6_tableview.setItems(Administrator_data_6);
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


}
