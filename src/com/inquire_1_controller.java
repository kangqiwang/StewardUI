package com;

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.model.schedule;
import com.mysql.fabric.xmlrpc.base.Data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class inquire_1_controller implements Initializable {
	

	
	@FXML
	private TableView<schedule> inquire_1_tableview;
	@FXML
	private TableColumn<schedule, Integer> schedule_id; // ������
	@FXML
	private TableColumn<schedule, Date> schedule_start_date; // ���ý���
	@FXML
	private TableColumn<schedule, Date> schedule_start_time; // �豸����
	@FXML
	private TableColumn<schedule, Date> schedule_stop_date; // �豸���
	@FXML
	private TableColumn<schedule, String> task_type; // ����
	@FXML
	private TableColumn<schedule, String> decoratebuild; // ֹͣ
	@FXML
	private TableColumn<schedule, Integer> device_id; // ����
	@FXML
	private TableColumn<schedule, String> operator; // ֹͣ
	 
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
			assert inquire_1_tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'UserMaster.fxml'.";
			schedule_id
					.setCellValueFactory(new PropertyValueFactory<schedule, Integer>(
							"schedule_id"));
			schedule_start_date
					.setCellValueFactory(new PropertyValueFactory<schedule, Date>(
							"schedule_start_date"));
			schedule_start_time
			.setCellValueFactory(new PropertyValueFactory<schedule, Date>(
					"schedule_start_time"));
			schedule_stop_date
					.setCellValueFactory(new PropertyValueFactory<schedule, Date>(
							"schedule_stop_date"));
			
			task_type.setCellValueFactory(new PropertyValueFactory<schedule, String>("task_type"));
			decoratebuild.setCellValueFactory(new PropertyValueFactory<schedule, String>("device_position"));
			device_id.setCellValueFactory(new PropertyValueFactory<schedule, Integer>("device_id"));
			operator.setCellValueFactory(new PropertyValueFactory<schedule, String>("operator"));
			
			buildData();
			
			
		}
		
		
		public void buildData() {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String password = "19930317";
			ObservableList<schedule> Administrator_data_2 = null;
			Connection con = null;
			Statement statement1;
			ResultSet rs = null;
			try {
				Administrator_data_2 = FXCollections.observableArrayList();
				Class.forName(driver);

				con = DriverManager.getConnection(url, user, password);
				statement1 = con.createStatement();
				String sql = "select schedule_id,schedule_start_date,schedule_start_time,schedule_stop_date,task_type,device_position,device_id,operator from schedule";
				rs = statement1.executeQuery(sql);

				schedule ad = null;
				while (rs.next()) {
					ad = new schedule();
					ad.setSchedule_id(rs.getInt("schedule_id"));
					ad.setSchedule_start_date(rs.getDate("schedule_start_date"));
					ad.setSchedule_start_time(rs.getTime("schedule_start_time"));
					ad.setSchedule_end_date(rs.getDate("schedule_stop_date"));
					
					ad.setTask_type(rs
							.getString("task_type"));
					ad.setDevice_position(rs
							.getString("device_position"));
					ad.setDevice_id(rs
							.getInt("device_id"));
					ad.setOperator(rs
							.getString("operator"));
					 Administrator_data_2.add(ad);
				}

				
				try {
					inquire_1_tableview.setItems(Administrator_data_2);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("��׽�쳣");
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
