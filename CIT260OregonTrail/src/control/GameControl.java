/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import cit260oregontrail.CIT260OregonTrail;
import model.Player;

/**
 *
 * @author bould
 */
public class GameControl {

    public static Player savePlayer(String playersName) {
        //savePlayer(name): Player
        //BEGIN
        //    if name is null OR length of name is < 1 THEN
        //        RETURN null
        //    ENDIF
        //    player = new Player object
        //    save the name in the player object
        //    save the player in the main class of the project
        //    RETURN player
        //END
        if(playersName == null || playersName.length() < 1){
            System.out.println("The name cannot be blank");
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        CIT260OregonTrail.setPlayer(player);
        
        return player;
    }
    
}
