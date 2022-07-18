/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer.play;

/**
 *
 * @author Administrator
 */
public class Player implements Comparable {
    
    private String playerName;
    private int goalsScored;
    
    public void incGoalsScored() {
        this.goalsScored++;
    }
    
    public Player(String playerName) {
        this.playerName = playerName;
    }
    
    public Player() {}

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the goalsScored
     */
    public int getGoalsScored() {
        return goalsScored;
    }

    /**
     * @param goalsScored the goalsScored to set
     */
    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }
    
    
    
    
    // TODO - possibly remove this so can sort based on Lambda expression
    // If so, need to use 1.8 Java for GlassFish
    public int compareTo(Object thePlayer){

        if (this.getGoalsScored() < ((Player)thePlayer).getGoalsScored()){
            return 1;
        }
        else {
            return -1;

        }
    }
    
}
