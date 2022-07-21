/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterEight;

/**
 *
 * @author User
 */
public class CrazyWithZeros {

    public static void main(String[] args) {
        try {
            int answer = divideTheseNumbers(5, 0); //→7
        } catch (Exception e) //→9
        {
            System.out.println("Tried twice, "
                    + "still didn't work!");
        }
    }

    public static int divideTheseNumbers(int a, int b) //→16
            throws Exception {
        int c;
        try {
            c = a / b; //→22
            System.out.println("It worked!"); //→23
        } catch (Exception e) {
            System.out.println("Didn't work the first time."); //→27
            c = a / b; //→28
            System.out.println("It worked the second time!"); //→29
        } finally {
            System.out.println("Better clean up my mess."); //→33
        }
        System.out.println("It worked after all."); //→35
        return c; //→36
    }
}
