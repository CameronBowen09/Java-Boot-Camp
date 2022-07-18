/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterFour;

/**
 *
 * @author User
 */
public class Examples {
    
    public static void main(String[] args) {
        
        int switch1 = 2, switch2 = -1;
        String answer = "yes";

        if (((switch1 == 1) && (switch2 == -1))
                || ((switch1 != 1) && (switch2 != -1))) {
            System.out.println("Trouble! The switches are the same");
        } else {
            System.out.println("OK, the switches are different.");
        }

        if (answer.equals("Yes")) {
            System.out.println("The answer is Yes.");
        }
    }
    
}
