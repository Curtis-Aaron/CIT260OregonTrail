/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CheckPoints;
import model.Game;
import model.Map;

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
    public float calcGameProgress (int distanceTraveled){
    //   calcGameProgress(distanceTraveled, game): int
    //   BEGIN
    //       IF distanceTraveled is less than zero then display an error message 
    //   RETURN “The value must not be < 0”
    //       IF distanceTraveled is greater than 2000 miles then display an error message 
    //   RETURN “The value must <= 2000 miles”
    //       IF distanceTraveled is 0 then display an error message 
    //   RETURN “Distance Traveled is required”

    //   percentOfGame = distanceTraveled / 2000
    //   percentOfGame = percentOfGame * 100
    //           RETURN percentOfGame
    //   END
        float percentOfGame;
        if (distanceTraveled < 0) {
            System.out.println("The value must not be < 0");
            return -1;
            }
        if (distanceTraveled > 2000){
            System.out.println("The value must <= 2000 miles");
            return -1;
        }
        if (distanceTraveled == 0){
            System.out.println("Distance Traveled is required");
            return -1;        
        }
        percentOfGame = distanceTraveled / 2000;
        percentOfGame = percentOfGame * 100;
        
        return percentOfGame;
    }
    public boolean createMap (int row, int column, Game game){
      
//        Map(rowCount, columnCount): 
//
//        BEGIN
//                IF rowCount = “”  OR columnCount <= 0 THEN RETURN FALSE
//
//                IF rowCount = “”  OR columnCount >= 0 && <= 4 THEN RETURN TRUE
//
//        END

    //
      if ((row <= 0 || row >= 5 ) || (column <= 0 || column >= 5 )){
            System.out.println("The row or column must not be <= 0");
            return false;
        }
        Map map = new Map(); 
        map.setColumnCount(column);
        map.setRowCount(row);
        game.setMap(map);
       
         return true;
 
    }
}
