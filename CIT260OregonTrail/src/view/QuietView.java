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
    
    public QuietView(){
        
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
            case "1":  
                this.startNewGame();
                break;
            case "2":  
                this.restartGame();
                break;
            case "3":  
                this.getHelp();
                break;
            default: System.out.println("Invalid menu item.");
                     break;
    }
        return false;
}
    
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