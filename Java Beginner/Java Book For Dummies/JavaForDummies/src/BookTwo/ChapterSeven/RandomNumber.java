/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterSeven;

/**
 *
 * @author User
 */
public class RandomNumber {

    public static void main(String[] args) {
        int number = getRandomNumber();
        System.out.println("The number is " + number);
    }

    public static int getRandomNumber() {
        int num;
        while (true) {
            num = (int) (Math.random() * 20) + 1;
            if (num != 12) {
                return num;
            }
        }
    }
}
