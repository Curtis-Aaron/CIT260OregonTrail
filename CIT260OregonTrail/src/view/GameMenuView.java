/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit260oregontrail.CIT260OregonTrail;
import control.GameControl;
import control.MapControl;
import exceptions.MapControlException;
import java.util.ArrayList;
import model.CheckPoints;
import model.Game;
import model.Items;

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
            + "\n7. Display Rations"
            + "\n8. Save Game"
            + "\n9. Print Items in Stock"
            + "\n10. Quit Game"
            );
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
                this.displayItems();
                break;
            case "8":
                this.saveGame();
                break;
            case "9":
                this.displayStock();
                break;
            case "10":
                this.quitGame();
                break;
            default: 
                ErrorView.display(this.getClass().getName(),"Invalid menu item.");
                     break;
    }
        return false;
    }

    private void continueOnTrail() {
        try {
            //Change date in one
//            TravelConditionControl gameTravel = new TravelConditionControl();
//            gameTravel.changeDate(1);
            //Change position
            MapControl.moveToNewLocation();
            //this.display();
            
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void checkSupplies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayTheMap() {
        Game game = CIT260OregonTrail.getGame();
        CheckPoints[][] checkPoints = game.getMap().getCheckPoints();
        
        this.console.println("titulo del mapa (Será cambiado por Aaron)");
        this.console.println(" 1  2  3  4  ");
        
        for(int i = 0;i < game.getMap().getRowCount();i++){
            this.console.println("  ------------");
            this.console.print(i + 1);
            for(int j = 0; j < game.getMap().getColumnCount(); j++){
                this.console.print("|");
                CheckPoints cp = checkPoints[i][j];
                if(cp.isVisited()){
                    this.console.print("XX");
                }
                else {
                    this.console.print("??");
                }
            }
            this.console.println("|");
        }
        this.console.println("  ------------");
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

    private void displayItems() {
        ArrayList<Items> itemsList = new ArrayList<>();
        itemsList = CIT260OregonTrail.getGame().getItems();
        this.console.println("Your Items:");
        
        for(Items item : itemsList){
            this.console.println(item.getName() + " - " + item.getQuantity());           
        }
        
    }

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }

    private void displayStock() {
        this.console.println("\n\n Enter the file path for file where the game "
                + "is to be saved");
        String aux = displayMessage;
        displayMessage = "";
        String filePath = this.getInputs();
        displayMessage = aux;
        
        try{
            GameControl.printStockItems(CIT260OregonTrail.getGame().getItems(), filePath);
            this.console.println("List saved successfuly");
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }

   

    
}
