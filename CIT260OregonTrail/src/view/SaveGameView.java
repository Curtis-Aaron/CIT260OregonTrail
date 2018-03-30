/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import exceptions.GameControlException;
import model.Game;

/**
 *
 * @author FELIPE
 */
public class SaveGameView extends Views{
    
    private String [] inputs = new String [1]; 
    
    private String[] playerInputs(){
        displayMessage = "The instructions to save the game are....";
        String input1 = getInputs("SaveGame");
        return inputs;
    }
    
    @Override
    public boolean doAction(String inputs) {
        String filePath = getInputs();
        Game game = cit260oregontrail.CIT260OregonTrail.getGame();
        try {
            Game game = GameControl.saveGame(filePath, game);
        } catch (GameControlException) {
        }
        return true;
    }
    

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getInputs(String saveGame) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    