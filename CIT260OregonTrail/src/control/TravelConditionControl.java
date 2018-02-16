/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Calendar;
import java.util.Date;
import model.TravelConditions;

/**
 *
 * @author 
 */
public class TravelConditionControl {
    public boolean changeDate (Date newDate){
    //  changeDate(newDate): boolean
    //  BEGIN
    //      if the year of newDate != 1848 then RETURN FALSE 
    //      actual date = new date
    //  END
        Calendar cal = Calendar.getInstance();
        cal.setTime(newDate);
        if(cal.get(Calendar.YEAR) != 1848 ){
            System.out.println("The year can not be different to 1848");
            return false;
        }
        TravelConditions travelConditions = new TravelConditions();
        travelConditions.setDate(newDate);
        
        return true;
    }
}
