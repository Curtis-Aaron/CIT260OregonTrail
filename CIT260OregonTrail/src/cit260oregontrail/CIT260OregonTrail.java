/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260oregontrail;

import model.Game;
import model.Player;
import view.StartProgramView;


/**
 *
 * @author Govert Carreño
 */
public class CIT260OregonTrail {
    private static Game game = null;
    private static Player player = null;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        CIT260OregonTrail.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        CIT260OregonTrail.game = game;
    }
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }
    
}
