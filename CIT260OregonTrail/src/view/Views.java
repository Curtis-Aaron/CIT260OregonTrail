/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit260oregontrail.CIT260OregonTrail;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FELIPE
 */
public abstract class Views implements ViewInterface { // **class abstract
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = CIT260OregonTrail.getInFile();
    protected final PrintWriter console = CIT260OregonTrail.getOutFile();

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

                endOfView = doAction(inputs);
            }while(!endOfView);
    }
    
    @Override
    public String getInputs(){
        String inputs = "";
        boolean valid = false;
        
        while (!valid){
            try {
                this.console.println(displayMessage);
                
                inputs = this.keyboard.readLine();
                inputs = inputs.trim();
                
                if(inputs.length() < 1){
                    ErrorView.display(this.getClass().getName(),"You have to decide between one of the options");
                    continue;
                }
                valid = true;
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),"Error reading input " + ex.getMessage());
            }
        }   

        return inputs;
    }
        
        
}
    
    
 
