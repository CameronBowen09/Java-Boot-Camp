/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Administrator
 */
public class League {

    /**
     * @param args the command line arguments
     */
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
        /*
        System.out.println("The Players for The Greens: ");
        for (Player thePlayer : team01.playerArray) {
            System.out.println(thePlayer.playerName);
        }
         */
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
        /*
        System.out.println("\nThe Players for The Reds: ");
        for (Player thePlayer : team02.playerArray) {
            System.out.println(thePlayer.playerName);
        } 
         */
        // create a Game and populate the homeTeam and awayTeam attributes.
        Game currGame = new Game();
        currGame.homeTeam = team01;
        currGame.awayTeam = team02;

        // Create a Goal object to give the home team a 1–0 lead.
        Goal goal01 = new Goal();
        goal01.thePlayer = currGame.homeTeam.playerArray[2];
        goal01.theTeam = currGame.homeTeam;
        goal01.theTime = 55;

        // Put this Goal object in a Goal array, and then assign this Goal array to the goals attribute of the game object.
        Goal[] theGoals = {goal01};
        currGame.goals = theGoals;

        // Print out the score of the game (if there was more than one goal, you would need to use a loop.
        System.out.println("The Greens scored afer " + currGame.goals[0].theTime + " mins by "
                + currGame.goals[0].thePlayer.playerName + " of " + currGame.goals[0].theTeam.teamName + ".");
        
        /* Practice 7-1. Add code for finding a player within team2 here */
        for (Player thePlayer: team02.playerArray){
           if (thePlayer.playerName.matches(".*Sab.*")){
                System.out.println("\nFound: " + thePlayer.playerName);
                System.out.println("Last Name is: " + thePlayer.playerName.split(" ")[1]);
           }
        }
        
        // Create a loop that iterates through the players in team1. Inside a loop, split the String into two separate Strings 
        // in a String array.
        StringBuilder familyNameFirst = new StringBuilder();
        
        System.out.println("\nThe Greens Players Last Name and FirstName: ");
        for (Player thePlayer: team01.playerArray){
            
            String name[] = thePlayer.playerName.split(" ");
            
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            
            System.out.println(familyNameFirst);
            
            familyNameFirst.delete(0 , familyNameFirst.length());
        }
    }   
}
