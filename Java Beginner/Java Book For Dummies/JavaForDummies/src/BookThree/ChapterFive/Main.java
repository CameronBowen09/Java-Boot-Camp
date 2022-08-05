/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookThree.ChapterFive;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {

    }

    private void startGame(Dealable deck, String game) {
        if (game.equals("Poker")) {
            deck.deal(5);
        } else if (game.equals("Hearts")) {
            deck.deal(13);
        } else if (game.equals("Gin")) {
            deck.deal(10);
        }
    }
}
