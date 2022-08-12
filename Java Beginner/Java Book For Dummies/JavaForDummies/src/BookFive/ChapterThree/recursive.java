/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFive.ChapterThree;

/**
 *
 * @author User
 */
public class recursive {

    public static void main(String[] args) {
        int n = 5;
        long fact;
        fact = factorial(n);
        System.out.println("The factorial of " + n + " is "
                + fact + ".");
    }

    private static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
