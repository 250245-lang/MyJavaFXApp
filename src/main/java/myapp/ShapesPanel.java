package myapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShapesPanel extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle rectangle = new Rectangle(80, 60);
        rectangle.setFill(Color.RED);
        rectangle.setArcHeight(20);
        rectangle.setArcWidth(20);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(2);

        Circle circle = new Circle(40);
        circle.setFill(Color.BLUE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        Ellipse ellipse = new Ellipse(50, 30);
        ellipse.setFill(Color.GREEN);
        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(2);

        HBox root = new HBox(rectangle, circle, ellipse);
        root.setSpacing(20);
        root.setPadding(new Insets(20));
        stage.setTitle("Shapes");
        stage.setScene(new Scene(root, 400, 200));
        stage.show();
    }
}
