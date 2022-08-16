package com.example.chapter2;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class page591AddSubtractInner extends Application //→8
{
    public static void main(String[] args) {
        launch(args);
    }

    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) {
// Create a ClickHandler instance
        ClickHandler ch = new ClickHandler(); //→23
// Create the Add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(ch); //→28
// Create the Subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(ch); //→33
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

    private class ClickHandler //→53
            implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) //→56
        {
            if (e.getSource() == btnAdd) {
                iCounter++;
            } else {
                if (e.getSource() == btnSubtract) {
                    iCounter--;
                }
            }
            lbl.setText(Integer.toString(iCounter));
        }
    }
}
/*→8 The AddSubtract2 class still extends Application but doesn’t
implement EventHandler.
→23 This statement creates an instance of the ClickHandler class (the inner
class) and assigns it to the variable ch.
→28 This statement sets ch as the action listener for the Add button.
→33 This statement sets ch as the action listener for the Subtract button.
→53 The ClickHandler class is declared as an inner class by placing its
declaration completely within the AddSubtract2 class. The
ClickHandler class implements the EventHandler interface so that it
can handle events.
→38 The handle method here is identical to the handle method in the
AddSubtract1 program (see Listing 2-1) but resides in the inner
ClickHandler class instead of in the outer class.*/