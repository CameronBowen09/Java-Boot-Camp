/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Annonymous class: a class that's coded on the spot, where you need it. 
(It has no name, hence Annonymous).
Often used for event handlers to avoid the need for a seperate class that explicitly
implements the EventHandler interface.
One advantage of using annonymous classes is that you can easily create a seperate event handler
for each control that generates an event. (instead of using the 'if' statement as before)
 */
package BookSix.Chapter2;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class AddSubtract3 extends Application {

    public static void main(String[] args) 
    {
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
        
        //creates annonymous instance of EventHandler class, specifying ActionEvent as the type.
        //The 'handle() method is defined within the annonymous class.
        //Because this handle() method is only called when btnAdd is clicked, you dont need to .getSource().
        btnAdd.setOnAction(new EventHandler<ActionEvent>()   
                {                                            
                    public void handle(ActionEvent e) {      
                    iCounter++;                              
                    lbl.setText(Integer.toString(iCounter));
                    }
                } );
        
//USING A LAMBDA EXPRESSION IN THE .setAction() method.
//Lambda implements a 'functional interface', which has only one abstract method. The EventHandler 
// interface used to handle JavaFX events meets that definition, and can be used in a lambda expression.
//Because setOnAction() method take a single parameter of type EventHandler - so the java compiler
// can figure out that the lambda expression will implement the EventHandler interface.
//And because EventHandler interface only has one abstract method (handle()), it knows which
// method is being called.
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnAdd.setOnAction( e ->            //parameter Types are seperated from the method body by ->
        {
            iCounter++;
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
