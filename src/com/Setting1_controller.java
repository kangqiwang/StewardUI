package com;

import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.CheckTreeView;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Setting1_controller implements Initializable{
	@FXML private  Button concel_setting1;
	@FXML private Button ok_setting1;
	@FXML private AnchorPane treeAnchorpane=new AnchorPane();
	
	private Stage stage;
	public void setDialogStage(Stage stage) {
		this.stage= stage;
}
	@FXML
	private ChoiceBox<String> choiceBox;
	private ObservableList<String> choiceboxList = FXCollections.observableArrayList();
	//定义常量使树有一个图片的显示
	private final Node rootIcon = new ImageView(
		        new Image(getClass().getResourceAsStream("photo/computer.jpg")));
	
	private MainView application;
	   
    public void setApp(MainView application){
        this.application = application;
    }
	@FXML
	private void concel(ActionEvent event){
//		stage.close();
	}
	@FXML
	private void ok(ActionEvent event){
//		stage.close();
	}
	//choicebox事件，实际的效果与理想不符
	/**
	 * 有部分问题
	 * @param event
	 */
	@FXML
	private void choicebox_event(ActionEvent event)
	{
		
		if (choiceBox.getValue().equals("管理员")) {
			checktreeview_manager();
		}
		else {
			System.out.println(choiceBox.getValue());
			checktreeview_user();
		}
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		choicebox();//初始化choicebox的数据
		checktreeview_manager();
		choiceBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> arg0,
					String arg1, String arg2) {
				// TODO Auto-generated method stub
				if (arg1.equals("用户")) {
					checktreeview_manager();//初始化界面后，界面无法进行刷新
				} else {
					checktreeview_user();
				}
				
			}
		    });
	}
	/**
	 * 创建管理员的树形结构图
	 * 权限暂时不是很明确，出来了一部分
	 * string类暂时用着
	 */
	public void checktreeview_manager(){
	    CheckBoxTreeItem<String> rootItem = new CheckBoxTreeItem<String> ("昱通智能物业管家软件",rootIcon);
        CheckBoxTreeItem<String> runcontoller = new CheckBoxTreeItem<String> ("运行控制");
        CheckBoxTreeItem<String> managercontroller = new CheckBoxTreeItem<String> ("管理控制");
        CheckBoxTreeItem<String> lightsystem=new CheckBoxTreeItem<String> ("照明系统");
        CheckBoxTreeItem<String> watersystem = new CheckBoxTreeItem<String> ("给排水系统");
        CheckBoxTreeItem<String> watersystem_give = new CheckBoxTreeItem<String> ("给水控制");
        CheckBoxTreeItem<String> watersystem_discharge= new CheckBoxTreeItem<String> ("排水控制");
        CheckBoxTreeItem<String> user= new CheckBoxTreeItem<String> ("修改用户");
        CheckBoxTreeItem<String> log= new CheckBoxTreeItem<String> ("修改日志");
        

        rootItem.setExpanded(true);
        rootItem.getChildren().addAll(runcontoller,managercontroller,user,log);
        runcontoller.getChildren().addAll(lightsystem,watersystem);
        watersystem.getChildren().addAll(watersystem_discharge,watersystem_give);
        final CheckTreeView<String> checkTreeView = new CheckTreeView<>(rootItem);
        treeAnchorpane.getChildren().add(checkTreeView);
        checkTreeView.prefHeightProperty().bind(treeAnchorpane.heightProperty());
        checkTreeView.prefWidthProperty().bind(treeAnchorpane.widthProperty());
	}
	/**
	 * 创建checktreeview的用户树形
	 * 类型有问题，暂时string
	 */
	public void checktreeview_user(){
		  CheckBoxTreeItem<String> rootItem = new CheckBoxTreeItem<String> ("昱通智能物业管家软件",rootIcon);
	        CheckBoxTreeItem<String> runcontoller = new CheckBoxTreeItem<String> ("运行控制");
	        CheckBoxTreeItem<String> managercontroller = new CheckBoxTreeItem<String> ("管理控制");
	        CheckBoxTreeItem<String> lightsystem=new CheckBoxTreeItem<String> ("照明系统");
	        CheckBoxTreeItem<String> watersystem = new CheckBoxTreeItem<String> ("给排水系统");
	        rootItem.setExpanded(true);
	        rootItem.getChildren().addAll(runcontoller,managercontroller);
	        runcontoller.getChildren().addAll(lightsystem,watersystem);
	        final CheckTreeView<String> checkTreeView = new CheckTreeView<>(rootItem);
	        treeAnchorpane.getChildren().add(checkTreeView);
	        checkTreeView.prefHeightProperty().bind(treeAnchorpane.heightProperty());
	        checkTreeView.prefWidthProperty().bind(treeAnchorpane.widthProperty());
	}
	/**
	 * choicebox数据的建立
	 */
	public void choicebox(){
		choiceBox.setItems(choiceboxList);
		choiceboxList.add(new String("管理员"));
		choiceboxList.add(new String("用户"));
		choiceBox.setValue("管理员");
	}
}
