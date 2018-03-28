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
        this.console.println("Frequently Questions");
    }

    private void aboutTheGame() {
        this.console.println("\n Welcome to the experience of your life with The Oregon Trail game! Try taking a journey by" 
                            + "\n covered wagon across 2000 miles of plains, rivers, and mountains. Try! On the plains, will" 
                            + "\n you slosh your oxen through mud and water-filled ruts or will you plod through dust six" 
                            + "\n inches deep? How will you cross the rivers? If you have money, you might take a ferry(if" 
                            + "\n there is a ferry). Or, you can ford the river and hope you and your wagon aren’t swallowed" 
                            + "\n alive! What about supplies? Well, if you’re low on food you can hunt. You might get a buf-"
                            + "\n falo...you might. And there are bear in the mountains. At the Dalles, you can try navigating" 
                            + "\n the Columbia River, but if running the rapids with a makeshift raft makes you queasy, better" 
                            + "\n take the Barlow Road. If for some reason you don’t survive -- your wagon burns, or thieves" 
                            + "\n steal your oxen, or you run out of provisions, or you die of Cholera -- don’t give up! Try"
                            + "\n again...and again… until your name is up with the others on The Oregon Top Ten."
                            + "\n This game has been developed by Aaron Curtis, Govert Carreño, Ingrid Choque, and Felipe Patiño"
        );
    }

    private void generalInformation() {
        this.console.println("General Information");
    }

    private void whenToBuy() {
        this.console.println("When to buy");
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
