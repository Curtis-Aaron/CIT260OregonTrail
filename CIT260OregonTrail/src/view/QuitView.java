/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit260oregontrail.CIT260OregonTrail;
import control.GameControl;
import exceptions.GameControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Game;
import model.Map;


/**
 *
 * @author ABC3
 */
public class QuitView extends Views{
    
    public QuitView(){
        super("\n\n The Oregon Trail"
             + "\n 1. Save and Quit"
             + "\n 2. Quit"
             + "\n Q. Cancel "
             + "\n What is your choice?");
        
    }
    
    @Override
    public boolean doAction(String inputs) {

      //                doAction(inputs): boolean {
      //                  menuItem = first element in inputs array
      //                  convert menuItem to upper case
      //                  SWITCH menuItem
      //                }
      //  MainMenuView mainMenuView = new MainMenuView();
      //        mainMenuView.display();
      //              System.out.println("**** MainMenuView goAction method Run ***");
      //              return true;
              String filePath = inputs.toUpperCase();
              String menuItem = inputs.toUpperCase();
              switch (menuItem) {
                  case "1":  
                      this.SaveAndQuit(filePath);
                      //this.startNewGame();
                      break;
                  case "2": 
                      this.quit();
                      //this.saveGame();
                      break;
                  case "Q":
                      break;
                  default: this.console.println("Save Game.");
                           break;
          }
              return false;
      }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void SaveAndQuit(String filePath){
        
        try {
            GameControl.saveGame(filePath, CIT260OregonTrail.getGame());
        } catch (GameControlException ex) {
            Logger.getLogger(QuitView.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }

    private void quit() {
        System.exit(0);
    }


    
 
}
