/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit260oregontrail.CIT260OregonTrail;
import control.MapControl;
import control.TravelConditionControl;
import model.CheckPoints;
import model.Game;

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
            + "\n6. Stop to Rest"
            + "\n7. Quit Game");
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
                this.quitGame();
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
        Game game = CIT260OregonTrail.getGame();
        CheckPoints[][] checkPoints = game.getMap().getCheckPoints();
        
        System.out.println("titulo del mapa (Será cambiado por Aaron)");
        System.out.println(" 1  2  3  4  ");
        
        for(int i = 0;i < game.getMap().getRowCount();i++){
            System.out.println("  ------------");
            System.out.print(i + 1);
            for(int j = 0; j < game.getMap().getColumnCount(); j++){
                System.out.print("|");
                CheckPoints cp = checkPoints[i][j];
                if(cp.isVisited()){
                    System.out.print("XX");
                }
                else {
                    System.out.print("??");
                }
            }
            System.out.println("|");
        }
        System.out.println("  ------------");
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
    
 private void quitGame() {
        QuitView quitView = new QuitView();
        quitView.display();
    }
    
    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
}
