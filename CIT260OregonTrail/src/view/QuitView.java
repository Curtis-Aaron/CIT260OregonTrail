/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author ABC3
 */
public class QuitView extends Views{
    
    public QuitView(){
        super("\n\n The Oregon Trail"
             + "\n1. 1. Save and Quite"
             + "\n2. 2. Quit"
             + "\n3. Q. Cancel "
             + "\nQ. What is your choice?");
        
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
                      //this.startNewGame();
                      break;
                  case "2":  
                      //this.saveGame();
                      break;
                  case "3":  
                      //this.Quit();
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

    
 
}
