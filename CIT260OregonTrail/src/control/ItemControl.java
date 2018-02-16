/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Game;
import model.Items;
import model.Occupation;

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
    
    public boolean useResource(Items item,int quantity){
//        useResource(item,quantity)
//        BEGIN
//                IF quantity <= 0 THEN PRINT “invalid quantity” RETURN FALSE
//                IF item = “” THEN PRINT “Invalid Item” RETURN FALSE
//
//                Subtract QUANTITY from the ITEM
//                RETURN TRUE
//
//        END
        if(quantity <= 0) {
            System.out.println("Invalid quantity");
            return false;
        }
        if(item == null){
            System.out.println("Invalid item");
            return false;
        }
        
        item.setQuantity(item.getQuantity() - quantity);
        
        return true;

        
    }
    
    public boolean debitMoney(float totalAmount){
//                debitMoney(totalAmount): boolean
//          BEGIN
//                  totalAmount = quantity * cost
//                  IF totalAmount <= 0 THEN RETURN FALSE
//
//                  Subtract totalAmount from getMoney, and Return to setMoney
//
//          END
        Occupation occupation = new Occupation(); 
        Items item = new Items();
        
        totalAmount = item.getQuantity() * item.getCost();
        if(totalAmount <= 0){
            System.out.println("Invalid Amount");
            return false;
        }else {
            occupation.setMoney(occupation.getMoney()- totalAmount);
        }
        return true;
    }
    
}