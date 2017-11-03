package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Stage : Window全体
        // Scene : Stageの中。paneが必要
        // Pane  : Layout的なもの？
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane, 320, 240);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
