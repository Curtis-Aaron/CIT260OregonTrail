/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CheckPoints;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of moveToNewLocation method, of class MapControl.
     */
    @Test
    public void testMoveToNewLocation() {
        System.out.println("moveToNewLocation");
        System.out.println("----------------------------------");
        System.out.println("Test 1");
        CheckPoints checkPoint = new CheckPoints();
        checkPoint.setVisited(true);
        MapControl instance = new MapControl();
        boolean expResult = false;
        boolean result = instance.moveToNewLocation(checkPoint);
        assertEquals(expResult, result);
        
        
        System.out.println("----------------------------------");
        System.out.println("Test 2");
        checkPoint.setVisited(false);
        expResult = true;
        result = instance.moveToNewLocation(checkPoint);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcGameProgress method, of class MapControl.
     */
    @Test
    public void testCalcGameProgress() {
        System.out.println("----------------------------------");
        System.out.println("calcGameProgress");
        System.out.println("----------------------------------");
        System.out.println("Test 1");
        int distanceTraveled = 55;
        MapControl instance = new MapControl();
        float expResult = 2.75F;
        float result = instance.calcGameProgress(distanceTraveled);
        assertEquals(expResult, result, 2.75);

        System.out.println("----------------------------------");
        System.out.println("Test 2");
        distanceTraveled = -1;
        expResult = -1;
        result = instance.calcGameProgress(distanceTraveled);
        assertEquals(expResult, result, 0.0);
    
        System.out.println("----------------------------------");
        System.out.println("Test 3");
        distanceTraveled = 2280;
        expResult = -1;
        result = instance.calcGameProgress(distanceTraveled);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("----------------------------------");
        System.out.println("Test 4");
        distanceTraveled = 0;
        expResult = -1;
        result = instance.calcGameProgress(distanceTraveled);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("----------------------------------");
        System.out.println("Test 5");
        distanceTraveled = 2000;
        expResult = 100F;
        result = instance.calcGameProgress(distanceTraveled);
        assertEquals(expResult, result, 100);
    }
    


    /**
     * Test of calcGameProgress method, of class MapControl.
     */
}
