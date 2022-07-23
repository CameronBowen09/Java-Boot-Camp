/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookThree.ChapterTwo;

import static BookTwo.ChapterThree.DiceApp.randomInt;

/**
 *
 * @author User
 */
public class Dice {

    public void roll() {
        
        int roll;
        String msg = "Here are 100 random rolls of the dice:";
        System.out.println(msg);
        for (int i = 0; i < 100; i++) //→8
        {
            roll = randomInt(1, 6); //→10
            System.out.println(roll + " "); //→11
        }
    }
    
    public static int randomInt(int low, int high) //→16
    {
        int result = (int) (Math.random() //→18
                * (high - low + 1)) + low;
        return result; //→20
    }
}
