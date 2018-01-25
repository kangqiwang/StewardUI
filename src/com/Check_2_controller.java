package com;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.model.data_runtime_DrainagePump;

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

public class Check_2_controller implements Initializable {

	@FXML
	private TableView<data_runtime_DrainagePump> Check_2_tableview;
	@FXML
	private TableColumn<data_runtime_DrainagePump, Integer> data_id; // 管理编号
	@FXML
	private TableColumn<data_runtime_DrainagePump, String> device_position; // 布置建筑
	@FXML
	private TableColumn<data_runtime_DrainagePump, String> device_type; // 设备编号
	@FXML
	private TableColumn<data_runtime_DrainagePump, Integer> device_id; // 启动
	@FXML
	private TableColumn<data_runtime_DrainagePump, Float> dynamic_a_phase_voltage; // 停止
	@FXML
	private TableColumn<data_runtime_DrainagePump, Float> dynamic_a_phase_current; // 设备类型
	@FXML
	private TableColumn<data_runtime_DrainagePump, Integer> total_working_time;
	@FXML
	private TableColumn<data_runtime_DrainagePump, Integer> total_energy_consumption;
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
		assert Check_2_tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'UserMaster.fxml'.";
		data_id.setCellValueFactory(new PropertyValueFactory<data_runtime_DrainagePump, Integer>(
				"data_id"));
		device_position
				.setCellValueFactory(new PropertyValueFactory<data_runtime_DrainagePump, String>(
						"device_position"));
		device_type
				.setCellValueFactory(new PropertyValueFactory<data_runtime_DrainagePump, String>(
						"device_type"));
		device_id
				.setCellValueFactory(new PropertyValueFactory<data_runtime_DrainagePump, Integer>(
						"device_id"));
		dynamic_a_phase_voltage
				.setCellValueFactory(new PropertyValueFactory<data_runtime_DrainagePump, Float>(
						"dynamic_a_phase_voltage"));
		dynamic_a_phase_current
				.setCellValueFactory(new PropertyValueFactory<data_runtime_DrainagePump, Float>(
						"dynamic_a_phase_current"));
		total_working_time
				.setCellValueFactory(new PropertyValueFactory<data_runtime_DrainagePump, Integer>(
						"total_working_time"));
		total_energy_consumption
				.setCellValueFactory(new PropertyValueFactory<data_runtime_DrainagePump, Integer>(
						"total_energy_consumption"));

		buildData();

	}

	public void buildData() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "19930317";
		ObservableList<data_runtime_DrainagePump> Administrator_data_1 = null;
		Connection con = null;
		Statement statement1;
		ResultSet rs = null;
		try {
			Administrator_data_1 = FXCollections.observableArrayList();
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, password);
			statement1 = con.createStatement();
			String sql = "select data_id,device_position,device_type,device_id,dynamic_a_phase_voltage,dynamic_a_phase_current,total_working_time,total_energy_consumption from data_runtime_drainagepump";
			rs = statement1.executeQuery(sql);

			data_runtime_DrainagePump ad = null;
			while (rs.next()) {
				ad = new data_runtime_DrainagePump();
				ad.setData_id(rs.getInt("data_id"));

				ad.setDevice_position(rs.getString("device_position"));
				ad.setDevice_type(rs.getString("device_type"));
				ad.setDevice_id(rs.getInt("device_id"));
				ad.setDynamic_a_phase_voltage(rs.getFloat("dynamic_a_phase_voltage"));
				ad.setDynamic_a_phase_current(rs.getFloat("dynamic_a_phase_current"));
				ad.setTotal_working_time(rs.getInt("total_working_time"));
				ad.setTotal_energy_consumption(rs.getInt("total_energy_consumption"));
				Administrator_data_1.add(ad);
			}

			try {
				Check_2_tableview.setItems(Administrator_data_1);
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
