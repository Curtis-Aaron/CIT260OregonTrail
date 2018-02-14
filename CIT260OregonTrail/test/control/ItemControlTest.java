/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }

    /**
     * Test of addItemToStock method, of class ItemControl.
     */
    @Test
    public void testAddItemToStock() {
        System.out.println("addItemToStock");
        String name = "Govert";
        int quantity = 500;
        ItemControl instance = new ItemControl();
        boolean expResult = true;
        boolean result = instance.addItemToStock(name, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Por que falla loco?");
    }
    
}
