package myapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Text name = new Text("Muxammad Suyunov");
        name.setFont(Font.font("Times New Roman",  FontWeight.BOLD, FontPosture.ITALIC, 20));

        Text studentId = new Text("ID: 250245");
        studentId.setFill(Color.GREEN);

        VBox vBox = new VBox(10, name, studentId);
        vBox.setAlignment(Pos.CENTER);

        StackPane root = new StackPane(vBox);
        stage.setTitle("Student Card");
        stage.setScene(new Scene(root, 300, 150));
        stage.show();
    }
}
