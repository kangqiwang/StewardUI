package com;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Help2_controller implements Initializable {
@FXML private Label phone;
@FXML private Label weichat;
@FXML private Label QQ;
@FXML private Label web;
@FXML private Label address;
@FXML private Label fax;
@FXML private Label mailbox;
@FXML private Label contact;
@FXML private Label email;
@FXML private Label bus;


@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		phone.setText("");
		weichat.setText("");
		QQ.setText("");
		web.setText("");
		address.setText("");
		fax.setText("");
		mailbox.setText("");
		contact.setText("");
		email.setText("");
		bus.setText("");
	}
	
}
