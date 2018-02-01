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
    private WagonPartyMembers[] partyMemberses;

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

    public WagonPartyMembers[] getPartyMemberses() {
        return partyMemberses;
    }

    public void setPartyMemberses(WagonPartyMembers[] partyMemberses) {
        this.partyMemberses = partyMemberses;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.score ^ (this.score >>> 32));
        hash = 37 * hash + this.numberOfPeople;
        hash = 37 * hash + this.pace;
        hash = 37 * hash + this.foodRations;
        hash = 37 * hash + Objects.hashCode(this.player);
        hash = 37 * hash + Objects.hashCode(this.items);
        hash = 37 * hash + Arrays.deepHashCode(this.partyMemberses);
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
        if (!Arrays.deepEquals(this.partyMemberses, other.partyMemberses)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "score=" + score + ", numberOfPeople=" + numberOfPeople + ", pace=" + pace + ", foodRations=" + foodRations + ", player=" + player + ", items=" + items + ", partyMemberses=" + partyMemberses + '}';
    }
    
}
