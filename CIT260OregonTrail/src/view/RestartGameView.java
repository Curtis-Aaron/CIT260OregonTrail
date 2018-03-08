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
public class RestartGameView extends Views{

    public RestartGameView() {
        super();
    }
   
    @Override
    public boolean doAction(String inputs) {
        System.out.println("doAction RestartGameView ***");
        return true;
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
