/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.MapControl;

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
                System.out.println("Stub");
                break;
            default:
                System.out.println("Invalid option");
                return false;
        }
        
        return true;
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
