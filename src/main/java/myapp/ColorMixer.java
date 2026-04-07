package myapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ColorMixer extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        double r = 0.2235;
        double g = 1;
        double b = 0.0784;
        Rectangle rectangle = new Rectangle(200, 200, new Color(r, g, b, 1));
        Label rLabel = new Label(String.format("R: %.2f", r));
        Label gLabel = new Label(String.format("G: %.2f", g));
        Label bLabel = new Label(String.format("B: %.2f", b));

        Text text = new Text(String.format("#%02x%02x%02x", (int)(r*255),(int)(g*255),(int)(b*255)));
        text.setFont(Font.font("Times New Roman",  FontWeight.BOLD, FontPosture.REGULAR, 18));

        VBox vBox = new VBox(rectangle, rLabel, gLabel, bLabel, text);
        vBox.setSpacing(8);
        vBox.setPadding(new Insets(20));
        vBox.setAlignment(Pos.CENTER);

        StackPane root = new StackPane(vBox);
        stage.setTitle("Student Card");
        stage.setScene(new Scene(root, 300, 400));
        stage.show();
    }
}
