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

