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
	//IMAGE�ļ���
    private static final Image IMAGE = new Image("com/photo/handle.jpg");
    private static final int COLUMNS  =  1;//���峣��COLUMNS��4��
    private static final int COUNT    =  4;//���峣��COUNT,�����ܹ��ж��ٸ�����
    private static final int OFFSET_X =  18;//�������OFFSET_X��Сͼ��x��Ĵ�С
    private static final int OFFSET_Y =  25;//�������OFFSET_Y��Сͼ��y��Ĵ�С
    private static final int WIDTH    = 374;//�������WIDTH��stage���
    private static final int HEIGHT   = 243;//�������WEIGHT��stage�ĸ߶�
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        primaryStage.setTitle("The Horse in Motion");//��������
        final ImageView imageView = new ImageView(IMAGE);//����imageview
        imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));
        final Animation animation = new SpriteAnimation(
                imageView,
                Duration.millis(10000),//һ��ͼƬ��Ҫͣ����ʱ��
                COUNT, 
                COLUMNS,
                OFFSET_X, 
                OFFSET_Y,
                WIDTH, 
                HEIGHT
        );
        animation.setCycleCount(Animation.INDEFINITE);//����һ�����ڣ�����Ϊ������
        animation.play();//������ʼ
        primaryStage.setScene(new Scene(new Group(imageView)));
        primaryStage.show();
    }
}
