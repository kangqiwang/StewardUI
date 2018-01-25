package com;

import java.io.IOException;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainView extends Application {
	private XYChart.Series<Number, Number> lineChart_U;
	private XYChart.Series<Number, Number> lineChart_I;
	private NumberAxis xAxis;
	private NumberAxis xAxis1;
	private Timeline animation;
	private Timeline animation1;
	private double hours = 0;
	private double hours1 = 0;
	private double minutes = 0;
	private double minutes1 = 0;
	private double timeInHours = 0;
	private double timeInHours1 = 0;
	private double prevY = 220;
	private double y = 220;
	public Stage primaryStage;
	public Stage stage = new Stage();
	// public Stage newStage;
	public Scene newScene;
	public BorderPane rootLayout;
	public static boolean i = true;

	public static void main(String[] args) {
		Application.launch(MainView.class, args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			stage.setTitle("昱通电器");
			// 设置title的图片
			stage.getIcons().add(new Image("com/photo/title.jpg"));
			// stage.show();

			initRootLayout("UI/Main_View.fxml");
			goto_desktop_unlogin();
			// goto_register();
			// this.event("UI/Desktop_unlogin.fxml");
		} catch (Exception e) {
			System.out.println("窗体打开出错啦");
		}
	}

	public void event(String event_name) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(event_name));
		AnchorPane page = (AnchorPane) loader.load();
		Scene newScene = new Scene(page);
//		newScene.getStylesheets().add(getClass().getResource("css/blackOnWhite.css").toExternalForm());
		primaryStage = new Stage();
		primaryStage.initModality(Modality.APPLICATION_MODAL);
		primaryStage.setScene(newScene);
		primaryStage.show();
	}

	// public void from_close(Stage primaryStage)
	// {
	// this.primaryStage=primaryStage;
	// primaryStage.hide();
	// }
	public void goto_register() throws Exception {
		Register_controller register = (Register_controller) replaceSceneContent("UI/register.fxml");
		register.setApp(this);

	}

	public void goto_administrator() throws Exception {

		Adcontroller ad = (Adcontroller) replaceSceneContent("UI/Administrator.fxml");
		ad.setApp(this);

	}

	public void goto_virtulcontrol() throws Exception {

		VirtulControl_controller virtul = (VirtulControl_controller) replaceSceneContent("UI/VirtulControl.fxml");
		virtul.setApp(this);

	}

	public void goto_login() throws Exception {

		Login_controller login = (Login_controller) replaceSceneContent("UI/Login.fxml");
		login.setApp(this);
	}

	public void goto_desktop_unlogin() {
		try {
			Desktop_unlogin_controller unlogin = (Desktop_unlogin_controller) replaceSceneContent("UI/Desktop_unlogin.fxml");
			unlogin.setApp(this);
		} catch (Exception ex) {
			System.out.println("goto_desktop_unlogin出错了");
		}
	}

	public void goto_desktop_login() {
		try {
			Desktop_login_controller login = (Desktop_login_controller) replaceSceneContent("UI/Desktop_login.fxml");
			login.setApp(this);
		} catch (Exception ex) {
			System.out.println("goto_desktop_login出错了");
		}
	}

	public void goto_Setting1() throws Exception {

		Setting1_controller login = (Setting1_controller) replaceSceneContent("UI/Setting1.fxml");
		login.setApp(this);
	}

	public void goto_Setting2() throws Exception {

		Setting2_controller login = (Setting2_controller) replaceSceneContent("UI/Setting2.fxml");
		login.setApp(this);
	}

	public void goto_Setting3() throws Exception {

		replaceSceneContent("UI/Setting3.fxml");
	}

	public void goto_Check1() throws Exception {

		replaceSceneContent("UI/Check1.fxml");
	}

	public void goto_Check2() throws Exception {

		replaceSceneContent("UI/Check2.fxml");
	}

	public void goto_Inquire1() throws Exception {

		inquire_1_controller login = (inquire_1_controller) replaceSceneContent("UI/Inquire1.fxml");
		login.setApp(this);
	}

	public void goto_Inquire2() throws Exception {

		inquire_2_controller login = (inquire_2_controller) replaceSceneContent("UI/Inquire2.fxml");
		login.setApp(this);
	}

	public void goto_Inquire3() throws Exception {

		inquire_3_controller login = (inquire_3_controller) replaceSceneContent("UI/Inquire3.fxml");
		login.setApp(this);
	}

	public void goto_Inquire4() throws Exception {

		inquire_4_controller login = (inquire_4_controller) replaceSceneContent("UI/Inquire4.fxml");
		login.setApp(this);
	}

	public void goto_Inquire5() throws Exception {

		inquire_5_controller login = (inquire_5_controller) replaceSceneContent("UI/Inquire5.fxml");
		login.setApp(this);
	}

	public void goto_Inquire6() throws Exception {

		inquire_6_controller login = (inquire_6_controller) replaceSceneContent("UI/Inquire6.fxml");
		login.setApp(this);
	}

	public void initRootLayout(String root_view) {
		try {
			rootLayout = new BorderPane();
			// 加载主窗口文件
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainView.class.getResource(root_view));
			rootLayout = (BorderPane) loader.load();

			// 显示主窗口的界面
			Scene scene = new Scene(rootLayout);
//			 scene.getStylesheets().add(getClass().getResource("css/blackOnWhite.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Initializable replaceSceneContent(String fxml) throws Exception {
		System.out.println(fxml);
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainView.class.getResource(fxml));
		AnchorPane page = (AnchorPane) loader.load();
		page.setPrefSize(1000, 550);
		rootLayout.setPrefSize(1000, 550);
		rootLayout.setCenter(page);
		stage.sizeToScene();
		System.out.println(rootLayout);
		System.out.println(stage);
		return (Initializable) loader.getController();
	}

//	public void check4_controller_show() {
//		final NumberAxis xAxis = new NumberAxis(1, 31, 1);
//		final NumberAxis yAxis = new NumberAxis();
//		final AreaChart<Number, Number> ac = new AreaChart<>(xAxis, yAxis);
//		XYChart.Series seriesApril = new XYChart.Series();
//		seriesApril.setName("P");
//		seriesApril.getData().add(new XYChart.Data(1, 17));
//		seriesApril.getData().add(new XYChart.Data(3, 10));
//		seriesApril.getData().add(new XYChart.Data(6, 15));
//		seriesApril.getData().add(new XYChart.Data(9, 15));
//		seriesApril.getData().add(new XYChart.Data(12, 14));
//		seriesApril.getData().add(new XYChart.Data(15, 18));
//		seriesApril.getData().add(new XYChart.Data(18, 15));
//		seriesApril.getData().add(new XYChart.Data(21, 13));
//		seriesApril.getData().add(new XYChart.Data(24, 19));
//		seriesApril.getData().add(new XYChart.Data(27, 21));
//		seriesApril.getData().add(new XYChart.Data(30, 21));
//		ac.setPrefSize(1000, 550);
//		AnchorPane page = new AnchorPane(ac);
//		page.setPrefSize(1000, 550);
//		ac.getData().addAll(seriesApril);
//		rootLayout.setCenter(page);
//		stage.sizeToScene();
//		stage.show();
//	}

	void check3_controller_show() {

		xAxis = new NumberAxis(0, 60, 5);

		final NumberAxis yAxis = new NumberAxis(160, 300, 10);
		final NumberAxis yAxis1 = new NumberAxis(160, 300, 10);
		yAxis1.setSide(Side.RIGHT);
		final LineChart<Number, Number> lc = new LineChart<Number, Number>(
				xAxis, yAxis);
		lc.setCreateSymbols(false);
		lc.setAnimated(false);
		lc.setLegendVisible(false);
		lc.setBlendMode(BlendMode.GREEN);
		lc.setTitle("U / T图");

		xAxis.setLabel("Time / S");

		xAxis.setForceZeroInRange(false);

		yAxis.setLabel("U /  V");

		xAxis.setTickLabelFormatter(new NumberAxis.DefaultFormatter(xAxis, null,
				"s"));

		// add starting data

		lineChart_U = new XYChart.Series<Number, Number>();

//		lineChart_U.setName("Hourly Data");

//		lineChart_I = new XYChart.Series<Number, Number>();
//
//		lineChart_I.setName("Minute Data");

		// create some starting data

		 lineChart_U.getData().add(
				new XYChart.Data<Number, Number>(timeInHours, prevY));

		for (double m = 0; m < (60); m++) {

			nextTime();

			plotTime();

		}
		// create timeline to add new data every 60th of second

		animation = new Timeline();

		animation.getKeyFrames().add(
				new KeyFrame(Duration.millis(1000 / 100),
						new EventHandler<ActionEvent>() {

							@Override
							public void handle(ActionEvent actionEvent) {

								// 6 minutes data per frame

								for (int count = 0; count < 6; count++) {

									nextTime();

									plotTime();

								}

							}

						}));

		animation.setCycleCount(Animation.INDEFINITE);
		animation.play();
		lc.getData().add(lineChart_U);

		
		lc.setPrefSize(1000, 550);
		AnchorPane page = new AnchorPane(lc);
		page.setPrefSize(1000, 550);
//		ac.getData().addAll(seriesApril);
		rootLayout.setCenter(page);
		stage.sizeToScene();
		stage.show();
	}
	void check4_controller_show() {
		xAxis1 = new NumberAxis(0, 60, 5);
		final NumberAxis yAxis = new NumberAxis(160, 300, 10);
		LineChart<Number,Number> lc = new LineChart<Number,Number>(xAxis1,yAxis);
//		yAxis.translateXProperty().bind(
//			    xAxis.widthProperty().divide(2)
//			);
//		yAxis.setTranslateZ(-1);
//		yAxis.setMinorTickCount(3);
		lc.setCreateSymbols(false);
		lc.setAnimated(false);
		lc.setLegendVisible(false);
		lc.setTitle("Q / T图");
		xAxis1.setLabel("Time / S");
		xAxis1.setForceZeroInRange(false);
		yAxis.setLabel("Q /  V");
//		xAxis.setTickLabelFormatter(new NumberAxis.DefaultFormatter(xAxis, null,
//				"s"));
		if(lineChart_I==null){
			lineChart_I = new XYChart.Series<Number, Number>();
		}
		

//		lineChart_U.setName("Hourly Data");
		 lineChart_I.getData().add(
				new XYChart.Data<Number, Number>(timeInHours1, y));
		for (double m = 0; m < (60); m++) {
			nextTime1();
			plotTime1();
		}
		animation1 = new Timeline();

		animation1.getKeyFrames().add(
				new KeyFrame(Duration.millis(1000 / 100),
						new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent actionEvent) {
								for (int count = 0; count < 6; count++) {
									nextTime1();
									plotTime1();
								}
							}
						}));
		animation1.setCycleCount(Animation.INDEFINITE);
		animation1.play();
		lc.getData().add(lineChart_I);
		lc.setPrefSize(1000, 550);
		AnchorPane page = new AnchorPane(lc);
		page.setPrefSize(1000, 550);
		rootLayout.setCenter(page);
		stage.sizeToScene();
		stage.show();
	}
	private void nextTime() {
		if (minutes == 59) {
			hours++;
			minutes = 0;
		} else {
			minutes++;
		}
		timeInHours = hours + ((1d / 60d) * minutes);
	}
	private void plotTime() {
		if ((timeInHours % 1) == 0) {
			prevY=Math.random()*40+200;
			lineChart_U.getData().add(
					new XYChart.Data<Number, Number>(timeInHours, prevY));
			if (timeInHours > 60)
				lineChart_U.getData().remove(0);
			if (timeInHours > 59) {
				xAxis.setLowerBound(xAxis.getLowerBound() + 1);
				xAxis.setUpperBound(xAxis.getUpperBound() + 1);
			}
		}
	}
	private void nextTime1() {
		if (minutes1 == 59) {
			hours1++;
			minutes1 = 0;
		} else {
			minutes1++;
		}
		
		timeInHours1 = hours1 + ((1d / 60d) * minutes1);
	}
	private void plotTime1() {
		if ((timeInHours1 % 1) == 0) {
			y=Math.random()*40+200;
			lineChart_I.getData().add(
					new XYChart.Data<Number, Number>(timeInHours1, y));
			if (timeInHours1 > 60)
				lineChart_I.getData().remove(0);
			if (timeInHours1 > 60) {
				xAxis1.setLowerBound(xAxis1.getLowerBound() + 1);
				xAxis1.setUpperBound(xAxis1.getUpperBound() + 1);
				
			}
		}
	}
}
