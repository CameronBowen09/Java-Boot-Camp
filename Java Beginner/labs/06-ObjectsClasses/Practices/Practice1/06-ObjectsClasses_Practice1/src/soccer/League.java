/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer;

/**
 *
 * @author User
 */
public class League {

    public static void main(String[] args) {
        // instantiate a Player objects
        Player player01 = new Player();
        player01.playerName = "George Eliot";

        Player player02 = new Player();
        player02.playerName = "Graham Greene";

        Player player03 = new Player();
        player03.playerName = "Geoffrey Chaucer";

        Player[] thePlayers = {player01, player02, player03};

        //Declare and instantiate a Team01 object
        Team team01 = new Team();
        team01.teamName = "The Greens";
        team01.playerArray = thePlayers;

        // Change Player01s name
        // player01.playerName = "Robert Service";
        // Create a for loop that iterates through the array in team01.
        System.out.println("The Players for The Greens: ");
        for (Player thePlayer : team01.playerArray) {
            System.out.println(thePlayer.playerName);
        }

        // Declare and instantiate a Team02 object
        Team team02 = new Team();
        team02.teamName = "The reds";
        team02.playerArray = new Player[3];

        // Add a player named "Robert Service" to the first element of playerArray.
        team02.playerArray[0] = new Player();
        team02.playerArray[0].playerName = "Robert Service";

        // Add a player named "Robbie Burns" to the first element of playerArray.
        team02.playerArray[1] = new Player();
        team02.playerArray[1].playerName = "Robbie Burns";

        // Add a player named "Rafael Sabrini" to the first element of playerArray.
        team02.playerArray[2] = new Player();
        team02.playerArray[2].playerName = "Rafael Sabrini";

        // Create a for loop that iterates through the array in team02.
        System.out.println("\nThe Players for The Reds: ");
        for (Player thePlayer : team02.playerArray) {
            System.out.println(thePlayer.playerName);
        }
    }
}
