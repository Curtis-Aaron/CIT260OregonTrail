/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Game;
import model.Items;

/**
 *
 * @author bould
 */
public class ItemControl {
    public boolean addItemToStock(String name, int quantity){
//        addItemToStock(name,quantity): boolean
//        BEGIN
//                IF name = “”  OR quantity <= 0 THEN RETURN FALSE
//
//                add the quantity to the quantity variable in the item class
//                RETURN TRUE
//        END

        if(name.equals("") || quantity <= 0) return false;
        //doesn't an if statement automatically return false if the statements do not verify as true?
        Items item = new Items();        
        item.setQuantity(quantity);
        
        return true;
    }
    
}
