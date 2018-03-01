/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author FELIPE
 */
public class ChooseMonthOptionView {

    public ChooseMonthOptionView() {
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
            System.out.println("\n\n <--------|-------->It is 1848. Your  jumping off  place for Oregon <--------|-------->"
                             + "\n\n <--------|-------->is Independence, Missouri. You must select which<--------|-------->"
                             + "\n\n <--------|-------->         month to leave Independence.           <--------|-------->"
                             + "\n1. >MARCH<"
                             + "\n2. >APRIL<"
                             + "\n3. >MAY<"
                             + "\n4. >JUNE<"
                             + "\n5. >JULY<"
                             + "\nQ. >QUIT<"
                             + "\n\n <-------------|-------------><-------------|------------->");
        
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

    private boolean doAction(String[] inputs) {
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
    
    private void displayNextView() {
        MattsGeneralStoreView mattsGeneralStoreView = new MattsGeneralStoreView();
        mattsGeneralStoreView.display();
    }

}
