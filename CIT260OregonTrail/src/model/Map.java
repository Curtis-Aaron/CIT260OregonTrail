/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Map implements Serializable{
    private int rowCount;
    private int columnCount;
    private Game game;
    private int position;
    private CheckPoints[][] checkPoints;

    public Map() {
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public CheckPoints[][] getCheckPoints() {
        return checkPoints;
    }

    public void setCheckPoints(CheckPoints[][] checkPoints) {
        this.checkPoints = checkPoints;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.rowCount;
        hash = 89 * hash + this.columnCount;
        hash = 89 * hash + Objects.hashCode(this.game);
        hash = 89 * hash + this.position;
        hash = 89 * hash + Arrays.deepHashCode(this.checkPoints);
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.position != other.position) {
            return false;
        }
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        if (!Arrays.deepEquals(this.checkPoints, other.checkPoints)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", game=" + game + ", position=" + position + ", checkPoints=" + checkPoints + '}';
    }

    
    
}
