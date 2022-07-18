/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterThree;

/**
 *
 * @author User
 */
import java.util.Scanner; //

public class MarblesApp {

    static Scanner sc = new Scanner(System.in); //

    public static void main(String[] args) {
// declarations 
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;
// get the input data 
        System.out.println("Welcome to the marble divvy-upper.");
        System.out.print("Number of marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.print("Number of children: ");
        numberOfChildren = sc.nextInt();
// calculate the results
        marblesPerChild = numberOfMarbles / numberOfChildren; //
        marblesLeftOver = numberOfMarbles % numberOfChildren; //
// print the results 
        System.out.println("Give each child "
                + marblesPerChild + " marbles.");
        System.out.println("You will have "
                + marblesLeftOver + " marbles left over.");
    }
}

/*1 Imports the java.util.Scanner class so that the program can use it
to get input from the user.
5 Creates the Scanner object and assigns it to a class variable so that it
can be used in any method in the class.
9–13 Declare the local variables used by the program.
15-20 Get the input from the user.
23 Calculates the number of marbles to give to each child by using
integer division, which discards the remainder.
24 Calculates the number of marbles left over.
26–31 Print the results.*/