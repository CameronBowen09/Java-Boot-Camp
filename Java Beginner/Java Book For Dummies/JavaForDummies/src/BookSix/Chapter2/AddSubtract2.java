/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Inner classes are commonly used for event handlers. (That way the class that defines the application
doesnt have to implement the event handler.
 */

package BookSix.Chapter2;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

//AddSubtract2 class still extends Application, but does not implement EventHandler.
//Instead it's inner class implements EventHandler.
public class AddSubtract2 extends Application {

    public static void main(String[] args) 
    {
        launch(args);
    }
    
    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) 
    {
// Create a ClickHandler instance (the inner class)(the action listener).
        ClickHandler ch = new ClickHandler();
// Create the Add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(ch);     //the ClickHandler instance, ch is passed to the setOnAction() method
                                    //as the action listener. Whereas in the previous version the handler()
                                    //method was part of this class, so 'this' was passed intead.
// Create the Subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(ch);
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

    //Inner class that handles the events
    private class ClickHandler implements EventHandler<ActionEvent> 
    {
        @Override
        public void handle(ActionEvent e) {     //ActionEvent passed to handle method
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
