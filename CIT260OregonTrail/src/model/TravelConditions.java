/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Ingrid weather date distanceTraveled
 */
public class TravelConditions {
 
    private String weather;
    private Date date;
    private int distanceTraveled;
    private CheckPoints checkPoints;
    private WagonPartyMembers[]  partyMembers;

    public TravelConditions() {
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public CheckPoints getCheckPoints() {
        return checkPoints;
    }

    public void setCheckPoints(CheckPoints checkPoints) {
        this.checkPoints = checkPoints;
    }

    public WagonPartyMembers[] getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(WagonPartyMembers[] partyMembers) {
        this.partyMembers = partyMembers;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.weather);
        hash = 67 * hash + Objects.hashCode(this.date);
        hash = 67 * hash + this.distanceTraveled;
        hash = 67 * hash + Objects.hashCode(this.checkPoints);
        hash = 67 * hash + Arrays.deepHashCode(this.partyMembers);
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
        final TravelConditions other = (TravelConditions) obj;
        if (this.distanceTraveled != other.distanceTraveled) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.checkPoints, other.checkPoints)) {
            return false;
        }
        if (!Arrays.deepEquals(this.partyMembers, other.partyMembers)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TravelConditions{" + "weather=" + weather + ", date=" + date + ", distanceTraveled=" + distanceTraveled + ", checkPoints=" + checkPoints + ", partyMembers=" + partyMembers + '}';
    }
    
                
    
    
}
