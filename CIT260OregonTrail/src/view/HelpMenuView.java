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
//        System.out.println("getInputs HelpMenuView");
//        String[] prueba = new String[1];
//        prueba[0] = "Que pasa viejo?";
//        return prueba;
        
        boolean valid = false;
        
        while (!valid){
            System.out.printIn("Frequently Questions"
                    + "\n1. About the Game"
                    + "\n2. General Information"
                    + "\n3. When to Buy"
                    + "\nQ. Quit");
        
            Scanner Sc = new Scanner(System.in);
            String value = Sc.nextLine();
            value = value.trim();
            
            if(value.lenght()<1){
                System.out.println("You have to decide between oneof the options");
                continue;
            }
            inputs[0] = value;
            valid = true;
        }   

        return inputs;
    }

    public boolean doAction(String[] inputs) {
        
        String helpMenuItem = inputs[0].toUpperCase();
        
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
            case "Q": return true;
                    
            default:return false;
            
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
    
}
