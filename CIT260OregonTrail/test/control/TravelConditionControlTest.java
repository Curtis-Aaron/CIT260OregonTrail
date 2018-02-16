/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Date;
import model.TravelConditions;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FELIPE
 */
public class TravelConditionControlTest {
    
    public TravelConditionControlTest() {
    }

    /**
     * Test of changeDate method, of class TravelConditionControl.
     */
    @Test
    public void testChangeDate() {
        System.out.println("changeDate");
        TravelConditions date = null;
        String changeddate = "";
        TravelConditionControl instance = new TravelConditionControl();
        Date expResult = null;
        Date result = instance.changeDate(date, changeddate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
