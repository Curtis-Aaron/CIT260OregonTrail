/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.Scanner;
import model.Player;

/**
 *
 * @author Govert Carreño
 */
public class StartProgramView {

    public StartProgramView() {
    }
    
    public void display(){
//        displayStartProgramView() {
        // endOfView = false
        // DO
        //inputs = getInputs()
        //IF no inputs were entered OR the first input is Q
        // RETURN
        //ENDIF
        //endOfView = doAction(inputs)
        //WHILE endOfView != true
        //}
       
        boolean endOfView = false;
        do{
            String[] inputs = this.getInputs();
            if(inputs.length == 0 || inputs[0].toUpperCase().equals("Q"))
                return;

            endOfView = doAction(inputs);
        }while(!endOfView);
       
       
       
    }

    private String[] getInputs() {
//    getInputs(): String[] 
//
//        inputs = new String array one element long
//        Display a description of the view
//
//        valid = false
//        WHILE valid == false (no input value has been enterd)
//
//            Display the prompt message
//            Get the value entered from the keyboard
//            Trim off leading and trailing blanks from the value
//            IF length of the value < 1 then
//                Display "You must enter a non-blank value”
//                Continue (move to the top of the loop and repeat)
//            ENDIF
//            Assign the value to the first position in the inputs array
//            valid = true (ends the loop)
//        ENDWHILE
//
//    RETURN inputs 
        
        String[] inputs = new String[1];
        System.out.println("Game Description");
        
        boolean valid = false;
        
        while(!valid){
            System.out.println("Please enter the player's name");
            Scanner sc = new Scanner(System.in);
            String value = sc.nextLine();
            value = value.trim();
            
            if(value.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            
            valid = true;
        }
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
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
        String playersName = inputs[0];
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


}
