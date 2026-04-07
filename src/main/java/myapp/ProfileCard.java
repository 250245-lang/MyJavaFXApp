package myapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ProfileCard extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Dr. Victor von Doom");
        label.setTextFill(Color.WHITE);
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

        HBox hBox = new HBox(label);
        hBox.setStyle("-fx-background-color: #2C3E50;");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20));

        gridPane.add(new Label("Department:"), 0, 0);
        gridPane.add(new Label("Multiverse Control"), 1, 0);

        gridPane.add(new Label("Year:"), 0, 1);
        gridPane.add(new Label("Senior"), 1, 1);

        gridPane.add(new Label("GPA:"), 0, 2);
        gridPane.add(new Label("4.00"), 1, 2);

        Label universityLabel = new Label("New Uzbekistan University");
        universityLabel.setPadding(new Insets(8));
        universityLabel.setAlignment(Pos.CENTER);
        universityLabel.setMaxWidth(Double.MAX_VALUE);
        universityLabel.setStyle("-fx-background-color: #ECF0F1; -fx-font-size: 13;");

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox);
        borderPane.setCenter(gridPane);
        borderPane.setBottom(universityLabel);

        StackPane root = new StackPane(borderPane);
        stage.setTitle("ProfileCard of Dr. Doom");
        stage.setScene(new Scene(root, 400, 200));
        stage.show();
    }
}
