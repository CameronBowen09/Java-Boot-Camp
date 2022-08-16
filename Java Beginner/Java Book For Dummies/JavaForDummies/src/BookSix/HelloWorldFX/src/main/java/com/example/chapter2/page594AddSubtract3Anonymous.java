package com.example.chapter2;



import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class page594AddSubtract3Anonymous extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) {
// Create the Add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(
                new EventHandler<ActionEvent>() //→26
        {
            public void handle (ActionEvent e) //→28
            {
                iCounter++; //→30
                lbl.setText(Integer.toString(iCounter));
            }
        } );
// Create the Subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(
                new EventHandler<ActionEvent>() //→39
        {
            public void handle (ActionEvent e) //→41
            {
                iCounter--;
                lbl.setText(Integer.toString(iCounter));
            }
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
→26 This line calls the setOnAction method of the Add button and creates
an anonymous instance of the EventHandler class, specifying
ActionEvent as the type.
→28 The handle method must be defined within the body of the anonymous
class.
→30 Because this handle method will be called only when the Add button is
clicked (not when the Subtract button is clicked), it does not need to
determine the event source. Instead, the method simply increments the
counter variable and sets the label text to display the new value of the
counter.
→39 This line calls the setOnAction method of the Subtract button and
creates another anonymous instance of the EventHandler class.
→41 This time, the handle method decrements the counter variable and
updates the label text to display the new counter value.
 */