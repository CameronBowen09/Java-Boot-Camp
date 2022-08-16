package com.example.chapter3;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class page616ClickCounterAlert extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    Button btn;
    Label lbl;
    int iClickCount = 0;
    @Override public void start(Stage primaryStage)
    {
// Create the button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());
// Add the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
// Add the layout pane to a scene
        Scene scene = new Scene(pane, 250, 150);
// Add the scene to the stage, set the title
// and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();
    }
    public void buttonClick()
    {
        iClickCount++;
        if (iClickCount == 1)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION,
                    "You have clicked once." );
            a.showAndWait();
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked "
                    + iClickCount + " times.");
            a.showAndWait();
        }
    }
}