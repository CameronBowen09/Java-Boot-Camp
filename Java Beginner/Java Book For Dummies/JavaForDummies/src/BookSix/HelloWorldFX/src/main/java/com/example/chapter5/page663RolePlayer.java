package com.example.chapter5;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class page663RolePlayer extends Application //→8
{
    public static void main(String[] args) {
        launch(args);
    }

    TextField txtCharacter; //→15
    TextField txtActor;

    @Override
    public void start(Stage primaryStage) {
// Create the Character →20
        Label lblCharacter = new Label("Character's Name:");
        lblCharacter.setMinWidth(100);
        lblCharacter.setAlignment(Pos.BOTTOM_RIGHT);
// Create the Character text field →25
        txtCharacter = new TextField();
        txtCharacter.setMinWidth(200);
        txtCharacter.setMaxWidth(200);
        txtCharacter.setPromptText(
                "Enter the name of the character here.");
// Create the Actor label →32
        Label lblActor = new Label("Actor's Name:");
        lblActor.setMinWidth(100);
        lblActor.setAlignment(Pos.BOTTOM_RIGHT);
// Create the Actor text field →37
        txtActor = new TextField();
        txtActor.setMinWidth(200);
        txtActor.setMaxWidth(200);
        txtActor.setPromptText("Enter the name of the actor here.");
// Create the OK button →43
        Button btnOK = new Button("OK");
        btnOK.setMinWidth(75);
        btnOK.setOnAction(e -> btnOK_Click());
// Create the Character pane →48
        HBox paneCharacter = new HBox(20, lblCharacter, txtCharacter);
        paneCharacter.setPadding(new Insets(10));
// Create the Actor pane →52
        HBox paneActor = new HBox(20, lblActor, txtActor);
        paneActor.setPadding(new Insets(10));
// Create the Button pane →56
        HBox paneButton = new HBox(20, btnOK);
        paneButton.setPadding(new Insets(10));
        paneButton.setAlignment(Pos.BOTTOM_RIGHT);
// Add the Character, Actor, and Button panes to a VBox →61
        VBox pane = new VBox(10, paneCharacter, paneActor, paneButton);
        // Set the stage →64
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Role Player");
        primaryStage.show();
    }

    public void btnOK_Click() //→71
    {
        String errorMessage = ""; //→73
        if (txtCharacter.getText().length() == 0) //→75
        {
            errorMessage += "\nCharacter is a required field.";
        }
        if (txtActor.getText().length() == 0) //→80
        {
            errorMessage += "\nActor is a required field.";
        }
        if (errorMessage.length() == 0) //→85
        {
            String message = "The role of "
                    + txtCharacter.getText()
                    + " will be played by "
                    + txtActor.getText()
                    + ".";
            Alert a = new Alert(Alert.AlertType.INFORMATION, message);
            a.setTitle("Cast");
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.WARNING, errorMessage); //→98
            a.setTitle("Missing Data");
            a.showAndWait();
        }
    }
}

/*→4: The name of the program’s main class is RolePlayer.
→15: These class variables allow any of the RolePlayer class methods to
access the two text fields.
→20: These lines create a label to identify the Character text box. The field is
set to a minimum width of 100 pixels and is right-justified so that the
labels for that identify the two text fields will be aligned properly.
→25: These lines create the Character text field with a minimum and maximum
width of 200 pixels. The prompt text is set to Enter the name of
the character here. This text will appear within the text field whenever
the text field does not have focus. In Figure 5-1, the Character text
field has focus so the prompt text isn’t visible.
→32: These lines create a label to identify the Actor text field. Like the
Character label, the Actor label’s width is set to 100 pixels and it’s
right-aligned.
→37: These lines create the Actor text field, set its width to 200 pixels, and
assign prompt text. You can see the prompt text in Figure 5-1 because
the Actor text field doesn’t have focus.
→43: These lines create the OK button. The btnOK_Click method is called
when the user clicks the button.
→48: These lines create an HBox pane and add the Character label and text
box to it.
→52: These lines create another HBox pane and add the Actor label and text
box to it.
→56: These lines create a third HBox pane to hold the button.
→61: Now that all the controls are created and added to HBox panes, the
three HBox panes are added to a VBox pane so that the text boxes with
their associated labels and the button are stacked vertically.
→64: These lines create a scene to show the VBox pane and then add the
scene to the primary stage and show the stage.
→71: The btnOK_Click method is called whenever the user clicks OK.
→73: The errorMessage variable holds any error message that might be
necessary to inform the user of missing data.
→75: This if statement ensures that the user has entered data into the
Character text box. If no data is entered, an error message is created.
→80: This if statement ensures that the user has entered data into the Actor
text box. If no data is entered, an error message is appended to the
errorMessage field.
→85: This if statement determines whether any data validation errors have
occurred by testing the length of the errorMessage field. If the length is
zero, no error has been detected, so the program assembles the
message variable to display which actor will be playing which character.
Then, an Alert box is used to display the message.
→98: This line displays the error message if the user forgets to enter data in
the Character or Actor text fields.
 */