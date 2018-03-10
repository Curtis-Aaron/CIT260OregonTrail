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
public class ChangePaceView extends Views{
    
    public ChangePaceView() {
        super("\n\nYou are currently at pace" 
            + "\nChange pace to..."
            + "\n1. a steady pace."
            + "\n2. a strenuous pace." 
            + "\n3. a grueling pace."
            + "\n4. Find out what these different paces mean.");
    }
    @Override
    public boolean doAction(String inputs) {
        return true;
//        I already wrote this when I realized I wouldnt finish this view.
//                "\nSteady-You travel about 8 hours a day, taking frequent rests."
//        + "\nYou take care not to get too tired."
//        + "\n"
//        + "\nStrenuous-You travel about 12 hours a day, starting just after"
//        + "\nsunrise and stopping shortly before sunset. You stop to rest"
//        + "\nonly when necessary. You finish each day feeling ver tired."
//        + "\n"
//        + "\nGrueling-You travel about 16 hours a day, starting before sunrise"
//        + "\nand continuing until dark. You almost never stop to rest. You do"
//        + "\nnot get enough sleep at night. You finish each day feeling abosolutely"
//        + "\nexhausted, and your health suffers."
    }

    @Override
    public void displayNextView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
