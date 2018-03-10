/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.TravelConditionControl;


/**
 *
 * @author bould
 */
class StopToRestView extends Views{
    
    public StopToRestView() {
        super("How many days do you want to rest?"
            + "\n\n Please select a number of days.");
    }
    
    @Override
    public boolean doAction(String inputs) {
        
        
        inputs = inputs.trim();
        int x = Integer.getInteger(inputs);
        
        TravelConditionControl travelConditionControl = new TravelConditionControl();
        
        travelConditionControl.changeDate(x);

// For my formula please view the Game class in the model layer. As I was coding I realized
// there was a method for changing the date in the Game class.  The code was not correctly made.
// I pasted my equation code to that method and called on it here. 
   
        return true;
    }
    public void displayNextView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}   
