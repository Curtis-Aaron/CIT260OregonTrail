/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author user
 */
public class CheckPoints implements Serializable{

    private String name;
    private int rowCoordinate;
    private int columnCoordinate;
    private boolean visited; 

    public CheckPoints() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRowCoordinate() {
        return rowCoordinate;
    }

    public void setRowCoordinate(int rowCoordinate) {
        this.rowCoordinate = rowCoordinate;
    }

    public int getColumnCoordinate() {
        return columnCoordinate;
    }

    public void setColumnCoordinate(int columnCoordinate) {
        this.columnCoordinate = columnCoordinate;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + this.rowCoordinate;
        hash = 17 * hash + this.columnCoordinate;
        hash = 17 * hash + (this.visited ? 1 : 0);
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
        final CheckPoints other = (CheckPoints) obj;
        if (this.rowCoordinate != other.rowCoordinate) {
            return false;
        }
        if (this.columnCoordinate != other.columnCoordinate) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CheckPoints{" + "name=" + name + ", rowCoordinate=" + rowCoordinate + ", columnCoordinate=" + columnCoordinate + ", visited=" + visited + '}';
    }

    
    
}

