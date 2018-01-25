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
	private MenuItem user_Setting_1; // �û�ע��
	@FXML
	private MenuItem warrant_Setting; // ��Ȩ�趨
	@FXML
	private MenuItem device_Setting; // �豸�趨
	@FXML
	private MenuItem task_Setting; // �����趨
	// �鿴
	@FXML
	private MenuItem run_check; // ����״̬
	@FXML
	private MenuItem device_check; // �豸�ܺ�
	@FXML
	private MenuItem ui_check; // U-T,I-Tͼ
	@FXML
	private MenuItem qt_check; // Q-Tͼ
	// ��ѯ
	@FXML
	private MenuItem date_inquire; // �����ڲ�ѯ
	@FXML
	private MenuItem device_inquire; // ���豸���Ͳ�ѯ
	@FXML
	private MenuItem build_inquire; // ��������ѯ
	@FXML
	private MenuItem person_inquire; // ��ֵ����Ա��ѯ
	@FXML
	private MenuItem abnormal_inquire; // �쳣��¼��ѯ
	@FXML
	private MenuItem repair_inquire; // ���޼�¼��ѯ
	// ����
	@FXML
	private MenuItem device_manage; // �豸����
	@FXML
	private MenuItem service_manage; // �������
	@FXML
	private MenuItem journal_manage; // ��־����
	@FXML
	private MenuItem repair_manage; // ���޹���
	// ��ӡ
	@FXML
	private MenuItem journal_print; // ��־
	@FXML
	private MenuItem abnormal_print; // �쳣��¼
	@FXML
	private MenuItem repair_print; // ���޼�¼
	// ����
	@FXML
	private MenuItem handbook_help; // ʹ���ֲ�
	@FXML
	private MenuItem us_help; // ��ϵ����
	@FXML
	private MenuItem state_help; // ��Ȩ����
	private MainView application = null;

	public void setApp(MainView application) {
		this.application = application;
	}

	@FXML
	// �û�ע���¼�
	private void user_Setting_event_1(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.event("UI/register.fxml");

	}

	@FXML
	// ��Ȩ�趨
	private void warrant_Setting_event(ActionEvent event) throws Exception {

		application = Desktop_unlogin_controller.application;
		application.goto_Setting1();

	}

	@FXML
	// �豸�趨
	private void device_Setting_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Setting2();
	}

	@FXML
	// �����趨
	private void task_Setting_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Setting3();

	}

	@FXML
	// ����״̬
	private void run_check_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Check1();
	}

	@FXML
	// �豸�ܺ�
	private void device_check_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Check2();
	}

	@FXML
	// U-T,I-Tͼ
	private void ui_check_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		 application.check3_controller_show();
//		check3_controller_show check3_controller_show = null;
//		check3_controller_show.start();
	}

	@FXML
	// qtͼ
	private void qt_check_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		 application.check4_controller_show();
	}

	@FXML
	// �����ڲ�ѯ
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
	// ���豸���Ͳ�ѯ
	private void device_inquire_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Inquire2();
	}

	@FXML
	// ��������ѯ
	private void build_inquire_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Inquire3();
	}

	@FXML
	// ��ֵ��Ա��ѯ
	private void person_inquire_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Inquire4();
	}

	@FXML
	// �쳣��¼
	private void abnormal_inquire_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Inquire5();
	}

	@FXML
	// ���޼�¼��ѯ
	private void repair_inquire_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.goto_Inquire6();
	}

	@FXML
	// �豸����
	private void device_manage_event(ActionEvent event) throws Exception {
		application.event("UI/Manage1.fxml");
	}

	@FXML
	// �������
	private void service_manage_event(ActionEvent event) throws Exception {
		application.event("UI/Manage2.fxml");
	}

	@FXML
	// ��־����
	private void journal_manage_event(ActionEvent event) throws Exception {
		application.event("UI/Manage3.fxml");
	}

	@FXML
	// ���޹���
	private void repair_manage_event(ActionEvent event) throws Exception {
		application.event("UI/Manag4.fxml");
	}

	@FXML
	// ��־��ӡ
	private void journal_print_event(ActionEvent event) throws Exception {
		application.event("UI/Print1.fxml");
	}

	@FXML
	// �쳣��¼
	private void abnormal_print_event(ActionEvent event) throws Exception {
		application.event("UI/Print2.fxml");
	}

	@FXML
	// ���޼�¼
	private void repair_print_event(ActionEvent event) throws Exception {
		application.event("UI/Print3.fxml");
	}

	@FXML
	// ʹ���ֲ�
	private void handbook_help_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.event("UI/Help1.fxml");
	}

	@FXML
	// ��ϵ����
	private void us_help_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.event("UI/Help2.fxml");
	}

	@FXML
	// ��Ȩ����
	private void state_help_event(ActionEvent event) throws Exception {
		application = Desktop_unlogin_controller.application;
		application.event("UI/Help3.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
