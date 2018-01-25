package com;
import javafx.animation.Animation;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
public class SandboxFX extends Application {
	//IMAGE的加载
    private static final Image IMAGE = new Image("com/photo/handle.jpg");
    private static final int COLUMNS  =  1;//定义常量COLUMNS，4列
    private static final int COUNT    =  4;//定义常量COUNT,计数总共有多少个常量
    private static final int OFFSET_X =  18;//定义变量OFFSET_X，小图的x轴的大小
    private static final int OFFSET_Y =  25;//定义变量OFFSET_Y，小图的y轴的大小
    private static final int WIDTH    = 374;//定义变量WIDTH，stage宽度
    private static final int HEIGHT   = 243;//定义变量WEIGHT，stage的高度
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        primaryStage.setTitle("The Horse in Motion");//标题名字
        final ImageView imageView = new ImageView(IMAGE);//加在imageview
        imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));
        final Animation animation = new SpriteAnimation(
                imageView,
                Duration.millis(10000),//一幅图片需要停留的时间
                COUNT, 
                COLUMNS,
                OFFSET_X, 
                OFFSET_Y,
                WIDTH, 
                HEIGHT
        );
        animation.setCycleCount(Animation.INDEFINITE);//建立一个周期，周期为无限制
        animation.play();//动画开始
        primaryStage.setScene(new Scene(new Group(imageView)));
        primaryStage.show();
    }
}
