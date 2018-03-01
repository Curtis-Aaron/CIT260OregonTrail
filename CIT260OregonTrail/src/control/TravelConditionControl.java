/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import cit260oregontrail.CIT260OregonTrail;
import java.util.Calendar;
import java.util.Date;
import model.Game;
import model.TravelConditions;

/**
 *
 * @author 
 */
public class TravelConditionControl {
    public boolean changeDate (int x){
        Game game = CIT260OregonTrail.getGame();
        
        
        Calendar c = Calendar.getInstance();
        c.setTime(game.getDate());
//        int i = 0;
        while(x > 0){
            
            c.add(Calendar.DATE, 1);
           
//        int i = 0;
//      I want to create this loop to add one day to the setDate() method. I have to go but will be back aroun 915 columbia time.        
            x--;
        }
        game.setDate(c.getTime());
        CIT260OregonTrail.setGame(game);
        return true;
    }
}
