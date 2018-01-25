package com;

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ResourceBundle;

import com.model.schedule;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class inquire_3_controller implements Initializable {

	@FXML
	private TableView<schedule> inquire_3_tableview;
	@FXML
	private TableColumn<schedule, Integer> schedule_id; // 管理编号
	@FXML
	private TableColumn<schedule, Integer> device_id; // 布置建筑
	@FXML
	private TableColumn<schedule, String> device_type; // 设备类型
	@FXML
	private TableColumn<schedule, Date> schedule_start_date; // 设备编号
	@FXML
	private TableColumn<schedule, Time> schedule_start_time; // 启动
	@FXML
	private TableColumn<schedule, Date> schedule_stop_date; // 停止
	@FXML
	private TableColumn<schedule, Time> schedule_stop_time; // 启动
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
		assert inquire_3_tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'UserMaster.fxml'.";
		schedule_id
				.setCellValueFactory(new PropertyValueFactory<schedule, Integer>(
						"schedule_id"));
		device_id
				.setCellValueFactory(new PropertyValueFactory<schedule, Integer>(
						"device_id"));
		device_type
				.setCellValueFactory(new PropertyValueFactory<schedule, String>(
						"device_type"));
		schedule_start_date
				.setCellValueFactory(new PropertyValueFactory<schedule, Date>(
						"schedule_start_date"));
		schedule_start_time
				.setCellValueFactory(new PropertyValueFactory<schedule, Time>(
						"schedule_start_time"));
		schedule_stop_date
				.setCellValueFactory(new PropertyValueFactory<schedule, Date>(
						"schedule_stop_date"));
		schedule_stop_time
				.setCellValueFactory(new PropertyValueFactory<schedule, Time>(
						"schedule_stop_time"));
		buildData();

	}

	public void buildData() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "19930317";
		ObservableList<schedule> Administrator_data_3 = null;
		Connection con = null;
		Statement statement1;
		ResultSet rs = null;
		try {
			Administrator_data_3 = FXCollections.observableArrayList();
			Class.forName(driver);

			con = DriverManager.getConnection(url, user, password);
			statement1 = con.createStatement();
			String sql = "select schedule_id,device_id,device_type,schedule_start_date,schedule_start_time,schedule_stop_date,schedule_stop_time from schedule";
			rs = statement1.executeQuery(sql);

			schedule ad = null;
			while (rs.next()) {
				ad = new schedule();
				ad.setSchedule_id(rs.getInt("schedule_id"));
				ad.setDevice_id(rs.getInt("device_id"));
				ad.setDevice_type(rs.getString("device_type"));
				ad.setSchedule_start_date(rs.getDate("schedule_start_date"));
				ad.setSchedule_start_time(rs.getTime("schedule_start_time"));
				ad.setSchedule_end_date(rs.getDate("schedule_stop_date"));
				ad.setSchedule_stop_time(rs.getTime("schedule_stop_time"));

				Administrator_data_3.add(ad);
			}

			try {
				inquire_3_tableview.setItems(Administrator_data_3);
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
