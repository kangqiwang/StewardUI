package com;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;
import org.omg.CORBA.PUBLIC_MEMBER;

import javafx.animation.FillTransition;
import javafx.animation.FillTransitionBuilder;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Desktop_login_controller extends AnchorPane implements Initializable {
	int  count_button;//button 被按下的次数
	Boolean link;//是否连接上设备
	@FXML private  Button page_up;
	@FXML private Button page_down;
	@FXML private Button unlogin;
	@FXML private Button administrate;
	@FXML private Button virtul;
	@FXML ImageView image;
	@FXML private Label device_number_1;
	@FXML private Label device_number_2;
	@FXML private Label device_number_3;
	
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
	
	private MainView application;
	   
    public void setApp(MainView application){
        this.application = application;
    }
    @FXML private  void virtul_event() throws Exception {
		// TODO Auto-generated method stub
    	is_link();
	}
	

	@FXML private void image_action(ActionEvent event) throws Exception{
		application.goto_virtulcontrol();
	}
	
	@FXML
	private void unlogin_event(ActionEvent event)throws Exception{
		application.goto_desktop_unlogin();
	}
	@FXML
	private void administrate_event(ActionEvent event)throws Exception{
		application.goto_administrator();
		
	}
	@FXML
	private void page_up_event(ActionEvent event)
	{
		//加一个不加载css文件的语句，还有跟新控制器，使控制器在指向真正的硬件控制器
		if(count_button<=1)
		{
			page_up.setDisable(false);
		}
		else{
		device_number_1.setText(count_button-3+"#-A1");
		device_number_2.setText(count_button-2+"#-A1");
		device_number_3.setText(count_button-1+"#-A1");
		count_button=count_button-3;
		}
	}
	@FXML
	private void page_down_event(ActionEvent event)
	{//有一个上限，暂时没有写
		
		device_number_1.setText((count_button+3)+"#-A1");
		device_number_2.setText((count_button+4)+"#-A1");
		device_number_3.setText((count_button+5)+"#-A1");
		count_button=count_button+3;
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		textcontroller();
		
		//添加灯的变化
		transition_light_red(abnormal_light);
		transition_light_red(abnormal_light1);
		transition_light_red(abnormal_light2);
		
	}	
	public void is_link() throws Exception
	{
		link=true;
		if (link==true) {
			application.goto_virtulcontrol();
//	    	application.event("UI/VirtulControl.fxml");
		}else {
			Stage stage=new Stage();
//			Dialogs.create()
//	        .owner(stage)
//	        .title("设备连线")
//	        .masthead("Error")
//	        .message("控制器掉线，请先检查通讯线路是否恢复正常。如果无法恢复，请与昱通客服联系!")
//	        .showWarning();
		}
		
	}
	public void circle_event(Circle circle,Boolean lean)
	{
		if(lean)
		{
			circle.setStroke(Color.web("gray",0.16));
		}
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
	public void transition_light_red( Circle light)
	{
		fillTransition = FillTransitionBuilder.create()
		            .duration(Duration.seconds(2))
		            .shape(light)
		            .fromValue(Color.GREY)
		            .toValue(Color.RED)
		            .cycleCount(Timeline.INDEFINITE)
		            .autoReverse(true)
		            .build();
		fillTransition.play();
	}
	public void transition_light_green( Circle light)
	{
		fillTransition= FillTransitionBuilder.create()
		            .duration(Duration.seconds(1))
		            .shape(light)
		            .fromValue(Color.GREY)
		            .toValue(Color.GREEN)
		            .cycleCount(Timeline.INDEFINITE)
		            .autoReverse(true)
		            .build();
		fillTransition.play();
	}
}