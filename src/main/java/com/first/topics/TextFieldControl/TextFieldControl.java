package com.first.topics.TextFieldControl;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class TextFieldControl {
    public static HBox getControl() {

        TextField textField = new TextField();
        textField.setPromptText("Enter your name");
        textField.setFocusTraversable(false);
        textField.setText("MRIDUL MISHRA");
        textField.setDisable(true);

        EventHandler<ActionEvent> eventHandler = (ActionEvent e) -> {
            System.out.println("You entered: " + textField.getText());
            textField.clear();
        };

        textField.setOnAction(eventHandler);

        HBox hBox = new HBox();

        hBox.getChildren().add(textField);
        return hBox;
    }
}
