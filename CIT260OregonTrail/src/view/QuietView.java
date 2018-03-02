/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author ABC3
 */
public class QuietView {
    
}
private string [] getInputs (){
    String[] inputs = new String[1];
    boolean valid = false;

    while (!valid){
         System.out.println ("\n\n The Oregon Trail"
                             + "\n1. 1. Save and Quite"
                             + "\n2. 2. Quit"
                             + "\n3. C to continue"
                             + "\nQ. What is your choice?");

         java.util.Scanner sc = new java.util.Scanner(System.in);
         String value = sc.nextLine();
         value = value.trim();
            
            if(value.length() < 1){
                System.out.println("You have to choose");
                continue;
            }
            inputs[0] = value;
            valid = true;
        }   

        return inputs;
}