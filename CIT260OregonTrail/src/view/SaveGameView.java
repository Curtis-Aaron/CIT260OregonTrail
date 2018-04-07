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

    public SaveGameView() {
        super("Name to save the game?");
    }
    
    @Override
    public boolean doAction(String filePath) {
        Game game = cit260oregontrail.CIT260OregonTrail.getGame();
        try {
            GameControl.saveGame(filePath, game);
            this.console.println("Game saved");
        } catch (GameControlException e) {
            ErrorView.display(this.getClass().getName(),e.getMessage());
        }
        return true;
    }
    

    @Override
    public void displayNextView() {
        this.console.println("Not implemented yet");
    }
    
}

    