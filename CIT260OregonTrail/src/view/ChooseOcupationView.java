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
public class ChooseOcupationView {

    public ChooseOcupationView() {
            }
    
    public void display(){
//            display() {
//            endView = false
//           DO
//            inputs = getInputs()
//            if (no input first input is Q
//            RETURN
//            endView = doAction(inputs)
//            WHILE endView != true
//            }
            boolean endOfView = false;
            do{
                String[] inputs = this.getInputs();
                if(inputs.length == 0 || inputs[0].toUpperCase().equals("Q")) 
                    return;

                endOfView = doAction(inputs);
            }
            while(!endOfView);
    }

    private String[] getInputs() {
        
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n\n Pick a Menu Option"
                             + "\n1. Be a banker from Boston"
                             + "\n2. Be carpenter from Ohio"
                             + "\n3. Be farmer from Illinois"
                             + "\n4. Find out the differences betweem them"
                             + "\nQ. Quit");
        
            java.util.Scanner sc = new java.util.Scanner(System.in);
            String value = sc.nextLine();
            value = value.trim();
            
            if(value.length() < 1){
                System.out.println("You have to decide between one of the options");
                continue;
            }
            inputs[0] = value;
            valid = true;
        }   

        return inputs;
    }

    public boolean doAction(String[] inputs) {
        
        String helpMenuItem = inputs[0].toUpperCase();
        
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

    private void displayNextView() {
        GameProgressView gameProgressView = new GameProgressView();
        gameProgressView.display();
    }
}


