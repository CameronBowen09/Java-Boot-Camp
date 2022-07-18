/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer.play;

import soccer.event.GameEvent;
import soccer.event.Goal;

/**
 *
 * @author ksomervi
 */
public class GameResult {
    
 
    private final Team homeTeam;
    private final Team awayTeam;
    private Team winner;
    private int homeTeamGoals;
    private int awayTeamGoals;
    private boolean isDrawn;
    
    // Could we have list of scorers here? But why not get that from game.
    // Only advantage of GameResult is that it has result and winners,
    // hence easier to get totalPoints. (Could also be useful for goal difference
    // home/away goals etc.
    
    // Should GameResult be a member of Game? Seems not, as it'd then have to update 
    // automatically.
    
    
 
    public boolean isDrawnGame() {
        return isDrawn;
    } 
    
    // Possibly throw Exception here for game not played or drawn game
    public Team getWinner()  {
        return this.winner;
    }  
    public int getHomeTeamScore(){
        return this.homeTeamGoals;
    }
    public int getAwayTeamScore(){
        return this.awayTeamGoals;
    }
   
   // Constructor 
   public GameResult(Game currGame) {
        this.homeTeam = currGame.getHomeTeam();  // This might change in later version
        this.awayTeam = currGame.getAwayTeam();
        getScore(currGame);       
         if (homeTeamGoals == awayTeamGoals){
            this.isDrawn = true;       
        } else if (homeTeamGoals > awayTeamGoals) {
            this.winner = this.homeTeam;
        } else {
            this.winner = this.awayTeam;
        }

    }
    
    private void getScore(Game currGame) {
       for (GameEvent currEvent: currGame.getEvents()) {
            if (currEvent instanceof Goal) {
                if (currEvent.getTheTeam()==currGame.getHomeTeam()){
                    this.homeTeamGoals++;
                } else {
                    this.awayTeamGoals++;
                }
                // Increment player's goals here? Seems not correct. TODO
                // NOT correct because GameResults get created all over the place.
                //currEvent.getThePlayer().incGoalsScored();
            }
       }
    } 

    /**
     * @return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @return the awayTeam
     */
    public Team getAwayTeam() {
        return awayTeam;
    }
 
}
