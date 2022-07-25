/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer.event;

/**
 *
 * @author ksomervi
 */
public class Shoot extends GameEvent {
    
    // At the simplest, if successful dribbling moves towards the other teams goal
    public Shoot(){
        
        // No change in ballPoss until next event; Goal or Kickout(save)
        
    }
    
    public String toString() {
        return "Shoots ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new Goal(), new Kickout()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return false;
    }
    
    public boolean changeTeam() {
        return false;
    }
    
        /**
     * @param ballPos the ballPos to set
     */
    public void setBallPos(int currBallPos) {
        //super.setBallPos(currBallPos);
        super.ballPos = currBallPos;

    }
    
}
