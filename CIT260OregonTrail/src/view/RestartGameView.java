/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author user
 */
public class RestartGameView {

    public RestartGameView() {
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
        System.out.println("getInputs RestartGameView");
        String[] prueba = new String[1];
        prueba[0] = "Que pasa viejo?";
        return prueba;
     }

    private boolean doAction(String[] inputs) {
        System.out.println("doAction RestartGameView ***");
        return true;
    }
    
}
