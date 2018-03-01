/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author bould
 */
class StopToRestView {
    
    public StopToRestView() {
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

            endOfView = this.doAction(inputs);
        }
        while(!endOfView);
    }
    
    private String[] getInputs() {
        String[] inputs = new String [1];
       boolean valid = false;
        
       while (!valid){
            System.out.println("How many days do you want to rest?");

            java.util.Scanner sc = new java.util.Scanner(System.in);
            String value = sc.nextLine();
            value = value.trim();

            if(value.length() < 1){
                System.out.println("Please select a number of days.");
                continue;
            }
            inputs[0] = value;
            valid = true;
       }
        return inputs;
    }
    
    private boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int i = 0;
        While(i < this.getInputs()){
        String[] i;
//      I want to create this loop to add one day to the setDate() method. I have to go but will be back aroun 915 columbia time.        
        i++;
        }
        
    }
    private void displayNextView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
}
