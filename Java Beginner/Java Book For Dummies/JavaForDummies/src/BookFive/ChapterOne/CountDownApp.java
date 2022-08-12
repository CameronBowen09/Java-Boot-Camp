/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFive.ChapterOne;

/**
 *
 * @author User
 */
public class CountDownApp {

    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        clock.start();
    }
}
