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
            + "\n1. Frequently Asked Questions"
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
                    this.frequentlyAskedQuestions();
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

    private void frequentlyAskedQuestions() {
        this.console.println("\n1. How long has this game been around?"
                            + "\n The game has been around in some version since 1971"
                            + "\n"
                            + "\n2. What is different about this version?"
                            + "\n This version of the game has been put together by a group of programming students"
                            + "\n from BYU-Idaho, as a class project."
                            + "\n"
                            + "\n3. What are some interesting facts about the Game?"
                            + "\n a) There was a sequel to the game. It was called Yukon Trail."
                            + "\n b) Oregon Trail is the world's longest running video game franchise."
                            + "\n c) The game, Oregon Trail, was inducted into the World Video Game Hall of Fame in 2016.");
        
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
        this.console.println("\n You may choose to purchase in game at one of THREE moments. 1) You may purchase before you "
                            + "\n depart on the trail. 2) You may purchase when you arrive at checkpoints throughout the game."
                            + "\n 3) You may choose to purchase or trade along the trail with other travelers." );
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
