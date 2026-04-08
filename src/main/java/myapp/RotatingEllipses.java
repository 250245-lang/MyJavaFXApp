package myapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

class EllipsePane extends Pane{
    @Override
    protected void setWidth(double v) {
        this.paintEllipses();
        super.setWidth(v);
    }

    @Override
    protected void setHeight(double v) {
        this.paintEllipses();
        super.setHeight(v);
    }

    private void paintEllipses(){
        this.getChildren().clear();
        for (int i = 0; i < 16; i++) {
            Ellipse ellipse = new Ellipse(
                    this.getWidth()/2,
                    this.getHeight()/2,
                    this.getWidth()/2 - 50,
                    this.getHeight()/2 - 50
            );
            ellipse.setFill(Color.WHITE);
            ellipse.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
//            ellipse.setStrokeWidth(2);
            ellipse.setRotate(i * 180.0/16);
            this.getChildren().add(ellipse);
        }
    }
}

public class RotatingEllipses extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        EllipsePane ellipsePane = new EllipsePane();
        ellipsePane.setHeight(500);

        StackPane root = new StackPane(ellipsePane);
        stage.setTitle("Rotating Ellipses");
        stage.setScene(new Scene(root, 500, 500));
        stage.show();
    }
}

