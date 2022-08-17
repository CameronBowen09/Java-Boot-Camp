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

