/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import model.Player;

/**
 *
 * @author Govert Carreño
 */
public class StartProgramView extends Views{

    public StartProgramView() {
        super("\n Welcome to the experience of your life with The Oregon Trail game! Try taking a journey by" 
            + "\n covered wagon across 2000 miles of plains, rivers, and mountains. Try! On the plains, will" 
            + "\n you slosh your oxen through mud and water-filled ruts or will you plod through dust six" 
            + "\n inches deep? How will you cross the rivers? If you have money, you might take a ferry(if" 
            + "\n there is a ferry). Or, you can ford the river and hope you and your wagon aren’t swallowed" 
            + "\n alive! What about supplies? Well, if you’re low on food you can hunt. You might get a buf-"
            + "\n falo...you might. And there are bear in the mountains. At the Dalles, you can try navigating" 
            + "\n the Columbia River, but if running the rapids with a makeshift raft makes you queasy, better" 
            + "\n take the Barlow Road. If for some reason you don’t survive -- your wagon burns, or thieves" 
            + "\n steal your oxen, or you run out of provisions, or you die of Cholera -- don’t give up! Try"
            + "\n again...and again… until your name is up with the others on The Oregon Top Ten."
            + "\n"
            + "\n\nPlease enter the player's name");
    }
    
    @Override
    public boolean doAction(String inputs) {
//        doAction(inputs): boolean {
//            playersName = get the first value in the inputs array
//            player = savePlayer(playersName)
//        IF player == null
//            display “Could not create the player. “ +
//            “Enter a different name.”
//            RETURN false
//        ENDIF
//        DISPLAY "================================================= "
//        + "Welcome to the game " + playersName
//        + "We hope you have a lot of fun!”
//        + "================================================= "
//        mainMenuView = Create a new MainMenuView object
//        mainMenuView.displayMainMenuView()
//        RETURN true
//        }
        String playersName = inputs;
        Player player = GameControl.savePlayer(playersName);
        
        if (player == null){
            System.out.println("Could not create the player."
                             + "\nEnter a different name.");    
            return false;
        }
        
        System.out.println("\n=================================================" 
                          + "\nWelcome to the game " + playersName 
                          + "\nWe hope you have a lot of fun!" 
                          + "\n=================================================");
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
            
        return true;
        
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
