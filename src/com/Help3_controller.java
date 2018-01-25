package com;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Help3_controller implements Initializable{
@FXML Label belong;//产品使用权属于
@FXML Label user;//公司名称
@FXML Label id;//具体版本权内容，在咨询法律

@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	belong.setText("移动互联软件技术实验室");
	user.setText("Administrator");
	id.setText("001");
}
}
