package myapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DiagonalLine extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Line line = new Line(0, 0, 400, 300);
        line.setStroke(Color.GREEN);
        line.setStrokeWidth(3);

        Pane root = new Pane(line);

        line.endXProperty().bind(root.widthProperty());
        line.endYProperty().bind(root.heightProperty());

        stage.setTitle("DiagonalLine");
        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }
}