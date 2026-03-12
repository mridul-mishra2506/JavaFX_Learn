package com.first.topics.LabelControl;

import com.first.App;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LabelControl {

    public static BorderPane getControl() {

        ImageView imageView = new ImageView(new Image(App.class.getResourceAsStream("/images/accounting.png")));
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);
        Label label = new Label();
        label.setText("Hello World");
        label.setGraphic(imageView);
        label.setGraphicTextGap(50);
        label.setFont(Font.font("Roboto", FontWeight.BOLD, 50));
        label.setRotate(270);

         BorderPane borderPane = new BorderPane();
        borderPane.setCenter(label);

        return borderPane;
    }
}
