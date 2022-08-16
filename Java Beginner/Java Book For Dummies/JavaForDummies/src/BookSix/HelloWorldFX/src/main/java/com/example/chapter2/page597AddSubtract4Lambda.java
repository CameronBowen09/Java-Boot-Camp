package com.example.chapter2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class page597AddSubtract4Lambda extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;
    @Override public void start(Stage primaryStage)
    {
// Create the Add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction( e -> //→25
        {
            iCounter++;
            lbl.setText(Integer.toString(iCounter));
        } );
// Create the Subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction( e -> //→34
        {
            iCounter--;
            lbl.setText(Integer.toString(iCounter));
        } );
// Create the Label
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));
// Add the buttons and label to an HBox pane
        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl, btnAdd, btnSubtract);
// Add the layout pane to a scene
        Scene scene = new Scene(pane, 200, 75);
// Add the scene to the stage, set the title
// and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add/Sub");
        primaryStage.show();
    }
}
/*
→25 This statement uses a lambda expression to add an event handler to the
Add button. The method body of this lambda expression increments the
counter variable and then sets the label text to reflect the updated value.
→34 This statement uses a similar lambda expression to create the event
handler for the Subtract button. The only difference between this
lambda expression and the one for the Add button is that here the
counter variable is decremented instead of incremented.
 */