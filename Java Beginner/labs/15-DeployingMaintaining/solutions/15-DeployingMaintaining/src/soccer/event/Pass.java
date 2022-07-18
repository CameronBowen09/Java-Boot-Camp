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
public class Pass extends GameEvent {
    
    public Pass(){
        
        super();
        
    }
    
    public String toString() {
        return "Pass attempt ";
    }
    
    public GameEvent[] getNextEvents() {
        GameEvent theEvent[] = { new ReceivePass(), new GainPossession()};
        return theEvent;
    }
    
    public boolean changePlayer() {
        return false;
    }
    
    public boolean changeTeam() {
        return false;
    }
    
}
