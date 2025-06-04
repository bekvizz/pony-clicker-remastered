package com.bekvizz.ponyclicker;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Test extends Application {
    private final Rectangle2D bounds = Screen.getPrimary().getBounds();

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();

        Button btn1 = new Button();
        btn1.setText("Click Me");
        btn1.setAlignment(StackPane.setMargin(btn1, ));
        btn1.setOnAction(e -> {

        });

        Scene scene = new Scene(root, 400d,200d);
        primaryStage.setTitle("Ponyclicker");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setX(bounds.getWidth() * 0.5d - primaryStage.getWidth() * 0.5d);
        primaryStage.setY(bounds.getHeight() * 0.5d - primaryStage.getHeight() * 0.5d);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
