/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit260oregontrail.CIT260OregonTrail;
import control.GameControl;
import exceptions.GameControlException;
import model.Game;

/**
 *
 * @author Govert
 */
public class RestartGameView extends Views{

    public RestartGameView() {
        super("To restore a game, please type the complete name of your saved game");
    }
   
    @Override
    public boolean doAction(String filePath) {
        try {
            GameControl.getNewGame(filePath);
        } catch (GameControlException e) {
            ErrorView.display(this.getClass().getName(),e.getMessage());
            return false;
        }
        WagonPartyView wagonPartyView = new WagonPartyView();
        wagonPartyView.display();
        return true;
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
