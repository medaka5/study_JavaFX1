package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        VBox pane = new VBox();
        Scene scene = new Scene(pane, 320, 240);
        primaryStage.setScene(scene);

        // 文字列表示
        Label label = new Label("Hello");
        TextField field = new TextField();
        Button button = new Button("Click Me!");
        CheckBox checkbox = new CheckBox("CheckMe!");

        checkbox.setSelected(true);
        checkbox.setOnAction(e->label.setText(checkbox.isSelected()?"Selected":"NotSelected"));

        ToggleGroup  toggleGroup = new ToggleGroup();
        RadioButton radio1 = new RadioButton();
        RadioButton radio2 = new RadioButton();
        radio1.setToggleGroup(toggleGroup);
        radio2.setToggleGroup(toggleGroup);
        radio1.setSelected(true);


        pane.getChildren().addAll(label, field,button,checkbox, radio1, radio2);


        button.setOnAction(e->{
                String msg = "clicked!!";
                label.setText(msg);
        });

        primaryStage.show();
    }


}
