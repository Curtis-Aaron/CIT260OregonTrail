/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author user
 */
public class GameMenuView {
    
    public GameMenuView() {
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
            System.out.println("\n\n Pick a Menu OPTION"
                        + "\n1. Continue on trail"
                        + "\n2. Check Supplies"
                        + "\n3. Look at Map" 
                        + "\n4. Change Pace"
                        + "\n5. Food Rations"
                        + "\n6. Stop to Rest"
                        + "\n7. Attempt to trade"
                        + "\n8. Hunt for food");

            java.util.Scanner sc = new java.util.Scanner(System.in);
            String value = sc.nextLine();
            value = value.trim();

            if(value.length() < 1){
                System.out.println("Please select an option.");
                continue;
            }
            inputs[0] = value;
            valid = true;
       }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();
        switch (menuItem) {
            case "1":  
                this.continueOnTrail();
                break;
            case "2":  
                this.checkSupplies();
                break;
            case "3":  
                this.lookAtMap();
                break;
            case "4":  
                this.changePace();
                break;
            case "5":  
                this.foodRations();
                break;
            case "6":  
                this.stopToRest();
                break;
            case "7":  
                this.attemptToTrade();
                break;
            case "8":  
                this.huntForFood();
                break;
            default: System.out.println("Invalid menu item.");
                     break;
    }
        return false;
    }

    private void continueOnTrail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void checkSupplies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void lookAtMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void changePace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void foodRations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void stopToRest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void attemptToTrade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void huntForFood() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
