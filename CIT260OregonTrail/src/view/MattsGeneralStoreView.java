/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit260oregontrail.CIT260OregonTrail;
import control.ItemControl;
import exceptions.ItemControlException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Items;

/**
 *
 * @author Govert Carreño
 */
public class MattsGeneralStoreView extends Views{
    private String showMenu;
    
    private float[] itemValue = new float[7];

    public MattsGeneralStoreView() {
        displayMessage = "\n******** The Oregon Trail – Matt’s General Store  ********"
            + "\n*     Choose an item to add to your order:               *"
            + "\n*     1. Oxen                              " + itemValue[0] + "           *"
            + "\n*     2. Food                              " + itemValue[1] + "           *"
            + "\n*     3. Clothing                          " + itemValue[2] + "           *"
            + "\n*     4. Box of Ammunition                 " + itemValue[3] + "           *"
            + "\n*     ** Spare Parts                       $            *"
            + "\n*        5. Wagon Wheel                       " + itemValue[4] + "           *"
            + "\n*        6. Wagon Axle                        " + itemValue[5] + "           *"
            + "\n*        7. Wagon Tongue                      " + itemValue[6] + "           *"
            + "\n*               Funds Remaining            $" + CIT260OregonTrail.getGame().getOccupation().getMoney() + "         *"
            + "\n*     Select the number of the item you want (C to continue)?               *"
            + "\n**********************************************************";
        
    }
            
    @Override
    public boolean doAction(String inputs) {
        
        String selection = inputs.toUpperCase();
        selection = selection.trim();
        int numSel = Character.getNumericValue(selection.charAt(0));
        
        switch(selection){
            case "1":
                this.promtQuantity(ItemList.OXEN.ordinal());
                break;
            case "2":
                this.promtQuantity(ItemList.FOOD.ordinal());
                break;
            case "3":
                this.promtQuantity(ItemList.CLOTH.ordinal());
                break;
            case "4":
                this.promtQuantity(ItemList.AMMUNITION.ordinal());
                break;
            case "5":
                this.promtQuantity(ItemList.WAGON_WHEEL.ordinal());
                break;    
            case "6":
                this.promtQuantity(ItemList.WAGON_AXLE.ordinal());
                break;
            case "7":
                this.promtQuantity(ItemList.WAGON_TONGUE.ordinal());
                break;
            case "C":
                this.displayNextView();
                break;
                
                
        }
 
        return true;
    }
    private void updateMenu(){
        showMenu = "\n******** The Oregon Trail – Matt’s General Store  ********"
            + "\n*     Choose an item to add to your order:               *"
            + "\n*     1. Oxen                              " + itemValue[0] + "           *"
            + "\n*     2. Food                              " + itemValue[1] + "           *"
            + "\n*     3. Clothing                          " + itemValue[2] + "           *"
            + "\n*     4. Box of Ammunition                 " + itemValue[3] + "           *"
            + "\n*     ** Spare Parts                       $            *"
            + "\n*        5. Wagon Wheel                       " + itemValue[4] + "           *"
            + "\n*        6. Wagon Axle                        " + itemValue[5] + "           *"
            + "\n*        7. Wagon Tongue                      " + itemValue[6] + "           *"
            + "\n*               Funds Remaining            $" + CIT260OregonTrail.getGame().getOccupation().getMoney() + "         *"
            + "\n*     What is your choice (C to continue)?               *"
            + "\n**********************************************************";
    }
    
    @Override
    public void displayNextView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void promtQuantity(int index) {
        ArrayList<Items> itemsList = CIT260OregonTrail.getGame().getItems();
        
        Items selectedItem = itemsList.get(index);
        this.updateMenu();
        this.displayMessage = this.showMenu
                            + "\n\nEach "+ selectedItem.getName() +" has a cost of $" + selectedItem.getCost() + ", "
                            + "How many do you want to buy?"
                            + "\nPres Q to return to Matt's General Store.";

        String res = this.getInputs();
        res = res.toUpperCase();
        
        if(res.equals("Q")) {
            this.displayMessage = this.showMenu;
            this.display();
        }
        else{
            try {
                itemValue[index] = ItemControl.addItemToStock(index, Integer.parseInt(res));
                this.updateMenu();
                this.displayMessage = this.showMenu;
                this.display();
            } catch (ItemControlException ex) {
                ErrorView.display(this.getClass().getName(),ex.getMessage());
            }
        }
    }

    
}
