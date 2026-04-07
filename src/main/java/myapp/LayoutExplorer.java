package myapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LayoutExplorer extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button fileButton = new Button("File");
        Button saveButton = new Button("Save");
        Button cancelButton = new Button("Cancel");

        HBox hBox = new HBox(fileButton, saveButton, cancelButton);
        hBox.setStyle("-fx-background-color: gold;");

        Label coursesLabel = new Label("Courses");
        Label courseLabel1 = new Label("CS101");
        Label courseLabel2 = new Label("CS201");
        Label courseLabel3 = new Label("CS221");
        Label courseLabel4 = new Label("CS301");

        VBox vBox = new VBox(coursesLabel, courseLabel1, courseLabel2, courseLabel3, courseLabel4);
        vBox.setPadding(new Insets(10));
        vBox.setSpacing(8);

        Label fNameLabel = new Label("First Name");
        TextField fNameField = new TextField();
        Label lNameLabel = new Label("Last Name");
        TextField lNameField = new TextField();

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(10));

        gridPane.add(fNameLabel, 0, 0);
        gridPane.add(fNameField, 0, 1);
        gridPane.add(lNameLabel, 1, 0);
        gridPane.add(lNameField, 1, 1);

        BorderPane root = new  BorderPane();
        root.setTop(hBox);
        root.setLeft(vBox);
        root.setCenter(gridPane);

        stage.setTitle("LayoutExplorer");
        stage.setScene(new Scene(root, 450, 300));
        stage.show();
    }
}
