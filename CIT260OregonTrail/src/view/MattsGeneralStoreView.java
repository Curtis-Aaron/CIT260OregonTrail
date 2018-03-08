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
public class MattsGeneralStoreView extends Views{
    private String menu;
    private ArrayList<Items> itemsList = null;
    
    float totOxen = 0;
    float totFoot = 0;
    float totCloth = 0;
    float totAmmunition = 0;

    public MattsGeneralStoreView() {
        //super("\n******** The Oregon Trail – Matt’s General Store  ********"
        //    + "\n*     Choose an item to add to your order:               *"
//            + "\n*     1. Oxen                              " + totOxen  + "           *"
//            + "\n*     2. Food                              " + totFoot  + "           *"
//            + "\n*     3. Clothing                          " + totCloth + "           *"
//            + "\n*     4. Ammunition                        " + totAmmunition + "           *"
//            + "\n*     5. Spare Parts                       $0            *"
//            + "\n*               Funds Remaining            $" + totAmmunition + "         *"
//            + "\n*     What is your choice (C to continue)?               *"
//            + "\n**********************************************************");
    }
            
    @Override
    public boolean doAction(String inputs) {
        
        String item = inputs.toUpperCase();
        
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

    
    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
