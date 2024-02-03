package com.saucedo.lab01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Lab01_Pt2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lab 01_Pt2"); // Set the stage title
        //Create borderpane and gridpane
        BorderPane root = new BorderPane();
       //Top Pane //
        GridPane top = new GridPane();

        //Adding Top Border
        top.setBorder(new Border(new BorderStroke(Color.DARKGREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        top.add(new Label("Enter a new Message:"), 0, 0);
        TextField txt = new TextField();
        top.add(txt, 1, 0);

        root.setTop(top);

        //Center Pane //
        Pane center = new Pane();
        Text cntrTxt = new Text("");
        cntrTxt.textProperty().bind(txt.textProperty());

        center.getChildren().add(cntrTxt);
        cntrTxt.setY(45);

        root.setCenter(center);

        //Left Pane //
        GridPane left = new GridPane();

        //Adding Left Border
        left.setBorder(new Border(new BorderStroke(Color.DARKGREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        //Radio Buttons
        RadioButton radio1 = new RadioButton("Red");
        radio1.setOnAction((ActionEvent e) -> {
             cntrTxt.setFill(Color.RED);
        });
        RadioButton radio2 = new RadioButton("Blue");
        radio2.setOnAction((ActionEvent e) -> {
            cntrTxt.setFill(Color.BLUE);
        });
        RadioButton radio3 = new RadioButton("Green");
        radio3.setOnAction((ActionEvent e) -> {
            cntrTxt.setFill(Color.GREEN);
        });

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

        //Adding Right Border
        right.setBorder(new Border(new BorderStroke(Color.DARKGREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        //CheckBoxes
        CheckBox chk1 = new CheckBox("Bold");
        CheckBox chk2 = new CheckBox("Italic");

        right.add(chk1, 0, 0);
        right.add(chk2, 0, 1);

        Font fontBold = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 20);
        Font fontItalic = Font.font("Verdana", FontWeight.NORMAL, FontPosture.ITALIC, 20);
        Font fontBoldItalic = Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 20);
        Font fontNormal = Font.font("Verdana", FontWeight.NORMAL, FontPosture.REGULAR, 20);

        //Set Font Default
        cntrTxt.setFont(fontNormal);
        
        //Modify on Event
        EventHandler<ActionEvent> checkFont = e -> {
            if (chk1.isSelected() && chk2.isSelected()) {
                cntrTxt.setFont(fontBoldItalic);
            }
            else if (chk1.isSelected()) {
                cntrTxt.setFont(fontBold);
            }
            else if (chk2.isSelected()) {
                cntrTxt.setFont(fontItalic);
            }
            else {
                cntrTxt.setFont(fontNormal);
            }
        };

        chk1.setOnAction(checkFont);
        chk2.setOnAction(checkFont);

        root.setRight(right);

        //Bottom Pane //
        FlowPane bottom = new FlowPane();

        //Adding Bottom Border
        bottom.setBorder(new Border(new BorderStroke(Color.DARKGREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        //Buttons
        Button bttn1 = new Button("Left");
        Button bttn2 = new Button("Right");

        //Center Align Buttons
        bottom.setAlignment(Pos.CENTER);

        //Shift Text
        bttn1.setOnAction((ActionEvent e) -> {
            cntrTxt.setX(cntrTxt.getX() - 10);
        });

        bttn2.setOnAction((ActionEvent e) -> {
            cntrTxt.setX(cntrTxt.getX() + 10);
        });

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