/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.MapControl;
import java.util.Scanner;

/**
 *
 * @author FELIPE
 */
public class GameProgressView {

    public GameProgressView() {
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
        String[] inputs = new String[0];
        boolean valid = false;
        
        while(!valid){
            System.out.println("\n ..........................................................."
                             + "\n .\nWhen you select \"Look at Map\" in the Main Menu, you  ."
                             + "\n .\nwill whatch an image with the cities and places in the  ."
                             + "\n .\ngame, additionally close to the description there is   ."
                             + "\n .\nthe distance in miles. Please take note                ."
                             + "\n ..........................................................."  
                             + "\n"
                             + "\n Please enter the the distance in miles: ");
            Scanner sc = new Scanner(System.in);
            String value = sc.nextLine();
            value = value.trim();
            
            if(value.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            inputs[0] = value;
            valid = true;
        }
        
        return inputs;
     
    }

    private boolean doAction(String[] inputs) {
        inputs[0] = inputs[0].trim();
        MapControl calcGameProgress;
        calcGameProgress = new MapControl();
        
        if (calcGameProgress == null){
            System.out.println("Please, input the distance traveled.");    
            return false;
        }
        
        System.out.println(calcGameProgress);
        
       
        return true;
    }
                
}

    

        
 

