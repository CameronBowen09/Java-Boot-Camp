/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.Arrays;
import soccer.*;

/**
 *
 * @author ksomervi
 */
public class GameUtils {

    public static void addGameGoals(Game currGame) {
        
        //System.out.println(currGame.awayTeam + " : " + currGame.homeTeam);

        // Or possibly throw an Exception?
        if (currGame.goals == null) {
            currGame.goals = new Goal[(int) (Math.random() * 10)];   // If goals not initialized max will be 9
        }

        //System.out.println(currGame.goals.length);
        int i = 0;
        for (Goal currGoal : currGame.goals) {
            currGoal = new Goal();
            currGoal.theTeam = Math.random() > 0.5 ? currGame.homeTeam : currGame.awayTeam;
            currGoal.thePlayer = currGoal.theTeam.playerArray[(int) (Math.random() * currGoal.theTeam.playerArray.length)];
            currGoal.theTime = (int) (Math.random() * 90);
            currGame.goals[i] = currGoal;
            i++;
        }
        Arrays.sort(currGame.goals, (g1, g2) -> Double.valueOf(g1.theTime).compareTo(Double.valueOf(g2.theTime)));

    }


}
