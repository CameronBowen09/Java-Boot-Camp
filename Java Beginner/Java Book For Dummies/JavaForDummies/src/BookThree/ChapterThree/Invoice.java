/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookThree.ChapterThree;

/**
 *
 * @author User
 */
public class Invoice {

    private static double taxRate = 0.75;
    private double salesTotal;

    public double getTax() {
        return salesTotal * taxRate;
    }
}
