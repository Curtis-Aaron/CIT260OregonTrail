/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
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
        
        if(quantity <= 0){
           System.out.println("Invalid name");
           return false;
       }
       
       if(name.length() <= 1) {
           System.out.println("Error: The name must contain at least 2 letters");
           return false;
           
       }
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
    
    public static ArrayList<Items> createItems() {
        ArrayList<Items> itemList = new ArrayList<>();
        Items singleItem = new Items();
        singleItem.setName("Oxen");
        singleItem.setCost((float) 40.00);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Foot");
        singleItem.setCost((float)0.20);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Clothing");
        singleItem.setCost(10);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Ammunition");
        singleItem.setCost(2);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Wagon Wheel");
        singleItem.setCost(10);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Wagon Axle");
        singleItem.setCost(10);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Wagon Tongue");
        singleItem.setCost(10);
        itemList.add(singleItem);
        
        return itemList;
    }
}