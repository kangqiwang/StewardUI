	/**
		 * 加载history
		 * 登录记录会存储为日志
		 * 登录成功后关闭登录窗体
		 * 管理员只有一个，用户数字没有限制
		 */
		
package com;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import org.controlsfx.dialog.Dialogs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Login_controller extends AnchorPane implements Initializable{
	@FXML private  Button login;
	@FXML private TextField name;
	@FXML private PasswordField password;
	@FXML private HBox login_hbox;
	Boolean password_error;
	public  Desktop_unlogin_controller ds;
	//判断是否弹出窗体
	private MainView application;
	   
    public void setApp(MainView application){
        this.application = application;
    }
	@FXML
	private void login_click (ActionEvent event)throws Exception
	{	
			is_password_error();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		password_error=false;
	}
	public void is_password_error()throws Exception
	{
		if(password_error)
		{	Stage stage=new Stage();
			Dialogs.create()
	        .owner(stage)
	        .title("Error ")
	        .masthead("")
	        .message("用户名或者密码错误")
	        .showError();
		}
	else{		
		application = Desktop_unlogin_controller.application;
//		application.stage.close();
//		ds=Desktop_unlogin_controller.
		ds=Desktop_unlogin_controller.ds;
		Desktop_unlogin_controller.application.primaryStage.close();
		application.goto_desktop_login();
	}

	}


}
