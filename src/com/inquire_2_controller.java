package com;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ResourceBundle;

import com.model.schedule_cycle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class inquire_2_controller implements Initializable {

	@FXML
	private TableView<schedule_cycle> inquire_2_tableview;
	@FXML
	private TableColumn<schedule_cycle, Integer> schedule_id; // 管理编号
	@FXML
	private TableColumn<schedule_cycle, Integer> cycle_id; // 布置建筑
	@FXML
	private TableColumn<schedule_cycle, Time> period_start_time; // 设备类型
	@FXML
	private TableColumn<schedule_cycle, Time> period_end_time; // 设备编号
	@FXML
	private TableColumn<schedule_cycle, String> device_type; // 启动

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
		assert inquire_2_tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'UserMaster.fxml'.";
		schedule_id
				.setCellValueFactory(new PropertyValueFactory<schedule_cycle, Integer>(
						"schedule_id"));
		cycle_id.setCellValueFactory(new PropertyValueFactory<schedule_cycle, Integer>(
				"cycle_id"));
		period_start_time
				.setCellValueFactory(new PropertyValueFactory<schedule_cycle, Time>(
						"period_start_time"));
		period_end_time
				.setCellValueFactory(new PropertyValueFactory<schedule_cycle, Time>(
						"period_end_time"));

		device_type
				.setCellValueFactory(new PropertyValueFactory<schedule_cycle, String>(
						"device_type"));

		buildData();

	}

	public void buildData() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "19930317";
		ObservableList<schedule_cycle> Administrator_data_3 = null;
		Connection con = null;
		Statement statement1;
		ResultSet rs = null;
		try {
			Administrator_data_3 = FXCollections.observableArrayList();
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, password);
			statement1 = con.createStatement();
			String sql = "select schedule_id,cycle_id,period_start_time,period_end_time,device_type from schedule_cycle";
			rs = statement1.executeQuery(sql);

			schedule_cycle ad = null;
			while (rs.next()) {
				ad = new schedule_cycle();
				ad.setSchedule_id(rs.getInt("schedule_id"));
				ad.setCycle_id(rs.getInt("cycle_id"));
				ad.setPeriod_start_time(rs.getTime("period_start_time"));
				ad.setPeriod_end_time(rs.getTime("period_end_time"));

				ad.setDevice_type(rs.getString("device_type"));

				// System.out.println();
				// devicetype_1.setItems(ad.getDevice_type_name());
				// devicetype_1.add(ad.getDevice_type_name());
				Administrator_data_3.add(ad);
				// Administrator_data.addAll(ad);
			}

			try {
				// ((ChoiceBox<String>) devicetype_1).setItems(devicetype_1);
				inquire_2_tableview.setItems(Administrator_data_3);
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
