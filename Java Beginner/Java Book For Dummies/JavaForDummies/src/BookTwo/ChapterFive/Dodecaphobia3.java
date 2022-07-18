/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterFive;

/**
 *
 * @author User
 */
public class Dodecaphobia3 {
    
    public static void main(String[] args) {
        
        int number = 0;
        while (number < 20) {
            number += 2;
            if (number == 12) {
                continue;
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }
    
}
