package com.example.chapter1;

import javafx.application.*; //→1
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class page578ClickCounter extends Application // →7
{
    public static void main(String[] args) //→9
    {
        launch(args); //→11
    }

    Button btn; //→14
    Label lbl; //→15
    int iClickCount = 0; //→16

    @Override
    public void start(Stage primaryStage) //→18
    {
        // Create the button
        btn = new Button(); //→21
        btn.setText("Click me please!"); //→22
        btn.setOnAction(e -> buttonClick()); //→23
// Create the Label
        lbl = new Label(); //→26
        lbl.setText("You have not clicked the button."); //→27
// Add the label and the button to a layout pane
        BorderPane pane = new BorderPane(); //→30
        pane.setTop(lbl); //→31
        pane.setCenter(btn); //→32
// Add the layout pane to a scene
        Scene scene = new Scene(pane, 250, 150); //→35
// Add the scene to the stage, set the title
// and show the stage
        primaryStage.setScene(scene); //→39
        primaryStage.setTitle("Click Counter"); //→40
        primaryStage.show(); //→41
    }

    public void buttonClick() //→44
    {
        iClickCount++; //→46
        if (iClickCount == 1) //→47
        {
            lbl.setText("You have clicked once."); //→49
        } else {
            lbl.setText("You have clicked " //→53
                    + iClickCount + " times.");
        }
    }

}
        /*
        →1 The import statements reference the javafx packages that will be used
by the Click me program.
→7 The ClickMe class extends javafx.application.Application, thus
specifying that the ClickMe class is a JavaFX application.
→9 As with any Java program, the main method is the main entry point for all
JavaFX programs.
→11 The main method calls the launch method, which is defined by the
Application class. The launch method, in turn, creates an instance of
the ClickMe class and then calls the start method.
→14 A variable named btn of type javafx.scene.control.Button is
declared as a class variable. Variables representing JavaFX controls are
commonly defined as class variables so that they can be accessed by any
method in the class.
→15 A class variable named lbl of type javafx.scene.control.Label
represents the Label control so that it can be accessed from any
method in the class.
→16 A class variable named iClickCount will be used to keep track of the
number of times the user clicks the button.
→18 The declaration of the start method uses the @override annotation,
indicating that this method overrides the default start method provided
by the Application class. The start method accepts a parameter
named primaryStage, which represents the window in which the Click
Me application will display its user interface.
→21 The start method begins by creating a Button object and assigning it to
a variable named btn.
→22 The button’s setText method is called to set the text displayed by the
button to Click Me Please!.
→23 The setOnAction is called to create an event handler for the button.
Here, a Lambda expression is used to simply call the buttonClick
method whenever the user clicks the button.
→26 The constructor of the Label class is called to create a new label.
→27 The label’s setText method is called to set the initial text value of the
label to You have not clicked the button.
→30 A border pane object is created by calling the constructor of the
BorderPane class, referencing the border pane via a variable named
pane. The border pane will be used to control the layout of the controls
displayed on the screen.
→31 The border pane’s setTop method is called to add the label to the top
region of the border pane.
→32 The border pane’s setCenter method is called to add the button to the
center region of the border pane.
→35 A scene object is created by calling the constructor of the Scene class,
passing the border pane created in line 30 to the constructor to establish
the border pane as the root node of the scene. In addition, the dimensions
of the scene are set to 300 pixels in width and 250 pixels in height.
→39 The setScene method of the primaryStage is used to add the scene to
the primary stage.
→40 The setTitle method is used to set the text displayed in the primary
stage’s title bar.
→41 The show method is called to display the primary stage. When this line is
executed, the window that was shown in Figure 2-1 displays on the
screen and the user can begin to interact with the program.
→44 The buttonClick method is called whenever the user clicks the button.
→46 The iClickCount variable is incremented to indicate that the user has
clicked the button.
→47 An if statement is used to determine whether the button has been
clicked one or more times.
→49 If the button has been clicked once, the label text is set to You have
clicked once.
→53 Otherwise, the label text is set to a string that indicates how many times
the button has been clicked.
         */