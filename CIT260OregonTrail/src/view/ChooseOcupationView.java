/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit260oregontrail.CIT260OregonTrail;
import control.GameControl;
import java.util.ArrayList;
import model.Game;
import model.Occupation;

/**
 *
 * @author user
 */
public class ChooseOcupationView extends Views{

    public ChooseOcupationView() {
        super("\n\n Pick a Menu Option"
            + "\n1. Be a banker from Boston"
            + "\n2. Be carpenter from Ohio"
            + "\n3. Be farmer from Illinois"
            + "\n4. Find out the differences betweem them"
            + "\nQ. Quit");
    }
    @Override
    public boolean doAction(String inputs){
        
        String helpMenuItem = inputs.toUpperCase();
        
        switch (helpMenuItem){
            case "1": 
                    this.assignOccupation(0);
                    break;
            case "2": 
                    this.assignOccupation(1);
                    break;
            case "3": 
                    this.assignOccupation(2);
                    break;
            case "Q": 
                return true;
            default: System.out.println("Invalid option, check the menu again.");
                return true;
        }

        return true;
    }

    private void assignOccupation(int index) {
        ArrayList<Occupation> occupations =  GameControl.createOccupations();
        Game game = CIT260OregonTrail.getGame();
        Occupation occupationSet = occupations.get(index);
        game.setOccupation(occupationSet);
        CIT260OregonTrail.setGame(game);
        
        this.displayNextView();
    }

    @Override
    public void displayNextView() {
        MattsGeneralStoreView generalStoreView = new MattsGeneralStoreView();
        generalStoreView.display();
    }
    
}


