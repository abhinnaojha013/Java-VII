package com.example.javafx;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application implements EventHandler {
    private String username = "admin";
    private String password = "admin";
    Button button = null;
    Text sceneTitle;
    Label userName, pw;
    TextField usernameBox;
    PasswordField passwordBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaFX login form");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridPane.add(sceneTitle, 0, 0, 2, 1);

        userName = new Label("Username: ");
        gridPane.add(userName, 0, 1);

        pw = new Label("Password: ");
        gridPane.add(pw, 0, 2);

        usernameBox = new TextField();
        gridPane.add(usernameBox, 1, 1);

        passwordBox = new PasswordField();
        gridPane.add(passwordBox, 1, 2);

        button = new Button("Sign in");
        HBox hbButton = new HBox(10);
        hbButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbButton.getChildren().add(button);
        gridPane.add(hbButton, 1, 4);

        button.setOnAction(this::handle);

        Scene scene = new Scene(gridPane, 300, 275);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void handle(Event event) {
        if(event.getSource() == button) {
            usernameBox.setText("Abhinna");
            passwordBox.setText("Abhinna013");
        }
    }
}
