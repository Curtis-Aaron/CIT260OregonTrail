/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import cit260oregontrail.CIT260OregonTrail;
import exceptions.MapControlException;
import model.CheckPoints;
import model.Game;
import model.Map;

/**
 *
 * @author Govert Carreño
 */
public class MapControl {

    public boolean moveToNewLocation(CheckPoints checkPoint) throws MapControlException{
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
            throw new MapControlException("The Location has been visited");
            
        }
        
        checkPoint.setVisited(true);
        return true;

    }
    public double calcGameProgress (double distanceTraveled) throws MapControlException{
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
        double percentOfGame;
        if (distanceTraveled < 0) {
            throw new MapControlException("The value must not be < 0");
            
            }
        if (distanceTraveled > 2000){
            throw new MapControlException("The value must >= 2000 miles");
            
        }
        if (distanceTraveled == 0){
            throw new MapControlException("Distance Traveled is required");
                    
        }
        percentOfGame = distanceTraveled / 2000F;
        percentOfGame = percentOfGame * 100;
        
        return percentOfGame;
    }
    public static Map createMap (int row, int column) throws MapControlException{
      
//        Map(rowCount, columnCount): 
//        BEGIN
//                IF rowCount = “”  OR columnCount <= 0 THEN RETURN FALSE
//                IF rowCount = “”  OR columnCount >= 0 && <= 4 THEN RETURN TRUE
//        END

        if ((row <= 0 || row >= 5 ) || (column <= 0 || column >= 5 )){
            throw new MapControlException("The row or column must not be <= 0");
           
        }
        Map map = new Map(); 
        map.setColumnCount(column);
        map.setRowCount(row);
        
        //Assign Locations
        CheckPoints[][] checkPoints = MapControl.createLocations(row,column);
        map.setCheckPoints(checkPoints);
        
        return map;
 
    }
    
    private static CheckPoints[][] createLocations(int rowCount,int columnCount) throws MapControlException{
        if(rowCount < 1 || columnCount < 1){
            throw new MapControlException("Invalid row or column number");
            
        }
        CheckPoints[][] locations = new CheckPoints[rowCount][columnCount];
        for(int x = 0; x < rowCount; x++){
            for(int y = 0; y < columnCount; y++){
                locations[x][y] = new CheckPoints();
                locations[x][y].setRowCoordinate(x);
                locations[x][y].setColumnCoordinate(y);
                locations[x][y].setVisited(false);
            }
        }
        
        return locations;
    }
    
    public static boolean changePace(int pace) throws MapControlException{
        if(pace <= 0 || pace > 3) {
            throw new MapControlException("Invalid pace");
            
        }
        Game game = CIT260OregonTrail.getGame();
        game.setPace(pace);
        
        return true;
    }
}
