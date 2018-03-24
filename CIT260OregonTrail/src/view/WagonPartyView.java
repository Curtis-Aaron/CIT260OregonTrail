/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exceptions.GameControlException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class WagonPartyView extends Views{

    private static final Scanner inputs = new Scanner(System.in);
    private static final ArrayList<String> names = new ArrayList<>();
    
    public WagonPartyView() {
        super("\n\n What are the names of your Wagon Party?"
            + "\n1. Type names"
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
                case "Q": 
                    return true;
                default:
                    System.out.println("Please type a correct option");
                    break;
            }
        }
        catch (GameControlException e){
            System.out.println(e.getMessage());
        }
        return true;
    }

    
    private void assignWagonPartyMember() throws GameControlException{

        System.out.println("\n Remember the wagon members are five.\n"
                          +"\n Please type the names for your wagon.  ");

        for (int j=1; j < 6; j++){
            String members = inputs.nextLine();
            if (!members.equals("") ) { 
                System.out.println(j + ". Wagon member");
                names.add(members);
            }
            else{ 
                j--;
                throw new GameControlException("You must type the name. It cannot be null");
            }
        }
        this.askForCorrection();

    }
    private void showArray() {
        System.out.println("-----------------------------------------------");
        int num = 0;
        for (String i: names){
            num++;
            System.out.println(num + ". " + i);
        }
        
        this.displayNextView();
    }
    
    @Override
    public void displayNextView() {
        ChooseOcupationView chooseOcupationView = new ChooseOcupationView();
        chooseOcupationView.display();
    }

    private void askForCorrection() {
        System.out.println("Are all the names well?");
        System.out.println("Type the number of the one you want to correct");
        System.out.println("Otherwise type 0");
        String deleteNames = inputs.next();
        try {
            for (int i=0; i<names.size(); i++){
                if (i ==  (Integer.parseInt(deleteNames) - 1) )
                names.remove(i);
                this.assignWagonPartyMember();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.showArray();
    }
  }
