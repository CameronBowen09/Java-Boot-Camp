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
public class ReceivePass extends GameEvent {
    
    public ReceivePass(){
        
        super();
        
    }    
    public String toString() {
        return "Receive pass ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new Dribble(), new GainPossession(), new Shoot(), new Pass()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return true;
    }
    
    public boolean changeTeam() {
        return false;
    }
    
}
