/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterFive;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class GetABet3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int bank = 1000; 
        int bet; 
        boolean validBet; 
        System.out.println("You can bet between 1 and " + bank);
        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();
            validBet = true;
            if ((bet <= 0) || (bet > bank)) {
                validBet = false;
                System.out.println("What, are you crazy?");
            }
        } while (!validBet);
        System.out.println("Your money's good here.");
    }
}
