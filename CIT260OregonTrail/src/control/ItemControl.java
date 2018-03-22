/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exceptions.ItemControlException;
import java.util.ArrayList;
import model.Game;
import model.Items;
import model.Occupation;

/**
 *
 * @author bould
 */
public class ItemControl {
    public boolean addItemToStock(String name, int quantity) throws ItemControlException{
//        addItemToStock(name,quantity): boolean
//        BEGIN
//                IF name = “”  OR quantity <= 0 THEN RETURN FALSE
//
//                add the quantity to the quantity variable in the item class
//                RETURN TRUE
//        END
           
        if(quantity <= 0){
           throw new ItemControlException("Invalid name");
           
       }
       
       if(name.length() <= 1) {
           throw new ItemControlException("Error: The name must contain at least 2 letters");
                      
       }
        Items item = new Items();        
        item.setQuantity(quantity);
        
        return true;
    }
    
            
    public void useResource(Items item,int quantity) throws ItemControlException{
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
            throw new ItemControlException("Invalid quantity");
            
        }
        if(item == null){
            throw new ItemControlException("Invalid item");
            
        }
        
        item.setQuantity(item.getQuantity() - quantity);
        
   }
    
    public void debitMoney(float totalAmount) throws ItemControlException{
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
            throw new ItemControlException("Invalid Amount");
            
        }else {
            occupation.setMoney(occupation.getMoney()- totalAmount);
        }
    }
    
    public static ArrayList<Items> createItems() {
        ArrayList<Items> itemList = new ArrayList<>();
        Items singleItem = new Items();
        singleItem.setName("Oxen");
        singleItem.setCost((float) 40.00);
        itemList.add(singleItem);
        
        singleItem = new Items();
        singleItem.setName("Food");
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