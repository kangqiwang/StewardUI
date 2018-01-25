package testing;

import jacky.data.DataEnumConstants.DeviceModuleType;
import jacky.data.DataEnumConstants.RegisterType;
import jacky.data.DataEnumConstants.RunningLogType;
import jacky.data.DataEnumConstants.Status;
import jacky.data.DataEnumConstants.UserPermission;
import jacky.data.DataEnumConstants.UserType;
import jacky.data.Device;
import jacky.data.DeviceCategory;
import jacky.data.DeviceInfo;
import jacky.data.DeviceInfomations;
import jacky.data.Devices;
import jacky.data.Repair;
import jacky.data.Repaires;
import jacky.data.Response;
import jacky.data.RunningLog;
import jacky.data.RunningLogs;
import jacky.data.Schedule;
import jacky.data.Schedules;
import jacky.data.User;
import jacky.data.UserModule;
import jacky.data.Users;
import jacky.data.devicedata.DeviceStatus;
import jacky.data.devicedata.DeviceStatuses;
import jacky.data.devicedata.DrainagePump;
import jacky.data.devicedata.DrainagePumpParameter;
import jacky.data.devicedata.DrainagePumps;
import jacky.data.management.DataCenter;

import java.io.File;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.MainView;
public class testing_01 {
	
	Stage stage=new Stage();
	public static void main(String[] args) {
		Application.launch(MainView.class, args);
	}

	public void start(Stage primaryStage) {
			stage = primaryStage;
			stage.setTitle("昱通电器");
			// 设置title的图片
			stage.getIcons().add(new Image("com/photo/title.jpg"));
			// stage.show();

	}
	

	public void check3_controller_show() {
		final CategoryAxis xAxis = new CategoryAxis();
		final NumberAxis yAxis = new NumberAxis();
		xAxis.setLabel("Month");
		xAxis.setLabel("Amount of Month");
		final LineChart lineChart = new LineChart(xAxis, yAxis);
		lineChart.setTitle("Stock Monitoring, 2013");
		XYChart.Series[] series = new XYChart.Series[5];
		for (int i = 0; i < series.length; i++) {
			series[i] = new XYChart.Series();
			series[i].setName("Portfolio #" + i);
			ObservableList data = series[i].getData();
			for (int j = 0; j < 12; j++) {
				data.add(new XYChart.Data(getMonth(j), getRandom(-20, 100)));
			}
		}
		lineChart.setPrefSize(1000, 550);
		AnchorPane page = new AnchorPane(lineChart);
		page.setPrefSize(1000, 550);
		lineChart.getData().addAll(series);
		Scene scene=new Scene(page);
		stage.setScene(scene);
		stage.show();
	}

	
	protected Task<String > creatTask(){
		
		
		
		
		return new Task<String>() {

			@Override
			protected String call() throws Exception {
				for (int i = 0; i < 10; i++) {
					
				}
				
				
				
				return null;
			}
		};
		
		
	}
	private double getRandom(double start, double end) {
		return (Math.random() * (end - start)) + start;
	}

	public String getMonth(int month) {
		return new DateFormatSymbols().getMonths()[month];
	}

}
