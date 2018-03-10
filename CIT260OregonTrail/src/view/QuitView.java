/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
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

              String menuItem = inputs.toUpperCase();
              switch (menuItem) {
                  case "1":  
                      this.SaveAndQuit();
                      //this.startNewGame();
                      break;
                  case "2": 
                      this.quit();
                      //this.saveGame();
                      break;
                  case "Q":
                      break;
                  default: System.out.println("Save Game.");
                           break;
          }
              return false;
      }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void SaveAndQuit() {

        Map map = new Map();
        map.setPosition(0);
        System.exit(0);
    }

    private void quit() {
        System.exit(0);
    }


    
 
}
