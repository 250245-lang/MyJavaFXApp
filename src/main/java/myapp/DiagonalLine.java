package myapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DiagonalLine extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Line line = new Line(0, 0, 400, 300);
        line.setStroke(Color.GREEN);
        line.setStrokeWidth(3);

        Pane pane = new Pane(line);

        StackPane root = new StackPane(pane);

        line.endXProperty().bind(pane.widthProperty());
        line.endYProperty().bind(pane.heightProperty());

        stage.setTitle("DiagonalLine");
        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }
}