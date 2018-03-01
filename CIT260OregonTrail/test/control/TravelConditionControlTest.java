/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TravelConditionControlTest {
    
    public TravelConditionControlTest() {
    }

    /**
     * Test of changeDate method, of class TravelConditionControl.
     */
    @Test
    public void testChangeDate() throws ParseException {
        System.out.println("changeDate");
        System.out.println("-------------------------------------");
        System.out.println("Test 1");
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date newDate = fmt.parse("1985-01-01");
        TravelConditionControl instance = new TravelConditionControl();
        boolean expResult = false;
        //boolean result = instance.changeDate(newDate);
        //assertEquals(expResult, result);
        
        System.out.println("-------------------------------------");
        System.out.println("Test 2");
        newDate = fmt.parse("1848-01-01");
        instance = new TravelConditionControl();
        expResult = true;
        //result = instance.changeDate(newDate);
        //assertEquals(expResult, result);
        
    }
    
}
