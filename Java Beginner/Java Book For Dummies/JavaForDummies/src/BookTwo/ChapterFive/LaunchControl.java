/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterFive;

/**
 *
 * @author User
 */
public class LaunchControl {
    
    public static void main(String[] args) {
        
        System.out.print("We are go for launch in T minus ");
        for (int count = 10; count >= 0; count--) {
            if (count == 8) {
                System.out.println("Ignition sequence start!");
            } else {
                System.out.println(count + "...");
            }
        }
        System.out.println("All engines running!");
        System.out.println("Liftoff! We have a liftoff!");
    }
    
}
