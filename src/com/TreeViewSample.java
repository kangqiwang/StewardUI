package com;
import org.controlsfx.control.CheckTreeView;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class TreeViewSample extends Application {

    private final Node rootIcon = new ImageView(
        new Image(getClass().getResourceAsStream("photo/computer.jpg"))
    );

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tree View Sample");        
        CheckBoxTreeItem<String> rootItem = new CheckBoxTreeItem<String> ("��ͨ������ҵ�ܼ����",rootIcon);
        CheckBoxTreeItem<String> runcontoller = new CheckBoxTreeItem<String> ("���п���");
        CheckBoxTreeItem<String> managercontroller = new CheckBoxTreeItem<String> ("�������");
        CheckBoxTreeItem<String> lightsystem=new CheckBoxTreeItem<String> ("����ϵͳ");
        CheckBoxTreeItem<String> watersystem = new CheckBoxTreeItem<String> ("����ˮϵͳ");
        rootItem.setExpanded(true);
        rootItem.getChildren().addAll(runcontoller,managercontroller);
        runcontoller.getChildren().addAll(lightsystem,watersystem);
        final CheckTreeView<String> checkTreeView = new CheckTreeView<>(rootItem);
        checkTreeView.setRoot(rootItem);
        checkTreeView.setShowRoot(true);
        AnchorPane root = new AnchorPane();
        root.getChildren().add(checkTreeView);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}