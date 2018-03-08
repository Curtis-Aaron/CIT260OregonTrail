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
public abstract class Views implements ViewInterface { // **class abstract
    
    protected String displayMessage;

    public Views(String displayMessage) {
        this.displayMessage = displayMessage;
    }

    public Views() {
    }
    @Override
    public void display(){
        boolean endOfView = false;
            do{
                String inputs = this.getInputs();
                if(inputs.length() == 0 || inputs.toUpperCase().equals("Q")) 
                    return;

            //    endOfView = doAction(inputs);
            }while(!endOfView);
    }
    
    @Override
    public String getInputs(){
        String inputs = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println(displayMessage);
        
            java.util.Scanner sc = new java.util.Scanner(System.in);
            inputs = sc.nextLine();
            inputs = inputs.trim();
            
            if(inputs.length() < 1){
                System.out.println("You have to decide between one of the options");
                continue;
            }
            valid = true;
        }   

        return inputs;
    }
        
        
}
    
    
 
