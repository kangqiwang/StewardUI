package com;

import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.dialog.Dialogs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Register_controller extends AnchorPane implements Initializable {
	@FXML private  Button register;
	@FXML private TextField name;
	@FXML private TextField password;
	@FXML private TextField password_again;
	private Boolean passwordequals;
	private MainView application;
	public  Desktop_unlogin_controller ds;
    public void setApp(MainView application){
        this.application = application;
    }
	@FXML
	private void register(ActionEvent event) throws Exception{
		is_passwordequals();	
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		passwordequals=true;
	}
	public void is_passwordequals()
	{
		if(password.getText().equals(password_again.getText()))
		{
		    //在这里进行数据的上传到数据库中
		
		System.out.println(name.getText()+password.getText()+password_again.getText());
		//跳转到登陆界面
		application = Desktop_unlogin_controller.application;
//		application.stage.close();
//		ds=Desktop_unlogin_controller.
		ds=Desktop_unlogin_controller.ds;
		Desktop_unlogin_controller.application.primaryStage.close();
		application.goto_desktop_login();
		}else{
			Stage stage=new Stage();
			Dialogs.create()
	        .owner(stage)
	        .title("Error")
	        .masthead("")
	        .message("俩次输入的密码不相同,请重新输入")
	        .showError();
		}
	}
	/**
	 * 函数来转换text里面的数值，放入数据库中，与数据库匹配
	 */
	
}

