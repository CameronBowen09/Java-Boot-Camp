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

// Perhaps break this into Tackle and InterceptPass

public class GainPossession extends GameEvent {
    
    public GainPossession(){
        
        super();
        
    }
    
    public String toString() {
        return "Won possession ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new GainPossession(), new Pass(), new Dribble(), new Shoot()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return true;
    }
    
    public boolean changeTeam() {
        return true;
    }
    
}
