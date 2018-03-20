 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author bould
 */
public class TravelConditionControlException extends Exception{

    public TravelConditionControlException() {
    }

    public TravelConditionControlException(String string) {
        super(string);
    }

    public TravelConditionControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public TravelConditionControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public TravelConditionControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
