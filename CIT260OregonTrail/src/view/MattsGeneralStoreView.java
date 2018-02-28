/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.Items;

/**
 *
 * @author Govert Carreño
 */
public class MattsGeneralStoreView {
    private String menu;
    private ArrayList<Items> itemsList = null;
    
    float totOxen = 0;
    float totFoot = 0;
    float totCloth = 0;
    float totAmmunition = 0;

    public MattsGeneralStoreView() {
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
            System.out.println("\n******** The Oregon Trail – Matt’s General Store  ********"
                             + "\n*     Choose an item to add to your order:               *"
                             + "\n*     1. Oxen                              " + totOxen  + "           *"
                             + "\n*     2. Food                              " + totFoot  + "           *"
                             + "\n*     3. Clothing                          " + totCloth + "           *"
                             + "\n*     4. Ammunition                        " + totAmmunition + "           *"
                             + "\n*     5. Spare Parts                       $0            *"
                             + "\n*               Funds Remaining            $" + totAmmunition + "         *"
                             + "\n*     What is your choice (C to continue)?               *"
                             + "\n**********************************************************");
        
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
        
        String item = inputs[0].toUpperCase();
        
        switch (item){
            case "1": 
                    /*this.frequentlyQuestions();*/
                    break;
            case "2": 
                    /*this.aboutTheGame();*/
                    break;
            case "3": 
                    /*this.generalInformation();*/
                    break;
            case "4": 
                    /*this.whenToBuy();*/
                    break;
            case "Q": 
                return true;
            default:
                return true;
        }

        return true;
    }

    
}
