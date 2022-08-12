/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFour.ChapterTwo;

/**
 *
 * @author User
 */
import java.util.Arrays;

class CopyDemo {

    public static void main(String args[]) {
        int arrayOriginal[] = {42, 55, 21};
        int arrayNew[]
                = Arrays.copyOf(arrayOriginal, 3); //→9
        printIntArray(arrayNew);
    }

    static void printIntArray(int arrayNew[]) {
        for (int i : arrayNew) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }
}
