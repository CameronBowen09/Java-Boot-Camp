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
public class DisplayString implements IDisplayDataItem {
    
    String displayDetail;
    int id = 0;
    public boolean isDetailAvailable () { return false;}
    public String getDisplayDetail() {return this.displayDetail;}
    public int getID(){return this.id;}
    public String getDetailType(){return "String";}
    
    public void setDisplayDetail(String displayDetail){
            this.displayDetail = displayDetail;
    }
    
    public DisplayString(String displayString){
        this.displayDetail = displayString;
    }
}
