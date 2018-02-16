/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Date;
import model.TravelConditions;

/**
 *
 * @author 
 */
public class TravelConditionControl {
    public Date changeDate (TravelConditions date, String changeddate){
//  changeDate(newDate): boolean
//  BEGIN
//      IF newDate <= newDate THEN RETURN FALSE

//      changeDate adds one to date and RETURN to setDate
//  END

    changeddate = new Date;
    changeddate.setDate();
    System.out.println(changeddate);
    }
}
