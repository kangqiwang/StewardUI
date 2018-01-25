/**
 * 工作区域：显示本虚拟控制器的所有监控信息
 * 状态区域：设备的工作状态灯指示，与桌面实体控制相同
 * 动画模拟设备运行区域：以动画的方式呈现设备状态：在线，运行，停止，异常
 */
package com;




import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.animation.Animation;
import javafx.animation.FillTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.Animation.Status;
import javafx.animation.FillTransitionBuilder;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import com.SpriteAnimation;

public class VirtulControl_controller  implements Initializable {
	 Boolean is_able;
	@FXML   private Button adstop;
	@FXML private  Button adstart;
	@FXML  private Slider auto_or_manual;
	@FXML private Label current_time;
	@FXML private Label start_time;
	@FXML private Label company;
	@FXML private Label operator;
	@FXML private TextArea text_warning;
	@FXML private ImageView animation_imageView;
	@FXML private ImageView status_lamp;
	@FXML
	private Circle start_light;
	private FillTransition fillTransition;
	
	private static final Image IMAGE = new Image("com/photo/handle_4.jpg");
	private static final Image IMAGE_stop = new Image("com/photo/handle_5.jpg");
	private  Animation animation;
	private static final int COLUMNS  =   4;//定义常量COLUMNS，4列
    private static final int COUNT    =  4;//定义常量COUNT,计数总共有多少个常量
    private static final int OFFSET_X =  5;//定义变量OFFSET_X，小图的x轴的大小
    private static final int OFFSET_Y =  0;//定义变量OFFSET_Y，小图的y轴的大小
    private static final int WIDTH    = 200;//定义变量WIDTH，stage宽度
    private static final int HEIGHT   = 253;//定义变量WEIGHT，stage的高度
	
	private MainView application;   
    public void setApp(MainView application){
        this.application = application;
    }
	String warning;
	String time;
	@FXML private void  company()
	{
		
	}
	@FXML private void adstart_event(){
//		if (animation.getStatus()==Status.STOPPED) {
//			set_animation();
//		}
		set_animation();
		transition_light_green(start_light);
	}
	@FXML private void adstop_event(){
		animation.stop();
		transition_light_red(start_light);
	}
	
	// 判断按钮是否可用
		public void is_button_able(Boolean auto) {
			if (auto == false) {
				adstop.setDisable(false);
				adstart.setDisable(false);
			} else {
				adstop.setDisable(true);
				adstart.setDisable(true);
			}
		}
	//通过控制slider来决定是否可用button
		private void auto_or_manual() {

			if (auto_or_manual.getValue() == 1) {
				is_able = true;
				is_button_able(is_able);
			} else {

				is_able = false;
				is_button_able(is_able);
			}
		}

	
    public void now_time() {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
        time=df.format(new Date());		// new Date()为获取当前系统时间
    }
    
    //没写的，设备开始时间，从数据库传过来
    public void start_time()
    {
    	final SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss");
		final Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {  		
			@Override  
		       public void handle(ActionEvent event) 
    				{
    					final Calendar cal =Calendar.getInstance();
    					start_time.setText(format.format(cal.getTime()));
    				}	
    			}));
    	timeline.setCycleCount(Animation.INDEFINITE);
    	timeline.play();
	
    }
    //设备在线的时间，从数据库传过来
    public void online_time()
    {
    	
    }
    public void set_animation()
    {
    	animation_imageView.setImage(IMAGE);
    	animation_imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));
        animation = new SpriteAnimation(
        		   animation_imageView,
                   Duration.millis(1000),//一幅图片需要停留的时间
                   COUNT, 
                   COLUMNS,
                   OFFSET_X, 
                   OFFSET_Y,
                   WIDTH, 
                   HEIGHT
           );
        animation.setCycleCount(Animation.INDEFINITE);//建立一个周期，周期为无限制
        if (animation.getStatus()==Status.STOPPED) {
        	  animation.play();//动画开始
		}

//        animation.play();//动画开始
//        animation.playFromStart();
       
        
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
	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				now_time();
				current_time.setText(time);
				is_able = false;//初始化变量
				//加事件监听来控制slider的功能
				auto_or_manual.valueProperty().addListener((observable, oldValue, newValue) ->{
					auto_or_manual();	
				});
				start_time();
				company.setText("某某公司");
				operator.setText("老张");
				
	}
}