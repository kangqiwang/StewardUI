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
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class Check_1_controller extends AnchorPane implements Initializable {

	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test";
	String user = "root";
	String password = "19930317";
	@FXML
	private TableView<data_parameter_DrainagePump> Check_2_tableview;
	@FXML
	private TableColumn<data_parameter_DrainagePump, Integer> info_id; // 管理编号
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> device_position; // 布置建筑
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> device_type_name; // 设备类型
	@FXML
	private TableColumn<data_parameter_DrainagePump, Integer> device_id; // 设备编号
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> start; // 启动
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> stop; // 停止
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> normal; // 正常
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> abnormal; // 异常
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> overcurrent_alert_threshold;// 设备温度
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> overcurrent_stop_threshold; // 水位H
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> overvoltage_alert_threshold; // 水位L
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> overvoltage_stop_threshold; // 水位

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		// adtableview=new TableView<data_parameter_DrainagePump>();
		assert Check_2_tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'UserMaster.fxml'.";
		info_id
				.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, Integer>(
						"info_id"));
		device_position
				.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
						"device_position"));
		device_type_name
				.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
						"device_type_name"));
		device_id
				.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, Integer>(
						"device_id"));
		start.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
				"start"));
		stop.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
				"stop"));
		normal.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
				"normal"));
		abnormal.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
				"abnormal"));
		overcurrent_alert_threshold
				.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
						"pump_temperature_alert_threshold"));
		overcurrent_stop_threshold.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
				"pump_temperature_stop_threshold"));
		overvoltage_alert_threshold.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
				"pump_water_height_stop"));
		overvoltage_stop_threshold.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
				"pump_water_height_start"));
		buildData();
	}

	public void buildData() {
		ObservableList<data_parameter_DrainagePump> Administrator_data = null;
		Connection con = null;
		Statement statement1;
		ResultSet rs = null;
		try {
			Administrator_data = FXCollections.observableArrayList();
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, password);
			statement1 = con.createStatement();
			String sql = "select info_id,device_position,device_type_name,device_id,overcurrent_alert_threshold,overcurrent_stop_threshold,overvoltage_alert_threshold,overvoltage_stop_threshold from data_parameter_drainagepump";
			rs = statement1.executeQuery(sql);

			data_parameter_DrainagePump ad = null;
			while (rs.next()) {
				ad = new data_parameter_DrainagePump();
				ad.setInfo_id(rs.getInt("info_id"));
				ad.setDevice_position(rs.getString("device_position"));
				ad.setDevice_type_name(rs.getString("device_type_name"));
				ad.setDevice_id(rs.getInt("device_id"));
				ad.setStart("123123");
				ad.setStart("1");
				ad.setStop("1");
				ad.setNormal("0");
				ad.setAbnormal("1");
				ad.setPump_temperature_alert_threshold(rs
						.getString("overcurrent_alert_threshold"));
				ad.setPump_temperature_stop_threshold(rs
						.getInt("overcurrent_stop_threshold"));
				ad.setPump_water_height_start(rs
						.getFloat("overvoltage_alert_threshold"));
				ad.setPump_water_height_stop(rs
						.getInt("overvoltage_stop_threshold"));
				// System.out.println();
				Administrator_data.add(ad);
				// Administrator_data.addAll(ad);
			}

			try {
				Check_2_tableview.setItems(Administrator_data);
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
