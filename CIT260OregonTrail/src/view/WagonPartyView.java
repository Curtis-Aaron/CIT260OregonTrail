/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit260oregontrail.CIT260OregonTrail;
import control.GameControl;
import exceptions.GameControlException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.WagonPartyMembers;

/**
 *
 * @author user
 */
public class WagonPartyView extends Views{

    private static final ArrayList<String> names = new ArrayList<>();
    
    public WagonPartyView() {
        super("\n To start the game we are going to organize the Wagon Party"
            + "\n What are the names of your Wagon Party?"
            + "\n1. Type names"
            + "\n2. Display Wagon Party names in a file"
            + "\nQ. Quit");
    }

    @Override
    public boolean doAction(String inputs) {
        
        String helpMenuItem = inputs.toUpperCase();
        try {
            
            switch (helpMenuItem){
                case "1": 
                    this.assignWagonPartyMember();
                    break;
                case "2":
                    this.displayWagonPartyMember();
                    break;
                case "Q": 
                    return true;
                default:
                    ErrorView.display(this.getClass().getName(),"Please type a correct option");
                    break;
            }
        }
        catch (GameControlException e){
            this.console.println(e.getMessage());
        }
        return true;
    }
    int j;
    
    private void assignWagonPartyMember() throws GameControlException{

        this.console.println("\n Remember the wagon members are five.\n"
                          +"\n Please type the names for your wagon.  ");
        try {
            for ( j=1; j < 6; j++){
                    this.console.println(j + ". Wagon member");
                    String members = this.keyboard.readLine();
                    if (!members.equals("") ) {
                        names.add(members);
                        this.showArray();
                    }
                    else{
                        j--;
                        throw new GameControlException("You must type the name. It cannot be null");
                    }
            }
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        this.askForCorrection();

    }
    private void showArray() {
        this.console.println("----------------------------------------");
        int num = 0;
        for (String i: names){
            num++;
            this.console.println("--->" + num + ". " + i);
            this.console.println("----------------------------------------");
        }
        
    }
    
    @Override
    public void displayNextView() {
        ChooseOcupationView chooseOcupationView = new ChooseOcupationView();
        chooseOcupationView.display();
    }

    private void askForCorrection() throws GameControlException {
        this.console.println("Are all the names correct?");
        this.console.println("Type the number of the one you want to correct");
        this.console.println("Otherwise type 6, and hit Enter");
        try {
        String deleteNames = this.keyboard.readLine();
                
            if (j>6){
                for (int i=0; i<names.size(); i++){
                    if (i ==  (Integer.parseInt(deleteNames) - 1) )
                        names.remove(i);
                }
                this.showArray();
                this.console.println("Type the new name");
                
                for ( j=0; j < 1; j++){
                    this.console.println(". new member");
                    String members = this.keyboard.readLine();
                    names.add(members);
                    }
                this.showArray();
                this.askForCorrection();

            } else {
                this.displayNextView();
            }
            
        }catch (Exception e){
            ErrorView.display(this.getClass().getName(),e.getMessage());
        }
        
        this.displayNextView();
    }

    private void displayWagonPartyMember() {
        this.console.println("\n\n Enter the file path for file where the game is saved.");
        String wagonMember = displayMessage;
        displayMessage = "";
        String filePath = this.getInputs();
        displayMessage = wagonMember;
        
        try{
            GameControl.printListWagonMembers(CIT260OregonTrail.getGame().getWagonPartyMemberses(), filePath);
            this.console.println("List saved successfuly");
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }
  

}
    
