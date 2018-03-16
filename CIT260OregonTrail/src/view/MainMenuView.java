/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit260oregontrail.CIT260OregonTrail;
import control.GameControl;


/**
 *
 * @author Felipe P.
 */
public class MainMenuView extends Views{

    public MainMenuView() {
        super("Pick a Menu Option"
            + "\n1. Travel the trail"
            + "\n2. Restart Game"
            + "\n3. Get Help"
            + "\nQ. Quit");
        
        
    }
    @Override
    public boolean doAction(String inputs) {
        
//                doAction(inputs): boolean {
//                  menuItem = first element in inputs array
//                  convert menuItem to upper case
//                  SWITCH menuItem
//                      “N”: startNewGame()
//                      “R”: restartGame()
//                      “H”: getHelp()
//                      “E”: RETURN true
//                      DEFAULT: DISPLAY “Invalid menu item.”
//                   ENDSWITCH
//                   RETURN false
//                }
//  MainMenuView mainMenuView = new MainMenuView();
//        mainMenuView.display();
//              System.out.println("**** MainMenuView goAction method Run ***");
//              return true;

        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "1":  
                this.startNewGame();
                break;
            case "2":  
                this.restartGame();
                break;
            case "3":  
                this.getHelp();
                break;
            default: System.out.println("Invalid menu item.");
                     break;
    }
        return false;
}
    private void startNewGame() {
//        startNewGame(): void {
//            Create a new Game
//            gameMenuView = create a new GameMenuView object
//            gameMenuView.displayGameMenuView();
//        }
        
        GameControl.createNewGame(CIT260OregonTrail.getPlayer());
        
        WagonPartyView wagonPartyView = new WagonPartyView();
        wagonPartyView.display();
    }
    
    private void restartGame() {
//        restartNewGame(): void {
//            startExistingGameView = Create a new StartExistingGameView
//            startExistingGameView.displayStartExistingGameView();
//        }
        RestartGameView restartGameView = new RestartGameView();
        restartGameView.display();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("There is not a new View from Here -> Error!."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
