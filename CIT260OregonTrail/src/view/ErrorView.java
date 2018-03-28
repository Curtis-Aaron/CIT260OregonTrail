/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cit260oregontrail.CIT260OregonTrail;
import java.io.PrintWriter;

/**
 *
 * @author Carreño
 */
public class ErrorView {
    private static final PrintWriter console = CIT260OregonTrail.getOutFile();
    private static final PrintWriter log = CIT260OregonTrail.getLogFile();
    
    public static void display(String className,String errorMessage){
        console.println(
                 "\n---ERROR---------------------------"
               + "\n" + errorMessage
               + "\n-----------------------------------");
        log.printf("%n%n%s", className + " - " + errorMessage );
    }
}
