/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit260oregontrail.CIT260OregonTrail;
import control.GameControl;
import model.Game;
import model.WagonPartyMembers;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class WagonPartyView extends Views{

    public WagonPartyView() {
        super("\n\n What is the name of the first member?"
            + "\n1. x"
            + "\n2. xx"
            + "\n3. xxx"
            + "\n4. xxxx"
            + "\n5. xxxxx"
            + "\nQ. Quit");
    }

    @Override
    public boolean doAction(String inputs) {
        
        String helpMenuItem = inputs.toUpperCase();
        
        switch (helpMenuItem){
            case "1": 
//                    this.frequentlyQuestions();
                    break;
            case "2": 
//                    this.aboutTheGame();
                    break;
            case "3": 
//                    this.generalInformation();
                    break;
            case "4": 
//                    this.whenToBuy();
                    break;
            case "Q": 
                return true;
            default:
                return true;
        }

        return true;
    }
    private final int wagonName = 0;
        ArrayList<WagonPartyMembers> wagonPartyMembersArray =  GameControl.createWagonPartyMember();
        Game game = CIT260OregonTrail.getGame();

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
  }
