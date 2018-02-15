/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CheckPoints;

/**
 *
 * @author Govert Carreño
 */
public class MapControl {
    public boolean moveToNewLocation(CheckPoints checkPoint){
//        moveToNewLocation(checkPoint): boolean
//        BEGIN
//
//            IF checkPint is Visited THEN 	
//            BEGIN
//                PRINT “The Location has been visited”
//                RETURN FALSE.
//            END
//            checkPoint.visited = true	
//            RETURN TRUE.
//
//        END   
        if(checkPoint.isVisited()) {
            System.out.println("The Location has been visited");
            return false;
        }
        
        checkPoint.setVisited(true);
        return true;

    }
}
