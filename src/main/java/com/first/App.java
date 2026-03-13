package com.first;

import com.first.topics.PasswordFieldControl.PasswordFieldControl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        /*
         * // Stage Class
         * Group root = new Group();
         * Scene scene = new Scene(root, Color.BLACK);
         * stage.setScene(scene);
         * stage.setTitle("Tally");
         * Image image = new
         * Image(App.class.getResource("/images/accounting.png").toExternalForm());
         * stage.getIcons().add(image);
         * stage.setWidth(500);
         * stage.setHeight(500);
         * stage.setResizable(false);
         * stage.setX(50);
         * stage.setY(50);
         * stage.setFullScreen(true);
         * stage.setFullScreenExitHint("Press Q to exit full screen");
         * stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
         * stage.show();
         */

        /*
         * Schene is a container that contains Scene-graph.
         * Schene-graph is a collection of nodes
         * Types of nodes in scene-graph
         * 1. Root Node - having no parent
         * 2. Branch Node - having parent and child both
         * 3. Leaf Node - having no child
         */

        /*
         * // Scene Class
         * BorderPane borderPane = new BorderPane();
         * Scene scene = new Scene(borderPane, 500,400, Color.RED);
         * scene.setCursor(Cursor.E_RESIZE);
         * stage.setScene(scene);
         * stage.show();
         * 
         */

        /*
         * // Graphics Programming
         * Group group = new Group();
         * 
         * // Text Node
         * Text text = new Text();
         * text.setText("Welcome");
         * text.setX(50);
         * text.setY(50);
         * text.setFont(Font.font("algerian", 50));
         * text.setFill(Color.RED);
         * text.setStroke(Color.BLACK);
         * text.setStrokeWidth(0.5);
         * text.setStrikethrough(true);
         * group.getChildren().add(text);
         * 
         * // Line Node
         * Line line = new Line();
         * line.setStartX(100);
         * line.setStartY(100);
         * line.setEndX(200);
         * line.setEndY(100);
         * line.setStroke(Color.AQUA);
         * line.setStrokeWidth(5);
         * line.setOpacity(0.5);
         * group.getChildren().add(line);
         * 
         * // Rectangle Node
         * Rectangle rectangle = new Rectangle();
         * rectangle.setX(100);
         * rectangle.setY(150);
         * rectangle.setWidth(200);
         * rectangle.setHeight(300);
         * rectangle.setFill(Color.YELLOW);
         * rectangle.setStroke(Color.RED);
         * rectangle.setStrokeWidth(4);
         * rectangle.setArcWidth(20);
         * rectangle.setArcHeight(20);
         * group.getChildren().add(rectangle);
         * 
         * // Triangle Node
         * Polygon polygon = new Polygon(400,200,600,200,500,100);
         * polygon.setStroke(Color.BLACK);
         * polygon.setStrokeWidth(3);
         * polygon.setFill(Color.RED);
         * group.getChildren().add(polygon);
         * 
         * // Polyline Node
         * Polyline polyline = new Polyline(400,500,600,500,600,300);
         * polyline.setStroke(Color.YELLOW);
         * polyline.setStrokeWidth(3);
         * group.getChildren().add(polyline);
         * 
         * // Circle Node
         * Circle circle = new Circle(600,650, 100);
         * circle.setFill(Color.YELLOW);
         * circle.setStroke(Color.RED);
         * circle.setStrokeWidth(3);
         * group.getChildren().add(circle);
         * 
         * // Ellipse Node
         * Ellipse ellipse = new Ellipse(900,400,100,50);
         * ellipse.setFill(Color.BLUEVIOLET);
         * ellipse.setStroke(Color.PINK);
         * ellipse.setStrokeWidth(3);
         * group.getChildren().add(ellipse);
         * 
         * // Arc Node
         * Arc arc = new Arc();
         * arc.setCenterX(900);
         * arc.setCenterY(700);
         * arc.setRadiusX(100);
         * arc.setRadiusY(100);
         * arc.setStartAngle(90);
         * arc.setLength(90);
         * arc.setType(ArcType.ROUND);
         * group.getChildren().add(arc);
         * 
         * // ImageView Node
         * Image image = new Image(getClass().getResourceAsStream("/images/a.jpg"));
         * ImageView imageView = new ImageView(image);
         * imageView.setX(100);
         * imageView.setY(100);
         * group.getChildren().add(imageView);
         * 
         * // Quad Curve Node
         * QuadCurve quadCurve = new QuadCurve();
         * quadCurve.setStartX(100);
         * quadCurve.setStartY(100);
         * quadCurve.setControlX(250);
         * quadCurve.setControlY(50);
         * quadCurve.setEndX(400);
         * quadCurve.setEndY(100);
         * group.getChildren().add(quadCurve);
         * 
         * // Cubic Curve Node
         * CubicCurve cubicCurve = new CubicCurve();
         * cubicCurve.setStartX(100);
         * cubicCurve.setStartY(100);
         * cubicCurve.setEndX(500);
         * cubicCurve.setEndY(100);
         * cubicCurve.setControlX1(300);
         * cubicCurve.setControlY1(50);
         * cubicCurve.setControlX2(300);
         * cubicCurve.setControlY2(150);
         * group.getChildren().add(cubicCurve);
         * 
         * 
         * Scene scene = new Scene(group, 800, 600);
         * stage.setScene(scene);
         * stage.setTitle("Graphics Programming");
         * stage.show();
         * 
         */

        /*
         * // Text Class
         * 
         * BorderPane borderPane = new BorderPane();
         * Text text = new
         * Text("This is some text. Hello Mridul, Hello Mridul, Hello Mridul");
         * text.setFont(Font.font("calibri", FontWeight.BOLD, FontPosture.ITALIC, 50));
         * text.setFill(Color.RED);
         * text.setStroke(Color.YELLOW);
         * text.setStrokeWidth(2);
         * text.setStrikethrough(true);
         * text.setUnderline(true);
         * 
         * text.setEffect(new Reflection());
         * text.setEffect(new BoxBlur());
         * text.setEffect(new DropShadow());
         * text.setWrappingWidth(500);
         * text.setTextAlignment(TextAlignment.JUSTIFY);
         * borderPane.setCenter(text);
         * Scene scene = new Scene(borderPane, 600, 400);
         * stage.setScene(scene);
         * stage.setTitle("Text Class");
         * stage.show();
         * 
         */

        // JavaFx Controles

        Scene scene = new Scene(PasswordFieldControl.getControl(), 800, 700);
        stage.setScene(scene);
        stage.show();

    }

}
