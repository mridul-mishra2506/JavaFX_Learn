package com.first.topics.ButtonControl;

import com.first.App;

import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ButtonControl 
// implements EventHandler<ActionEvent>
 {

    static Button button;
    
       
    static int count = 0;

    public static BorderPane getControl() {

        button = new Button();
        button.setText("Count - " + count);
        ImageView imageView = new ImageView(new Image(App.class.getResourceAsStream("/images/accounting.png")));
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);
        button.setGraphic(imageView);
        button.setFont(Font.font("Algerian", FontWeight.BOLD, 50));
        button.setCursor(Cursor.HAND);
        // button.setRotate(90);

        // EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
        //     @Override
        //     public void handle(ActionEvent e){
        //         System.out.println("Button Pressed");
        //     }
        // };
        // button.setOnAction(new EventHandler<ActionEvent>() {
        //     @Override
        //     public void handle(ActionEvent e) {
        //         System.out.println("Button Pressed");
        //     }
        // });
        // button.setOnAction((e) -> {
        //     System.out.println(e.toString());
        // });

        // Custom Handler
        // button.setOnAction(new ButtonControl()::myhandle); // for non-static handler functions

        button.setOnAction(ButtonControl::myhandle); // for static handler functions


         BorderPane borderPane = new BorderPane();
        borderPane.setCenter(button);



        return borderPane;
    }

    public static void myhandle(ActionEvent e){
        button.setText("Count - " + ++count);
    }

    // @Override
    // public void handle(ActionEvent e) {
    //     System.out.println("Hello Mridul");
    // }
}
