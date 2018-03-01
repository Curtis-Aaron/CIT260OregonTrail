/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit260oregontrail.CIT260OregonTrail;
import control.TravelConditionControl;
import java.util.Calendar;
import model.Game;

/**
 *
 * @author bould
 */
class StopToRestView {
    
    public StopToRestView() {
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

            endOfView = this.doAction(inputs);
        }
        while(!endOfView);
    }
    
    private String[] getInputs() {
        String[] inputs = new String [1];
       boolean valid = false;
        
       while (!valid){
            System.out.println("How many days do you want to rest?");

            java.util.Scanner sc = new java.util.Scanner(System.in);
            String value = sc.nextLine();
            value = value.trim();

            if(value.length() < 1){
                System.out.println("Please select a number of days.");
                continue;
            }
            inputs[0] = value;
            valid = true;
       }
        return inputs;
    }
    
    private boolean doAction(String[] inputs) {
        
        
        inputs[0] = inputs[0].trim();
        int x = Integer.getInteger(inputs[0]);
        
        TravelConditionControl travelConditionControl = new TravelConditionControl();
        
        travelConditionControl.changeDate(x);

// For my formula please view the Game class in the model layer. As I was coding I realized
// there was a method for changing the date in the Game class.  The code was not correctly made.
// I pasted my equation code to that method and called on it here. 
   
        return true;
    }
    private void displayNextView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}   
