/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterThree;

/**
 *
 * @author User
 */
import java.text.NumberFormat;

public class NumberFormatClassApp {

    static NumberFormat cf
            = //→6
            NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        printMyAllowance();
        printCostOfPaintBallGun();
    }

    public static void printMyAllowance() {
        double myAllowance = 5.00;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My allowance: " //→19
                + cf.format(myAllowance));
    }

    public static void printCostOfPaintBallGun() {
        double costOfPaintBallGun = 69.95;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("Cost of Paint Ball Gun: " //→27
                + cf.format(costOfPaintBallGun));
    }
}
