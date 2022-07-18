/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterThree;

/**
 *
 * @author User
 */
public class DiceApp {
    
    public static void main(String[] args) {
        int roll;
        String msg = "Here are 100 random rolls of the dice:";
        System.out.println(msg);
        for (int i = 0; i < 100; i++) //→8
        {
            roll = randomInt(1, 6); //→10
            System.out.println(roll + " "); //→11
        }
    }

    public static int randomInt(int low, int high) //→16
    {
        int result = (int) (Math.random() //→18
                * (high - low + 1)) + low;
        return result; //→20
    }
    
    /*8 The for statement causes the statements in its body (lines 10 and 11) to be
executed 100 times. Don’t worry about how this statement works for now;
you find out about it in Book 2, Chapter 5.
10 This statement calls the randomInt method, specifying 1 and 6 as the
range for the random integer to generate. The resulting random number is
assigned to the roll variable.
11 The System.out.print method is used to print the random number
followed by a space. Because this statement calls the print method rather
than the println method, the random numbers are printed on the same
line rather than on separate lines.
16 The declaration for the randomInt method indicates that the method
returns an int value and accepts two int arguments: one named low and
the other named high.
18 This expression converts the random double value to an integer between
low and high.
20 The return statement sends the random number back to the statement
that called the randomInt method.*/
    
}
