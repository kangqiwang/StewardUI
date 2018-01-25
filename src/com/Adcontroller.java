/**
 * administrator��controller
 */
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
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class Adcontroller extends AnchorPane implements Initializable {

	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test";
	String user = "root";
	String password = "19930317";

	Boolean is_able; // �ж�����Ļ������ֶ������Զ�
	@FXML
	private Button adstop; // �ֶ���ֹͣ��ť
	@FXML
	private Button adstart; // �ֶ���������ť
	@FXML
	private Slider auto_or_manual;// HBox�����������Զ������ֶ�

	@FXML
	private TableView<data_parameter_DrainagePump> adtableview;
	@FXML
	private TableColumn<data_parameter_DrainagePump, Integer> managenumber; // ������
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> decoratebuild; // ���ý���
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> devicetype; // �豸����
	@FXML
	private TableColumn<data_parameter_DrainagePump, Integer> devicenumber; // �豸���
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> start; // ����
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> stop; // ֹͣ
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> normal; // ����
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> abnormal; // �쳣
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> devicetemperature;// �豸�¶�
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> waterH; // ˮλH
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> waterL; // ˮλL
	@FXML
	private TableColumn<data_parameter_DrainagePump, String> water; // ˮλ
	// ObservableList<TabableView> adtableviews;

	private MainView application;

	public void setApp(MainView application) {
		this.application = application;
	}

	//��ť����
		@FXML
		private void adstart_action(ActionEvent event) {
			// δ����auto��ť��
			System.out.println("����");
		}
		// ��ťֹͣ
		@FXML
		private void adstop_action(ActionEvent event) {
			System.out.println("ֹͣ");
		}

		// ��ť����
		
		
		
	//ͨ������slider�������Ƿ����button
		private void auto_or_manual() {

			if (auto_or_manual.getValue() == 1) {
				is_able = true;
				is_button_able(is_able);
			} else {

				is_able = false;
				is_button_able(is_able);
			}
		}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
//		adtableview=new TableView<data_parameter_DrainagePump>();
		assert adtableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'UserMaster.fxml'.";
		managenumber
				.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, Integer>(
						"info_id"));
		decoratebuild
				.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
						"device_position"));
		devicetype
				.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
						"device_type_name"));
		devicenumber
				.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, Integer>(
						"device_id"));
		start.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>("start"));
		stop.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>("stop"));
		normal.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>("normal"));
		abnormal.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>("abnormal"));
		devicetemperature
				.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
						"pump_temperature_alert_threshold"));
		waterH.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
				"pump_temperature_stop_threshold"));
		waterL.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
				"pump_water_height_stop"));
		water.setCellValueFactory(new PropertyValueFactory<data_parameter_DrainagePump, String>(
				"pump_water_height_start"));
		// Table.getItems().setAll(gobbledyGook());

		buildData();
		is_able = false;
		auto_or_manual.valueProperty().addListener(
				(observable, oldValue, newValue) -> {
					auto_or_manual();
				});
	}

	// �жϰ�ť�Ƿ����
	public void is_button_able(Boolean auto) {
		if (auto == false) {
			adstop.setDisable(false);
			adstart.setDisable(false);
		} else {
			adstop.setDisable(true);
			adstart.setDisable(true);
		}
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
			String sql = "select info_id,device_position,device_type_name,device_id,pump_temperature_alert_threshold,pump_temperature_stop_threshold,pump_water_height_stop,pump_water_height_start from data_parameter_drainagepump";
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
						.getString("pump_temperature_alert_threshold"));
				ad.setPump_temperature_stop_threshold(rs
						.getFloat("pump_temperature_stop_threshold"));
				ad.setPump_water_height_start(rs
						.getFloat("pump_water_height_stop"));
				ad.setPump_water_height_stop(rs
						.getFloat("pump_water_height_start"));
				// System.out.println();
				 Administrator_data.add(ad);
//				 Administrator_data.addAll(ad);
			}

			
			try {
				adtableview.setItems(Administrator_data);
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
