/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterTwo;

/**
 *
 * @author User
 *
 */
import javax.swing.JOptionPane;

public class DialogApp {

    public static void main(String[] args) {
        String s;
        s = JOptionPane.showInputDialog //→7
                ("Enter an integer:"); //→8
        int x = Integer.parseInt(s); //→9
        System.out.println("You entered " + x + "."); //→10
    }
    
/*→1 This line imports the JOptionPane class.
→7–8 This statement displays an input dialog box with the prompt Enter an
integer: and assigns the string entered by the user to the variable named s.
→9 This statement uses the parseInt method of the Integer class to
convert the string entered by the user to an integer.
→10 This statement displays the integer value to confirm that the data
entered by the user was converted properly to an integer.*/
}
