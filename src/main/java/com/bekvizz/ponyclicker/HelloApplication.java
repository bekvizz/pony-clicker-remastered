package com.bekvizz.ponyclicker;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private final Image icon = new Image(getClass().getResourceAsStream("/icons/icon_ph.png"));

    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Label label = new Label();
        Button btn1 = new Button("Say hi");



        StackPane root = new StackPane();
        StackPane.setAlignment(btn1, Pos.CENTER);
        btn1.setOnAction(event -> {
            StackPane.setAlignment(label, Pos.TOP_CENTER);
            StackPane.setMargin(label, new Insets(15d));
            label.setBackground(Background.fill(Paint.valueOf("#bababa")));
            label.setText("Hello!");
        });


        root.getChildren().add(btn1);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 300d,100d);
        stage.setScene(scene);
        stage.setTitle("App");
        stage.getIcons().add(icon);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}