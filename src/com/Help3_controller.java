package com;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Help3_controller implements Initializable{
@FXML Label belong;//��Ʒʹ��Ȩ����
@FXML Label user;//��˾����
@FXML Label id;//����汾Ȩ���ݣ�����ѯ����

@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	belong.setText("�ƶ������������ʵ����");
	user.setText("Administrator");
	id.setText("001");
}
}
