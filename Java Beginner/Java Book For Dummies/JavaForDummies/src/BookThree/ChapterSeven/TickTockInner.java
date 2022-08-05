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

public class TickTockInner {

    private String tickMessage = "Tick..."; //→6
    private String tockMessage = "Tock..."; //→7

    public static void main(String[] args) {
        TickTockInner t = new TickTockInner(); //→11
        t.go(); //→12
    }

    private void go() //→15
    {
// create a timer that calls the Ticker class
// at one second intervals
        Timer t = new Timer(1000, new Ticker()); //→19
        t.start();
// display a message box to prevent the
// program from ending immediately
        JOptionPane.showMessageDialog(null, //→24
                "Click OK to exit program");
        System.exit(0); //→26
    }

    class Ticker implements ActionListener //→29
    {

        private boolean tick = true;

        public void actionPerformed(ActionEvent event) //→33
        {
            if (tick) {
                System.out.println(tickMessage); //→37
            } else {
                System.out.println(tockMessage); //→41
            }
            tick = !tick;
        }
    }
}
/*→6 The String variables named tickMessage and tockMessage (line 7)
contain the messages to be printed on the console. Note that these
variables are defined as fields of the outer class. As you’ll see, the inner
class Ticker is able to access these fields directly.
→11 Because an inner class can be used only by an instantiated object, you
can’t use it directly from the static main method. As a result, the main
method in this program simply creates an instance of the application
class (TickTockInner).
→12 This line executes the go method of the new instance of the
TickTockInner class.
The technique used in lines 11 and 12 is a fairly common programming
technique that lets an application get out of a static context quickly and
into an object-oriented mode.
→15 This line is the go method, called from line 12.
→19 This line creates an instance of the Timer class with the timer interval
set to 1,000 milliseconds (1 second) and the ActionListener set to a
new instance of the inner class named Ticker.
→24 Here, the JOptionPane class is used to display a dialog box. This dialog
box is necessary to give the timer a chance to run. The application ends
when the user clicks OK.
→26 This line calls the exit method of the System class, which immediately
shuts down the Java Virtual Machine. This method call isn’t strictly
required here, but if you leave it out, the timer continues to run for a
few seconds after you click OK before the JVM figures out that it should
kill the timer.
→29 This line is the declaration for the inner class named Ticker. Note that
this class implements the ActionListener interface.
→33 The actionPerformed method is called by the Timer object every
1,000 milliseconds.
→37 In this line and in line 41, the inner class directly accesses a field of the
outer class.*/
