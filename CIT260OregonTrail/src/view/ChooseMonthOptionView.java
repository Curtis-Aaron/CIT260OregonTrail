/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.lang.String;

/**
 *
 * @author FELIPE
 */
public class ChooseMonthOptionView extends Views{

    public ChooseMonthOptionView() {
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
    
    public void displayNextView() {
        MattsGeneralStoreView mattsGeneralStoreView = new MattsGeneralStoreView();
        mattsGeneralStoreView.display();
    }

}
