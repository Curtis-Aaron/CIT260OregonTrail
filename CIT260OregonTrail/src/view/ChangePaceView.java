/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.MapControl;
import exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bould
 */
public class ChangePaceView extends Views{
    
    public ChangePaceView() {
        super("\n\nYou are currently at pace" 
            + "\nChange pace to..."
            + "\n1. A steady pace."
            + "\n2. A strenuous pace." 
            + "\n3. A grueling pace."
            + "\n4. Find out what these different paces mean.");
    }
    @Override
    public boolean doAction(String inputs) {
        try {
            String menuItem = inputs.toUpperCase();
            menuItem = menuItem.trim();
            
            switch(menuItem){
                case "1":
                    MapControl.changePace(paceList.SLOW.ordinal());
                    break;
                case "2":
                    MapControl.changePace(paceList.MODERATE.ordinal());
                    break;
                case "3":
                    MapControl.changePace(paceList.GRUELING.ordinal());
                    break;
                case "4":
                    
                    break;
                default:
                    ErrorView.display(this.getClass().getName(),"Invalid option");
                    return false;
            }
            
            return true;
        } catch (MapControlException ex) {
            Logger.getLogger(ChangePaceView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
