package myapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TrafficLight extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Circle  circle1 = new Circle(30);
        circle1.setFill(Color.RED);
        circle1.setStrokeWidth(2);
        circle1.setStroke(Color.DARKGRAY);

        Circle  circle2 = new Circle(30);
        circle2.setFill(Color.YELLOW);
        circle2.setStrokeWidth(2);
        circle2.setStroke(Color.DARKGRAY);

        Circle  circle3 = new Circle(30);
        circle3.setFill(Color.GREEN);
        circle3.setStrokeWidth(2);
        circle3.setStroke(Color.DARKGRAY);

        Text text = new Text("Stop");
        text.setFont(Font.font("Times New Roman",  FontWeight.BOLD, FontPosture.REGULAR, 18));

        VBox vBox = new VBox(circle1, circle2, circle3, text);
        vBox.setSpacing(5);
        vBox.setPadding(new Insets(20));
        vBox.setAlignment(Pos.CENTER);

        circle1.setOpacity(1);
        circle2.setOpacity(0.3);
        circle3.setOpacity(0.3);

        StackPane root = new StackPane(vBox);
        stage.setTitle("TrafficLight");
        Scene scene = new Scene(root, 300, 500);
        scene.setFill(Color.DARKGRAY);
        stage.setScene(scene);
        stage.show();
    }
}
