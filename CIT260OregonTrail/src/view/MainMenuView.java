/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Culpa De Felipe
 */
public class MainMenuView {

    public MainMenuView() {
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

    public boolean doAction(String[] inputs) {
        
//                doAction(inputs): boolean {
//                  menuItem = first element in inputs array
//                  convert menuItem to upper case
//                  SWITCH menuItem
//                      “N”: startNewGame()
//                      “R”: restartGame()
//                      “H”: getHelp()
//                      “E”: RETURN true
//                      DEFAULT: DISPLAY “Invalid menu item.”
//                   ENDSWITCH
//                   RETURN false
//                }
//  MainMenuView mainMenuView = new MainMenuView();
//        mainMenuView.display();
//              System.out.println("**** MainMenuView goAction method Run ***");
//              return true;

        String menuItem = inputs[0].toUpperCase();
        switch (menuItem) {
            case 1:  startNewGame();
                     break;
            case 2:  restartGame();
                     break;
            case 3:  getHelp();
                     break;
            case 4:  return true;
                    
            default: System.out.println("Invalid menu item.");
                     break;
    }
        return false;
}

    private String[] getInputs() {
//            getInputs(): String[] {
//
//             inputs = new String array whose length = no. of inputs
//             Display the instructions
//
//            valid = false
//            WHILE valid == false (while input value is not valid)
//
//            Display the prompt message
//            Get the value entered from the keyboard
//            Trim off leading and trailing blanks from the value
//            IF length of the value < 1 then
//            Display "You must enter a value.”
//            Continue
//            ENDIF
//            Assign value to the next position in the inputs array
//           valid = true
//            ENDWHILE
//
//            RETURN inputs
//            }
            String[] inputs = new String[1];
        
        boolean valid = false;
        
        while(!valid){
            System.out.println("Pick a Menu Option"
                    + "\n1. Travel The Trail"
                    + "\n2. Learn about the Trail"
                    + "\n3. See the Oregon Top Ten"
                    + "\n4. Choose Management Options"
                    + "\nQ. Quit" );
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

    private void startNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void restartGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
}
