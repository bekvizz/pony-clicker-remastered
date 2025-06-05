package com.bekvizz.ponyclicker;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    private final Image icon = new Image(getClass().getResourceAsStream("/icons/icon_ph.png"));
    private final Rectangle2D bounds = Screen.getPrimary().getBounds();

    @Override
    public void start(Stage stage) {
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

        Scene scene = new Scene(root, 300d,200d);
        stage.setScene(scene);
        stage.setTitle("App");
        stage.getIcons().add(icon);
        stage.setMinWidth(scene.getWidth());
        stage.setMinHeight(scene.getHeight());
        stage.show();
        stage.setX(bounds.getWidth() * 0.5d - stage.getWidth() * 0.5d);
        stage.setY(bounds.getHeight() * 0.5d - stage.getHeight() * 0.5d);
    }

    public static void main(String[] args) {
        launch();
    }
}