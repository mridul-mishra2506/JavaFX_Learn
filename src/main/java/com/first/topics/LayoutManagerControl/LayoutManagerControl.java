package com.first.topics.LayoutManagerControl;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

/*
Layout: The arrangement of the components inside a container is called Layout.

Layout Manager: The JavaFx class that manages the layout of a container is called Layout Manager

There are 8 types of predefined layout manager in JavaFX.
1. BorderPane
2. FlowPane
3. GridPane
4. StackPane
5. AnchorPane
6. TilePane
7. HBox
8. VBox
 */
public class LayoutManagerControl {

    private static Button createButton(String name) {
        Button button = new Button();
        button.setText(name);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        // button.setMinSize(100,100);
        // BorderPane.setMargin(button, new Insets(10));
        // BorderPane.setAlignment(button, Pos.CENTER);
        return button;
    }

    /*
    public static BorderPane getControl(){

        Button top = createButton("Top");
        Button left = createButton("Left");
        Button bottom = createButton("Bottom");
        Button right = createButton("Right");
        Button center = createButton("Center");

        BorderPane borderPane = new BorderPane();

        borderPane.setTop(top);
        borderPane.setLeft(left);
        borderPane.setBottom(bottom);
        borderPane.setRight(right);
        borderPane.setCenter(center);
        borderPane.setPadding(new Insets(20));
    
        
        return borderPane;
    }
    
    public static FlowPane getControl() {

        Button b1 = createButton("Java");
        Button b2 = createButton("C/C++");
        b2.setPrefSize(70,50);
        Button b3 = createButton("C#");
        Button b4 = createButton("Objective C");
        Button b5 = createButton("Swift");
        Button b6 = createButton("Python");
        Button b7 = createButton("Scala");

        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10));
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.setAlignment(Pos.CENTER);
        flowPane.setOrientation(Orientation.VERTICAL);

        flowPane.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7);



        return flowPane;
    }

     */

    public static TilePane getControl(){

        Button b1 = createButton("Java");
        Button b2 = createButton("C/C++");
        b2.setPrefSize(70,50);


        
        Button b3 = createButton("C#");
        Button b4 = createButton("Objective C");
        // b4.setMaxSize(Double.MIN_NORMAL, Double.MIN_NORMAL);
        Button b5 = createButton("Swift");
        Button b6 = createButton("Python");
        Button b7 = createButton("Scala");

        TilePane tilePane = new TilePane();
        // TilePane.setAlignment(b4, Pos.TOP_LEFT);


        tilePane.setVgap(20);
        tilePane.setHgap(20);
        tilePane.setPadding(new Insets(20));
        // tilePane.setOrientation(Orientation.VERTICAL);
        // tilePane.setAlignment(Pos.CENTER);
        TilePane.setMargin(b3, new Insets(10));
        tilePane.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7);
        
        return tilePane;
    }

}
