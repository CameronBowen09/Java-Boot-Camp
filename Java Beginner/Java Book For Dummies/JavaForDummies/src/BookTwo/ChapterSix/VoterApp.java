/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterSix;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class VoterApp {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to the voting machine "
        + "Error code decoder \n\n"
        + "If your voting machine generates " 
        + "an error code, \n"
        + "you can use this program to determine "
        + "the exact/cause of the error. \n");
        System.out.println("Enter the error code: ");
        
        int err = sc.nextInt();
        
        String msg;
        if (err==1){
            msg = "Voter entered more than one canidate "
                    + "ballot rejecte;";
        } else if(err==2){
            msg = "Box checked and write-in candidate " +
                    "entered. \nballot rejected.";
        }
    }
    
}
