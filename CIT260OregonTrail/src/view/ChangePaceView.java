/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
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
        
        char number = menuItem.charAt(0);
        
        if(!Character.isDigit(number)){
            System.out.println("Invalid option");
            return false;
        }
        int pace = Character.getNumericValue(number);
        
        return MapControl.changePace(pace);
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
