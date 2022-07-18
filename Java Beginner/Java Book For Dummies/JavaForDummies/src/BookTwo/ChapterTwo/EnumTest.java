/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterTwo;

/**
 *
 * @author User
 */
public class EnumTest {
    
    public enum CardSuit {
        HEARTS, SPADES, CLUBS, DIAMONDS
    }

    public static void main(String[] args) {
        CardSuit suit;
        suit = CardSuit.HEARTS;
        System.out.println("The suit is " + suit);
    }
    
}
