package com.example.chapter3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class page609SceneSwitcher extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    // class fields for Click-Counter scene →15
    int iClickCount = 0;
    Label lblClicks;
    Button btnClickMe;
    Button btnSwitchToScene2;
    Scene scene1;
    // class fields for Add-Subtract scene →22
    int iCounter = 0;
    Label lblCounter;
    Button btnAdd;
    Button btnSubtract;
    Button btnSwitchToScene1;
    Scene scene2;
    // class field for stage
    Stage stage; //→31
    @Override public void start(Stage primaryStage)
    {
        stage = primaryStage; //→35
// Build the Click-Counter scene →37
        lblClicks = new Label();
        lblClicks.setText("You have not clicked the button.");
        btnClickMe = new Button();
        btnClickMe.setText("Click me please!");
        btnClickMe.setOnAction(
                e -> btnClickMe_Click() );
        btnSwitchToScene2 = new Button();
        btnSwitchToScene2.setText("Switch!");
        btnSwitchToScene2.setOnAction(
                e -> btnSwitchToScene2_Click() );
        VBox pane1 = new VBox(10);
        pane1.getChildren().addAll(lblClicks, btnClickMe,
                btnSwitchToScene2);
        scene1 = new Scene(pane1, 250, 150);
// Build the Add-Subtract scene →59
        lblCounter = new Label();
        lblCounter.setText(Integer.toString(iCounter));
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(
                e -> btnAdd_Click() );
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(
                e -> btnSubtract_Click() );
        btnSwitchToScene2 = new Button();
        btnSwitchToScene2.setText("Switch!");
        btnSwitchToScene2.setOnAction(
                e -> btnSwitchToScene1_Click() );
        HBox pane2 = new HBox(10);
        pane2.getChildren().addAll(lblCounter, btnAdd,
                btnSubtract, btnSwitchToScene2);
        scene2 = new Scene(pane2, 300, 75);
// Set the stage with scene 1 and show the stage →84
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene Switcher");
        primaryStage.show();
    }
    // Event handlers for scene 1 →91
    public void btnClickMe_Click()
    {
        iClickCount++;
        if (iClickCount == 1)
        {
            lblClicks.setText("You have clicked once.");
        }
        else
        {
            lblClicks.setText("You have clicked "
                    + iClickCount + " times." );
        }
    }
    private void btnSwitchToScene2_Click()
    {
        stage.setScene(scene2);
    }
    // Event handlers for scene 2 →112
    private void btnAdd_Click()
    {
        iCounter++;
        lblCounter.setText(Integer.toString(iCounter));
    }
    private void btnSubtract_Click()
    {
        iCounter--;
        lblCounter.setText(Integer.toString(iCounter));
    }
    private void btnSwitchToScene1_Click()
    {
        stage.setScene(scene1);
    }
}
/*→15: The section of the programs defines class fields that will be used by the
scene for the Click-Counter portion of the program. These fields include
iClickCount, used to count the number of times the user has clicked the
Click Me! Button; the label used to display the count of how many times
the Click Me! button has been clicked; the Click Me! button itself; and the
button used to switch to the Add-Subtract scene. Also included is a Scene
field named scene1 that will be used to reference the Click Counter scene.
→22: These lines define class variables used by the Add-Subtract portion of
the program, including the counter (iCounter), the label used to display
the counter, the two buttons used to increment and decrement the
counter, the button used to switch back to the Click-Counter scene, and
a Scene field named scene2 that will be used to reference the Add-Subtract scene.
→31: A class field named stage is used to hold a reference to the primary
stage so that it can be accessed throughout the program.
→35: This line sets stage class field to reference the primary stage.
→37: This section of the program builds the Click-Counter scene. First, it
creates the label and buttons displayed by the scene. Then it creates a
VBox layout pane (which lays out its controls in a vertical stack) and adds
the label and buttons to the pane. Finally, it creates the scene using the
VBox pane as its root.
→59: This section of the program builds the Add-Subtract scene by creating
the label and the buttons displayed by the scene, arranging them in
an HBox layout pane, and creating the scene using the HBox pane as
its root.
→84: These lines set the Click-Counter scene as the root scene for the primary
stage, sets the stage title, and then shows the stage.
→91: This section of the program provides the event handlers for the buttons
in the Click-Counter scene. The event handler for the Click Me! button
increments the click counter, then sets the label to display an appropriate
message. The handler for btnSwitchToScene2 simply switches the scene
of the primary stage to scene2, which instantly switches the display to the
Add-Subtract scene as shown on the right side of Figure 3-1.
→112: This section of the program provides the event handlers for the buttons
in the Add-Subtract scene. The event handler for the Add and Subtract
buttons increment or decrement the counter and update the text
displayed by the label. The handler for btnSwitchToScene1 switches
the scene back to scene1, which switches the display back to the
Click-Counter scene shown in the left right side of Figure 3-1.
 */