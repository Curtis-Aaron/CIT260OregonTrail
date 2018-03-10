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
public class HelpMenuView extends Views{
    
    public HelpMenuView() {
        super("\n\n Pick a Menu Option"
            + "\n1. Frequently Questions"
            + "\n2. About the Game"
            + "\n3. General Information"
            + "\n4. When to Buy"
            + "\nQ. Quit");
    }
    @Override
    public boolean doAction(String inputs) {
        
        String helpMenuItem = inputs.toUpperCase();
        
        switch (helpMenuItem){
            case "1": 
                    this.frequentlyQuestions();
                    break;
            case "2": 
                    this.aboutTheGame();
                    break;
            case "3": 
                    this.generalInformation();
                    break;
            case "4": 
                    this.whenToBuy();
                    break;
            case "Q": 
                return true;
            default:
                return true;
        }

        return true;
    }

    private void frequentlyQuestions() {
        System.out.println("Frequently Questions");
    }

    private void aboutTheGame() {
        System.out.println("About the game");
    }

    private void generalInformation() {
        System.out.println("General Information");
    }

    private void whenToBuy() {
        System.out.println("When to buy");
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
