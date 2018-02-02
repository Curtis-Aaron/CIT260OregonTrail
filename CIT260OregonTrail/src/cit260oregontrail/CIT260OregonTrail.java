/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260oregontrail;

import model.Game;
import model.Items;
import model.Player;
import model.WagonPartyMembers;
import model.Map;
import model.Occupation;
import model.CheckPoints;

/**
 *
 * @author Govert Carreño
 */
public class CIT260OregonTrail {

    public static void main(String[] args) {
        
        Game game = new Game();
        Player player = new Player();
        Items items = new Items();
        WagonPartyMembers wagonPartyMembers = new WagonPartyMembers();
        Map map = new Map();
        Occupation occupation = new Occupation();
        CheckPoints checkPoints = new CheckPoints();
        
        
        player.setName("Ingrid");
        player.setBetScore(50000000);
        
        game.setFoodRations(3);
        game.setNumberOfPeople(5);
        game.setPace(1);
        game.setPlayer(player);
        
        items.setCost(60);
        items.setName("Oxen");
        items.setGame(game);
        items.setQuantity(2);
        
        wagonPartyMembers.setGame(game);
        wagonPartyMembers.setHealth("Good");
        wagonPartyMembers.setName("Nombre de prueba");
        
        map.setRowCount (15);         
        map.setColumnCount (25);
        
        System.out.println(game.toString() 
                         + "\n" + player.toString()
                         + "\n" + items.toString()
                         + "\n" + wagonPartyMembers.toString());
        
    }
    
}
