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
        // TODO review the generated test code and remove the default call to fail.
        
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
        System.out.println("calcGameProgress");
        int distanceTraveled = 0;
        int percentOfGame = 0;
        MapControl instance = new MapControl();
        int expResult = -1;
        int result = instance.calcGameProgress(distanceTraveled, percentOfGame);
        assertEquals(expResult, result);
    }
    
}
