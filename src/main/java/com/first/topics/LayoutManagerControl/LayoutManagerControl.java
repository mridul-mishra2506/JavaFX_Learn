package com.first.topics.LayoutManagerControl;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

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
     * public static BorderPane getControl(){
     * 
     * Button top = createButton("Top");
     * Button left = createButton("Left");
     * Button bottom = createButton("Bottom");
     * Button right = createButton("Right");
     * Button center = createButton("Center");
     * 
     * BorderPane borderPane = new BorderPane();
     * 
     * borderPane.setTop(top);
     * borderPane.setLeft(left);
     * borderPane.setBottom(bottom);
     * borderPane.setRight(right);
     * borderPane.setCenter(center);
     * borderPane.setPadding(new Insets(20));
     * 
     * 
     * return borderPane;
     * }
     * 
     * public static FlowPane getControl() {
     * 
     * Button b1 = createButton("Java");
     * Button b2 = createButton("C/C++");
     * b2.setPrefSize(70,50);
     * Button b3 = createButton("C#");
     * Button b4 = createButton("Objective C");
     * Button b5 = createButton("Swift");
     * Button b6 = createButton("Python");
     * Button b7 = createButton("Scala");
     * 
     * FlowPane flowPane = new FlowPane();
     * flowPane.setPadding(new Insets(10));
     * flowPane.setHgap(10);
     * flowPane.setVgap(10);
     * flowPane.setAlignment(Pos.CENTER);
     * flowPane.setOrientation(Orientation.VERTICAL);
     * 
     * flowPane.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7);
     * 
     * 
     * 
     * return flowPane;
     * }
     * 
     * 
     * 
     * public static TilePane getControl(){
     * 
     * Button b1 = createButton("Java");
     * Button b2 = createButton("C/C++");
     * b2.setPrefSize(70,50);
     * 
     * Button b3 = createButton("C#");
     * Button b4 = createButton("Objective C");
     * // b4.setMaxSize(Double.MIN_NORMAL, Double.MIN_NORMAL);
     * Button b5 = createButton("Swift");
     * Button b6 = createButton("Python");
     * Button b7 = createButton("Scala");
     * 
     * TilePane tilePane = new TilePane();
     * // TilePane.setAlignment(b4, Pos.TOP_LEFT);
     * 
     * 
     * tilePane.setVgap(20);
     * tilePane.setHgap(20);
     * tilePane.setPadding(new Insets(20));
     * // tilePane.setOrientation(Orientation.VERTICAL);
     * // tilePane.setAlignment(Pos.CENTER);
     * TilePane.setMargin(b3, new Insets(10));
     * tilePane.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7);
     * 
     * return tilePane;
     * }
     * 
     * 
     * 
     * public static HBox getControl() {
     * 
     * Button b1 = createButton("Button1");
     * Button b2 = createButton("Button2");
     * Button b3 = createButton("Button3");
     * Button b4 = createButton("Button4");
     * Button b5 = createButton("Button5");
     * 
     * HBox hBox = new HBox();
     * hBox.getChildren().addAll(b1, b2, b3, b4, b5);
     * HBox.setHgrow(b5, Priority.ALWAYS);
     * hBox.setSpacing(10);
     * hBox.setPadding(new Insets(10));
     * 
     * return hBox;
     * }
     * 
     * 
     * 
     * public static VBox getControl() {
     * 
     * Button b1 = createButton("Button1");
     * Button b2 = createButton("Button2");
     * Button b3 = createButton("Button3");
     * Button b4 = createButton("Button4");
     * Button b5 = createButton("Button5");
     * 
     * VBox vBox = new VBox();
     * vBox.getChildren().addAll(b1, b2, b3, b4, b5);
     * vBox.setVgrow(b5, Priority.ALWAYS);
     * vBox.setSpacing(10);
     * vBox.setPadding(new Insets(10));
     * 
     * return vBox;
     * }
     * 
     * 
     * 
     * public static GridPane getControl() {
     * 
     * Button b1 = createButton("Button1");
     * Button b2 = createButton("Button2");
     * Button b3 = createButton("Button3");
     * Button b4 = createButton("Button4");
     * Button b5 = createButton("Button5");
     * Button b6 = createButton("Button6");
     * 
     * GridPane gridPane = new GridPane();
     * gridPane.add(b1, 0, 0, 2, 2);
     * gridPane.add(b2, 2, 0, 1, 1);
     * gridPane.add(b3, 2, 1, 1, 1);
     * gridPane.add(b4, 0, 2, 1, 1);
     * gridPane.add(b5, 1, 2, 1, 1);
     * gridPane.add(b6, 2, 2, 1, 1);
     * gridPane.setHgap(10);
     * gridPane.setVgap(10);
     * gridPane.setPadding(new Insets(10));
     * 
     * return gridPane;
     * }
     * 
     * 
     * public static AnchorPane getControl() {
     * 
     * TextArea textArea = new TextArea();
     * Button b1 = new Button("Open");
     * Button b2 = new Button("Close");
     * AnchorPane anchorPane = new AnchorPane();
     * 
     * anchorPane.getChildren().addAll(textArea, b1, b2);
     * anchorPane.setTopAnchor(textArea, 10.0);
     * anchorPane.setLeftAnchor(textArea, 10.0);
     * anchorPane.setRightAnchor(textArea, 65.0);
     * anchorPane.setBottomAnchor(textArea, 10.0);
     * anchorPane.setTopAnchor(b1, 10.0);
     * anchorPane.setRightAnchor(b1, 10.0);
     * anchorPane.setBottomAnchor(b2, 10.0);
     * anchorPane.setRightAnchor(b2, 10.0);
     * 
     * return anchorPane;
     * }
     * 
     */

    public static StackPane getControl() {

        Rectangle r1 = new Rectangle(100, 100, Color.RED);
        Rectangle r2 = new Rectangle(200, 200, Color.ORANGE);
        Rectangle r3 = new Rectangle(300, 300, Color.YELLOW);
        Rectangle r4 = new Rectangle(400, 400, Color.GREEN);

        r1.setStroke(Color.BLACK);
        r2.setStroke(Color.BLACK);
        r3.setStroke(Color.BLACK);
        r4.setStroke(Color.BLACK);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(r4, r3, r2, r1);

        return stackPane;
    }
}
