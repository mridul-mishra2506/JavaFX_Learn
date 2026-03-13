package com.first.topics.PasswordFieldControl;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class PasswordFieldControl {

    public static HBox getControl() {

        PasswordField passwordField = new PasswordField();
        Label label = new Label();
        label.setFont(Font.font("Roboto", FontWeight.BOLD, 14));

        passwordField.setSkin(new MySkin(passwordField));
        passwordField.setFont(Font.font(30));

        passwordField.onKeyReleasedProperty().set(e -> {
            int length = passwordField.getText().length();
            if (length == 0) {
                label.setText("Please enter some password");
                label.setTextFill(Color.BLACK);
            } else if (length < 4) {
                label.setText("Weak");
                label.setTextFill(Color.RED);
            } else if (length < 9) {
                label.setText("Medium");
                label.setTextFill(Color.BLUE);
            } else {
                label.setText("Strong");
                label.setTextFill(Color.GREEN);
            }
        });

        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(10));
        hBox.getChildren().add(passwordField);
        hBox.getChildren().add(label);

        return hBox;
    }
}
