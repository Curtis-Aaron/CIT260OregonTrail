/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import control.MapControl;
import control.TravelConditionControl;
import model.CheckPoints;

/**
 *
 * @author user
 */
public class GameMenuView extends Views{
    
    public GameMenuView() {
        super("\n\n Pick a Menu OPTION"
            + "\n1. Continue on trail"
            + "\n2. Check Supplies"
            + "\n3. Display the Map" 
            + "\n4. Change Pace"
            + "\n5. Change Food Rations"
            + "\n6. Stop to Rest");
    }
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "1":  
                this.continueOnTrail();
                break;
            case "2":  
                this.checkSupplies();
                break;
            case "3":  
                this.displayTheMap();
                break;
            case "4":  
                this.changePace();
                break;
            case "5":  
                this.changeFoodRations();
                break;
            case "6":  
                this.stopToRest();
                break;
            case "7":
                this.progressGame();
                break;
            default: System.out.println("Invalid menu item.");
                     break;
    }
        return false;
    }

    private void continueOnTrail() {
        //Change date in one
        TravelConditionControl gameTravel = new TravelConditionControl();
        gameTravel.changeDate(1);
        //Change position
        MapControl mapControl = new MapControl();
        
        CheckPoints checkPoint = new CheckPoints(); //This needs to be done in when the checkPoints are created in the game.
        mapControl.moveToNewLocation(checkPoint); 
    }

    private void checkSupplies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayTheMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void changePace() {
        ChangePaceView changePaceView = new ChangePaceView();
        changePaceView.display();
    }

    private void changeFoodRations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void stopToRest() {
        StopToRestView stopToRestView = new StopToRestView();
        stopToRestView.display();
    }

    private void progressGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
