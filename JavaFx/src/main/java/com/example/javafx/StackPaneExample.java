package com.example.javafx;

// Java Program to create a flowpane

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class StackPaneExample extends Application {
    @Override
    public void start(Stage stage) {
//draw a sphere
        Sphere sph = new Sphere(50);
//text creation
        Text t = new Text("DEMO");
//Set font of the text
        t.setFont(Font.font(null, FontWeight.BOLD, 13));
//Set color of the text
        t.setFill(Color.RED);
//set position of the text
        t.setX(20);
        t.setY(50);
//Create a Stackpane
        StackPane sp = new StackPane();
        ObservableList list = sp.getChildren();
//Add nodes to the pane
        list.addAll( sph, t);
// Scene creation
        Scene scene = new Scene(sp);
// Title set
        stage.setTitle("Example for BorderPane");
// Scene setting
        stage.setScene(scene);
        stage.show();
    }
    // Main Method
    public static void main(String args[])
    {
//method to launch the JavaFX application
        launch(args);
    }
}