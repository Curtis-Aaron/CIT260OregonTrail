/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Govert Carreño
 */
public class Game implements Serializable{
    
    private long score;
    private int numberOfPeople;
    private int pace;
    private int foodRations;
    private Player player;
    private ArrayList<Items> items;
    private WagonPartyMembers[] partyMembers;
    private Map map;
    private Occupation occupation;
    private CheckPoints checkPoints;

    public Game() {
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getFoodRations() {
        return foodRations;
    }

    public void setFoodRations(int foodRations) {
        this.foodRations = foodRations;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public WagonPartyMembers[] getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(WagonPartyMembers[] partyMembers) {
        this.partyMembers = partyMembers;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public CheckPoints getCheckPoints() {
        return checkPoints;
    }

    public void setCheckPoints(CheckPoints checkPoints) {
        this.checkPoints = checkPoints;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (this.score ^ (this.score >>> 32));
        hash = 67 * hash + this.numberOfPeople;
        hash = 67 * hash + this.pace;
        hash = 67 * hash + this.foodRations;
        hash = 67 * hash + Objects.hashCode(this.player);
        hash = 67 * hash + Objects.hashCode(this.items);
        hash = 67 * hash + Arrays.deepHashCode(this.partyMembers);
        hash = 67 * hash + Objects.hashCode(this.map);
        hash = 67 * hash + Objects.hashCode(this.occupation);
        hash = 67 * hash + Objects.hashCode(this.checkPoints);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.score != other.score) {
            return false;
        }
        if (this.numberOfPeople != other.numberOfPeople) {
            return false;
        }
        if (this.pace != other.pace) {
            return false;
        }
        if (this.foodRations != other.foodRations) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        if (!Arrays.deepEquals(this.partyMembers, other.partyMembers)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.occupation, other.occupation)) {
            return false;
        }
        if (!Objects.equals(this.checkPoints, other.checkPoints)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "score=" + score + ", numberOfPeople=" + numberOfPeople + ", pace=" + pace + ", foodRations=" + foodRations + ", player=" + player + ", items=" + items + ", partyMembers=" + partyMembers + ", map=" + map + ", occupation=" + occupation + ", checkPoints=" + checkPoints + '}';
    }
}

   