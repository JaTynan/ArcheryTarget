package com.assessment1.archerytarget;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ArcheryTarget extends Application {

    public double circleRadiusChanger(double startSize) {

        double circleRadius = 0.0;
        double circleRateOfChange = 0.8;

        if (startSize > 0.0) {
            circleRadius = startSize * circleRateOfChange;
        }
        return circleRadius;

    }
    public double circleRadiusChanger(double startSize, double rate) {

        double circleRadius = 0.0;

        if (startSize > 0.0 && rate > 0) {
            circleRadius = startSize * rate;
        }
        return circleRadius;

    }

    @Override public void start(Stage stage) {

        double sceneWidth = 800;
        double sceneHeight = 600;
        double sceneMidWidth = sceneWidth / 2;
        double sceneMidHeight = sceneHeight /2;
        double circleRadius = 300.0;

        Group root = new Group();
        Scene scene = new Scene(root, sceneWidth, sceneHeight);
        scene.setFill(Color.LIGHTGREEN);

        Circle circleWhite = new Circle(sceneMidWidth, sceneMidHeight, circleRadius = circleRadiusChanger(circleRadius), Color.WHITE);
        Circle circleBlack = new Circle(sceneMidWidth, sceneMidHeight, circleRadius = circleRadiusChanger(circleRadius, 0.75), Color.BLACK);
        Circle circleCyan = new Circle(sceneMidWidth, sceneMidHeight, circleRadius = circleRadiusChanger(circleRadius, 0.75), Color.CYAN);
        Circle circleRed = new Circle(sceneMidWidth, sceneMidHeight, circleRadius = circleRadiusChanger(circleRadius, 0.6), Color.RED);
        Circle circleYellow = new Circle(sceneMidWidth, sceneMidHeight, circleRadius = circleRadiusChanger(circleRadius, 0.4), Color.GOLD);

        root.getChildren().add(circleWhite);
        root.getChildren().add(circleBlack);
        root.getChildren().add(circleCyan);
        root.getChildren().add(circleRed);
        root.getChildren().add(circleYellow);
        stage.setScene(scene);
        stage.setTitle("Archery Target");
        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
