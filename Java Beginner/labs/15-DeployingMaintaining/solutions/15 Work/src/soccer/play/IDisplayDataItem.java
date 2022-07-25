/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer.play;

/**
 *
 * @author ksomervi
 */
public interface IDisplayDataItem {
    
    public boolean isDetailAvailable ();
    public String getDisplayDetail();
    public int getID();
    public String getDetailType();    // return simple text String or return the actual object?
    
}
