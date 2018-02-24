/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Culpa De Felipe
 */
public class HelpMenuView {
    
    public HelpMenuView() {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean doAction(String[] inputs) {
        
        String helpMenuItem = inputs[0].toUpperCase();
        
        switch (helpMenuItem){
            case "1": System.out.println("Frequently Questions");
                    this.frequentlyQuestions();
                    break;
            case "2": System.out.println("About the game");
                    this.aboutTheGame();
                    break;
            case "3": System.out.println("General Information");
                    this.generalInformation();
                    break;
            case "4": System.out.println("When to buy");
                    this.whenToBuy();
                    break;
            case "Q": return true;
                    
            default:return false;
            
        }
        HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.display();
            return true;
    }

    private void frequentlyQuestions() {
        System.out.println("xxxxxxxxxxxxxxx");
    }

    private void aboutTheGame() {
        System.out.println("xxxxxxxxxxxxxxx");
    }

    private void generalInformation() {
        System.out.println("xxxxxxxxxxxxxxx");
    }

    private void whenToBuy() {
        System.out.println("xxxxxxxxxxxxxxx");
    }
    
}
