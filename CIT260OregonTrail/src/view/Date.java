/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exceptions.GameControlException;


/**
 *
 * @author ING
 */
public class Date extends Views{
     public Date() {
        super("\n\n <--------|-------->It is 1848. Your  jumping off  place for Oregon <--------|-------->"
            + "\n\n <--------|-------->is Independence, Missouri. You must select which<--------|-------->"
            + "\n\n <--------|-------->         month to leave Independence.           <--------|-------->"
            + "\n1. >MARCH<"
            + "\n2. >APRIL<"
            + "\n3. >MAY<"
            + "\n4. >JUNE<"
            + "\n5. >JULY<"
            + "\nQ. >QUIT<"
            + "\n\n <-------------|-------------><-------------|------------->");
    }

    @Override
    public boolean doAction(String inputs) {
            String value = inputs.toUpperCase();
            switch (value)
            {
                case "1": //March
                    this.console.println("The month is March.");
                    //scene.setCurrentMonth("March");
                    //this.showMainMenu(currentGame);
                    break;
                case "2": //April
                    this.console.println("The month is April.");
                    //scene.setCurrentMonth("April");
                    //this.showMainMenu(currentGame);
                    break;
                case "3": //May
                    this.console.println("The month is May.");
                    //scene.setCurrentMonth("May");
                    //this.showMainMenu(currentGame);
                    break;
                case "4": //June
                    this.console.println("The month is June.");
                    //scene.setCurrentMonth("June");
                    //this.showMainMenu(currentGame);
                    break;
                case "5": //July
                    this.console.println("The month is July.");
                    //scene.setCurrentMonth("July");
                    //this.showMainMenu(currentGame);
                    break;
            }
        return true;
    }

    @Override
    public void displayNextView() {
    }
    
}        
    
    

    

