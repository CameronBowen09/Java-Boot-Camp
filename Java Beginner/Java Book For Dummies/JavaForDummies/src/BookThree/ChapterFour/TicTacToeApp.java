/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookThree.ChapterFour;

/**
 *
 * @author User
 */
public class TicTacToeApp {

    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new BetterPlayer();
        playTheGame(p1, p2);
    }

    public static void playTheGame(Player p1, Player p2) {
        p1.move();
        p2.move();
    }

    private static class BetterPlayer extends Player {

        public BetterPlayer() {
        }
    }

    private static class Player {

        public Player() {
        }

        private void move() {
            
        }
    }
}
