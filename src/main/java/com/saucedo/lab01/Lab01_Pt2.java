package com.saucedo.lab01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Lab01_Pt2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lab 01_Pt2"); // Set the stage title
        //Create borderpane and gridpane
        BorderPane root = new BorderPane();
       //Top Pane //
        GridPane top = new GridPane();


        root.setTop(top);

        //Center Pane //
        Pane center = new Pane();
        root.setCenter(center);

        //Left Pane //
        GridPane left = new GridPane();
        //Radio Buttons
        RadioButton radio1 = new RadioButton("Red");
        RadioButton radio2 = new RadioButton("Blue");
        RadioButton radio3 = new RadioButton("Green");

        //Make group for radio buttons
        ToggleGroup group = new ToggleGroup();
        radio1.setToggleGroup(group);
        radio2.setToggleGroup(group);
        radio3.setToggleGroup(group);

        left.add(radio1, 0, 0);
        left.add(radio2, 0, 1);
        left.add(radio3, 0, 2);

        root.setLeft(left);

        //Right Pane //
        GridPane right = new GridPane();
        //CheckBoxes
        CheckBox chk1 = new CheckBox("Bold");
        CheckBox chk2 = new CheckBox("Italic");

        right.add(chk1, 0, 0);
        right.add(chk2, 0, 1);

        root.setRight(right);

        //Bottom Pane //
        FlowPane bottom = new FlowPane();
        //Buttons
        Button bttn1 = new Button("Left");
        Button bttn2 = new Button("Right");

        //Center Align Buttons
        bottom.setAlignment(Pos.CENTER);

        bottom.getChildren().add(bttn1);
        bottom.getChildren().add(bttn2);

        root.setBottom(bottom);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}