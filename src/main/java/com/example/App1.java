package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("plannerlist.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
