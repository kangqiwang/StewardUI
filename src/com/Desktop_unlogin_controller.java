package com;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import org.controlsfx.dialog.Dialogs;

import javafx.animation.FillTransition;
import javafx.animation.FillTransitionBuilder;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class Desktop_unlogin_controller extends AnchorPane implements
		Initializable {
	int count_button;// button 被按下的次数

	@FXML
	private Button login;
	@FXML
	private Label device_number_1;
	@FXML
	private Label device_number_2;
	@FXML
	private Label device_number_3;
	@FXML
	private Button page_up;
	@FXML
	private Button page_down;
	// 进入虚拟控制界面的按钮
	@FXML
	private Button virtulcontroller;
	// 灯的名字
	@FXML
	private Circle start_light;
	@FXML
	private Circle stop_light;
	@FXML
	private Circle normal_light;
	@FXML
	private Circle abnormal_light;
	
	
	@FXML
	private Circle start_light1;
	@FXML
	private Circle stop_light1;
	@FXML
	private Circle normal_light1;
	@FXML
	private Circle abnormal_light1;
	
	@FXML
	private Circle start_light2;
	@FXML
	private Circle stop_light2;
	@FXML
	private Circle normal_light2;
	@FXML
	private Circle abnormal_light2;
	
	@FXML
	private Label label_001;
	@FXML
	private Label label_002;
	@FXML
	private Label label_003;
	@FXML
	private Label label_004;
	@FXML
	private Label label_005;
	@FXML
	private Label label_006;
	@FXML
	private Label label_007;
	@FXML
	private Label label_008;
	@FXML
	private Label label_009;
	private FillTransition fillTransition;

	
	Boolean once_login=false;
	Boolean is_link;
	public static MainView application=new MainView();
	public static Desktop_unlogin_controller ds=new Desktop_unlogin_controller();
	public void setApp(MainView application) {
		this.application = application;
	}

	@FXML
	private void login_event(ActionEvent event) throws Exception {
		// 识别首次登陆和再次登陆
		if (once_login) {
			application.event("UI/Login.fxml");
		} else {
			
			application.event("UI/Login.fxml");
		}
	}
	
	@FXML
	private void page_up_event(ActionEvent event) {// 加一个不加载css文件的语句，还有跟新控制器，使控制器在指向真正的硬件控制器
		if (count_button <= 1) {
			page_up.setDisable(false);
		} else {
			device_number_1.setText(count_button - 3 + "#-A1");
			device_number_2.setText(count_button - 2 + "#-A1");
			device_number_3.setText(count_button - 1 + "#-A1");
			count_button = count_button - 3;
		}
	}

	@FXML
	private void page_down_event(ActionEvent event) {// 有一个上限，暂时没有写

		device_number_1.setText((count_button + 3) + "#-A1");
		device_number_2.setText((count_button + 4) + "#-A1");
		device_number_3.setText((count_button + 5) + "#-A1");
		count_button = count_button + 3;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		textcontroller();
		once_login = true;
		count_button = 1;
		transition_light_red(abnormal_light,500);
//		transition_light_green(start_light);
		transition_light_red(abnormal_light1,500);
		transition_light_red(abnormal_light2,800);
//		transition_light_green(normal_light);
//		transition_light_green(start_light1);
//		transition_light_green(start_light2);
//		transition_light_green(normal_light1);
//		transition_light_green(normal_light2);
		// device_number_color(device_number_1);
		// device_number_color(device_number_2);
		// device_number_color(device_number_3);
		// 暂时初始化的定义
		/**
		 * start_light.setVisible(false); stop_light.setVisible(true);
		 */

	}

	// 判断出现灰色或者绿色,加载CSS文件
	public void device_number_color(Label name) {
		is_link = false;
		if (is_link == true) {
			name.getStylesheets().add(
					getClass().getResource("/UI/green.css").toExternalForm());
		} else {
			name.getStylesheets().add(
					getClass().getResource("/UI/grey.css").toExternalForm());
		}

	}

	public void circle_event(Circle circle) {

	}
	
	public void textcontroller() {
		Timeline Updater = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {  
		       @Override  
		       public void handle(ActionEvent event) {  
//		    	   label_008.clear();  
		         //Creation and Dynamic change of data.  
		         int s1 = new Random().nextInt(40)+220;  
		         double s2 = new Random().nextFloat()/3;  
		         int s3 = new Random().nextInt(8);
		         int s4 = new Random().nextInt(40)+220;  
		         double s5 = new Random().nextFloat()/3;  
		         int s6 = new Random().nextInt(8);  
		         int s7 = new Random().nextInt(40)+220;  
		         double s8 = new Random().nextFloat()/3;  
		         int s9 = new Random().nextInt(8);  
		         
		         
		         //To ensure data is at least one. Optional.  
		         if(s1 == 0 ){  
		           s1 = 1;  
		         }  
		         if(s2 == 0.0||s5==0.0||s8==0.0 ){  
		           s2 = 0.3;  
		           s5=0.2;
		           s8=0.25;
		         }  
		         if(s3 == 0 ){  
		           s3 = 1;  
		         }  
		         label_001.setText("voltage : "+String.valueOf(s1)+"V");
		         label_002.setText("current : "+String.valueOf(s2).substring(0,4)+"A");  
		         label_003.setText("brightness : "+String.valueOf(s3)+"cd/m2");  
		         label_004.setText("voltage : "+String.valueOf(s4)+"V");  
		         label_005.setText("current : "+String.valueOf(s5).substring(0,4)+"A");  
		         label_006.setText("brightness : "+String.valueOf(s6)+"cd/m2"); 
		         label_007.setText("voltage : "+String.valueOf(s7)+"V");  
		         label_008.setText("current : "+String.valueOf(s8).substring(0,4)+"A");  
		         label_009.setText("brightness : "+String.valueOf(s9)+"cd/m2"); 
		         
		       }  
		     }));  
		     Updater.setCycleCount(Timeline.INDEFINITE);  
		     Updater.play();  
	}
	public void transition_light_red( Circle light,double millis)
	{
		fillTransition = FillTransitionBuilder.create()
		            .duration(Duration.millis(millis))
		            .shape(light)
		            .fromValue(Color.GREY)
		            .toValue(Color.RED)
		            .cycleCount(Timeline.INDEFINITE)
		            .autoReverse(true)
		            .build();
		fillTransition.play();
	}
	public void transition_light_green( Circle light,double millis)
	{
		fillTransition= FillTransitionBuilder.create()
		            .duration(Duration.millis(millis))
		            .shape(light)
		            .fromValue(Color.GREY)
		            .toValue(Color.GREEN)
		            .cycleCount(Timeline.INDEFINITE)
		            .autoReverse(true)
		            .build();
		fillTransition.play();
	}
}
