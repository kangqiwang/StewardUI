package com;


import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

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

public class inquire_5_controller implements Initializable {

	@FXML
	private TableView<running_log> inquire_5_tableview;
	@FXML
	private TableColumn<running_log, Integer> log_id; // 管理编号
	@FXML
	private TableColumn<running_log, String> device_id; // 布置建筑
	@FXML
	private TableColumn<running_log, String> log_type; // 设备编号
	@FXML
	private TableColumn<running_log, String> log_message; // 启动
	@FXML
	private TableColumn<running_log, Date> log_time; // 停止
	@FXML
	private TableColumn<running_log, String> log_disposal; // 设备类型
	@FXML
	private TableColumn<running_log, String> user_type;
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
		assert inquire_5_tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'UserMaster.fxml'.";
		log_id
				.setCellValueFactory(new PropertyValueFactory<running_log, Integer>(
						"log_id"));

		device_id.setCellValueFactory(new PropertyValueFactory<running_log, String>(
				"device_id"));
		log_type
				.setCellValueFactory(new PropertyValueFactory<running_log, String>(
						"log_type"));
		log_message
				.setCellValueFactory(new PropertyValueFactory<running_log, String>(
						"log_message"));
		log_time
				.setCellValueFactory(new PropertyValueFactory<running_log, Date>(
						"log_time"));
		log_disposal
				.setCellValueFactory(new PropertyValueFactory<running_log, String>(
						"log_disposal"));
		user_type
				.setCellValueFactory(new PropertyValueFactory<running_log, String>(
						"user_type"));
		
		buildData();

	}

	public void buildData() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "19930317";
		ObservableList<running_log> Administrator_data_5 = null;
		Connection con = null;
		Statement statement1;
		ResultSet rs = null;
		try {
			Administrator_data_5 = FXCollections.observableArrayList();
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, password);
			statement1 = con.createStatement();
			String sql = "select log_id,device_id,log_type,log_message,log_time,log_disposal,user_type from running_log";
			rs = statement1.executeQuery(sql);

			running_log ad = null;
			while (rs.next()) {
				ad = new running_log();
				ad.setLog_id(rs.getInt("log_id"));
				
				ad.setDevice_id(rs.getInt("device_id"));
				ad.setLog_type(rs.getString("log_type"));
				ad.setLog_message(rs.getString("log_message"));
				ad.setLog_time(rs.getDate("log_time"));
				ad.setLog_disposal(rs.getString("log_disposal"));
				ad.setUser_type(rs.getString("user_type"));
				Administrator_data_5.add(ad);
			}

			try {
				inquire_5_tableview.setItems(Administrator_data_5);
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
