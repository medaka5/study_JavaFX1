package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane, 320, 240);
        primaryStage.setScene(scene);

        // 文字列表示
        Label label = new Label("Hello");
        TextField field = new TextField();
        Button button = new Button("Click Me!");
        pane.setTop(label);
        pane.setCenter(field);
        pane.setBottom(button);

        class TempEventHandler implements EventHandler<ActionEvent> {
            public void handle(ActionEvent event) {
                String msg = "clicked!!";
                label.setText(msg);
            }
        }

        button.setOnAction(new TempEventHandler());

        primaryStage.show();


    }


}
