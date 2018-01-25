package com;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.MenuItem;

public class Main_controller_1 extends AnchorPane implements Initializable {
	@FXML
	private MenuItem user_Setting_1; // 用户注册
	@FXML
	private MenuItem warrant_Setting; // 授权设定
	@FXML
	private MenuItem device_Setting; // 设备设定
	@FXML
	private MenuItem task_Setting; // 任务设定
	// 查看
	@FXML
	private MenuItem run_check; // 运行状态
	@FXML
	private MenuItem device_check; // 设备能耗
	@FXML
	private MenuItem ui_check; // U-T,I-T图
	@FXML
	private MenuItem qt_check; // Q-T图
	// 查询
	@FXML
	private MenuItem date_inquire; // 按日期查询
	@FXML
	private MenuItem device_inquire; // 按设备类型查询
	@FXML
	private MenuItem build_inquire; // 按建筑查询
	@FXML
	private MenuItem person_inquire; // 按值班人员查询
	@FXML
	private MenuItem abnormal_inquire; // 异常记录查询
	@FXML
	private MenuItem repair_inquire; // 检修记录查询
	// 管理
	@FXML
	private MenuItem device_manage; // 设备管理
	@FXML
	private MenuItem service_manage; // 服务管理
	@FXML
	private MenuItem journal_manage; // 日志管理
	@FXML
	private MenuItem repair_manage; // 检修管理
	// 打印
	@FXML
	private MenuItem journal_print; // 日志
	@FXML
	private MenuItem abnormal_print; // 异常记录
	@FXML
	private MenuItem repair_print; // 检修记录
	// 帮助
	@FXML
	private MenuItem handbook_help; // 使用手册
	@FXML
	private MenuItem us_help; // 联系我们
	@FXML
	private MenuItem state_help; // 版权声明
	private MainView application = null;

	public void setApp(MainView application) {
		this.application = application;
	}

	@FXML
	// 用户注册事件
	private void user_Setting_event_1(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.event("UI/register.fxml");

	}

	@FXML
	// 授权设定
	private void warrant_Setting_event(ActionEvent event) throws Exception {

		application = Desktop_unlogin_controller.application;
		application.goto_Setting1();

	}

	@FXML
	// 设备设定
	private void device_Setting_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Setting2();
	}

	@FXML
	// 任务设定
	private void task_Setting_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Setting3();

	}

	@FXML
	// 运行状态
	private void run_check_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Check1();
	}

	@FXML
	// 设备能耗
	private void device_check_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Check2();
	}

	@FXML
	// U-T,I-T图
	private void ui_check_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		 application.check3_controller_show();
//		check3_controller_show check3_controller_show = null;
//		check3_controller_show.start();
	}

	@FXML
	// qt图
	private void qt_check_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		 application.check4_controller_show();
	}

	@FXML
	// 按日期查询
	private void date_inquire_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Inquire1();
//		application.event("UI/Inquire1.fxml");
	}

	// @FXML
	//
	// private void data_inquire_event(ActionEvent event) throws Exception {
	// application.event("UI/Inquire2.fxml");
	// }
	@FXML
	// 按设备类型查询
	private void device_inquire_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Inquire2();
	}

	@FXML
	// 按建筑查询
	private void build_inquire_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Inquire3();
	}

	@FXML
	// 按值班员查询
	private void person_inquire_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Inquire4();
	}

	@FXML
	// 异常记录
	private void abnormal_inquire_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Inquire5();
	}

	@FXML
	// 检修记录查询
	private void repair_inquire_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Inquire6();
	}

	@FXML
	// 设备管理
	private void device_manage_event(ActionEvent event) throws Exception {
		application.event("UI/Manage1.fxml");
	}

	@FXML
	// 服务管理
	private void service_manage_event(ActionEvent event) throws Exception {
		application.event("UI/Manage2.fxml");
	}

	@FXML
	// 日志管理
	private void journal_manage_event(ActionEvent event) throws Exception {
		application.event("UI/Manage3.fxml");
	}

	@FXML
	// 检修管理
	private void repair_manage_event(ActionEvent event) throws Exception {
		application.event("UI/Manag4.fxml");
	}

	@FXML
	// 日志打印
	private void journal_print_event(ActionEvent event) throws Exception {
		application.event("UI/Print1.fxml");
	}

	@FXML
	// 异常记录
	private void abnormal_print_event(ActionEvent event) throws Exception {
		application.event("UI/Print2.fxml");
	}

	@FXML
	// 检修记录
	private void repair_print_event(ActionEvent event) throws Exception {
		application.event("UI/Print3.fxml");
	}

	@FXML
	// 使用手册
	private void handbook_help_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.event("UI/Help1.fxml");
	}

	@FXML
	// 联系我们
	private void us_help_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.event("UI/Help2.fxml");
	}

	@FXML
	// 版权声明
	private void state_help_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.event("UI/Help3.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
