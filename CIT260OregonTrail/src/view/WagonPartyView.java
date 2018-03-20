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
import java.util.Scanner;

/**
 *
 * @author user
 */
public class WagonPartyView extends Views{

    Game game = CIT260OregonTrail.getGame();
    
    public WagonPartyView() {
        super("\n\n What are the names of your Wagon Party?"
            + "\n1. Type names"
            + "\nQ. Quit");
    }

    @Override
    public boolean doAction(String inputs) {
        
        String helpMenuItem = inputs.toUpperCase();
        
        switch (helpMenuItem){
            case "1": 
                    this.assignWagonPartyMember();
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


    @Override
    public void displayNextView() {
    }

//    private void assignWagonPartyMember(int wagonName) {
//        ArrayList<WagonPartyMembers> wagonPartyMembersArray = new ArrayList<>();
//        Game game = CIT260OregonTrail.getGame();
//        WagonPartyMembers WagonPartyMembersSet = wagonPartyMembersArray.get(wagonName);
//        game.setWagonPartyMembers(WagonPartyMembersSet);
//        CIT260OregonTrail.setGame(game);
//        
//        this.displayNextView();
//    }
    static Scanner inputs = new Scanner(System.in);
    static ArrayList<String> names = new ArrayList<>();
        private void assignWagonPartyMember() {
        
        System.out.println("\n Remember the wagon members are five.\n"
                          +"\n Please type the names for your wagon.  ");
        
        for (int j=1; j < 6; j++){
            String members = inputs.nextLine();
            if (!members.equals("") ) { 
                System.out.println(j + ". Wagon member");
                names.add(members);
            }
            else{ 
                System.out.println("You must type the name. It cannot be null");
                j--;
//                if (!inputs.nextLine().equals("String")){ 
//                    System.out.println("Invalid data. Please try again");
//                }    
            }
        }

        ShowArray();
        
        System.out.println("Are all the names well?");
        System.out.println("Type the number of the one you want to correct");
        System.out.println("Otherwise type C");
        String deleteNames = inputs.next();
        for (int i=0; i<names.size(); i++){
            if (i ==  (Integer.parseInt(deleteNames) - 1) )
                names.remove(i);
            
        }
        ShowArray();
    
    }
    private void ShowArray() {
        System.out.println("-----------------------------------------------");
        int num = 0;
        for (String i: names){
            num++;
            System.out.println(num + ". " + i);
        }
    }

    
  }
