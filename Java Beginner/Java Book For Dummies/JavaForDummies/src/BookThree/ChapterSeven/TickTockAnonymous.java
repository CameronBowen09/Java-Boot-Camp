/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookThree.ChapterSeven;

/**
 *
 * @author User
 */
import java.awt.event.*;
import javax.swing.*;

public class TickTockAnonymous {

    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args) //→9
    {
        TickTockAnonymous t = new TickTockAnonymous();
        t.go();
    }

    private void go() {
// create a timer that calls the Ticker class
// at one second intervals
        Timer t = new Timer(1000, //→19
                new ActionListener() //→20
        { //→21
            private boolean tick = true;

            public void actionPerformed( //→24
                    ActionEvent event) {
                if (tick) {
                    System.out.println(tickMessage);
                } else {
                    System.out.println(tockMessage);
                }
                tick = !tick;
            }
        }); //→37
        t.start();
// display a message box to prevent the
// program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }
}
/*→9 Anonymous classes won’t work in a static context, so the main method
creates an instance of the TickTockAnonymous class and executes the
go method.
→19 In the go method, an instance of the Timer class is created.
→20 The second parameter of the TimerClass constructor is an object that
implements the ActionListener interface. This object is created here
via an anonymous class. ActionListener is specified as the type for
this class.
→21 This left brace marks the beginning of the body of the anonymous class.
→24 The actionPerformed method is called every 1,000 milliseconds by
the timer. Note that this method can freely access fields defined in the
outer class.
→37 The right brace on this line marks the end of the body of the anonymous
class. Then the right parenthesis marks the end of the parameter
list for the Timer constructor. The left parenthesis that’s paired with
this right parenthesis is on line 19. Finally, the semicolon marks the end
of the assignment statement that started on line 19.*/
