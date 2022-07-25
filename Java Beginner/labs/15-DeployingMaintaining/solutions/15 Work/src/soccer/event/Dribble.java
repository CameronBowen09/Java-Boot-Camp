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
public class Dribble extends GameEvent {
    
    // At the simplest, if successful dribbling moves towards the other teams goal
    public Dribble(){
        
        super();
        
    }
    
    public String toString() {
        return "Dribble ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new GainPossession(), new Shoot(), new Pass()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return false;
    }
    
    public boolean changeTeam() {
        return false;
    }
    
}
