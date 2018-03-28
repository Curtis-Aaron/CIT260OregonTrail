/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260oregontrail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import model.Game;
import model.Player;
import view.ErrorView;
import view.StartProgramView;


/**
 *
 * @author Govert Carreño
 */
public class CIT260OregonTrail {
    private static Game game = null;
    private static Player player = null;

    private static BufferedReader inFile = null;
    private static PrintWriter outFile = null;
    private static PrintWriter logFile = null;
    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        CIT260OregonTrail.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        CIT260OregonTrail.game = game;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CIT260OregonTrail.inFile = inFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CIT260OregonTrail.outFile = outFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CIT260OregonTrail.logFile = logFile;
    }
    
    
    
    public static void main(String[] args) {
        try {
            CIT260OregonTrail.inFile = new BufferedReader(new InputStreamReader(System.in));
            CIT260OregonTrail.outFile = new PrintWriter(System.out, true);
            CIT260OregonTrail.logFile = new PrintWriter("logFile.txt"); //Si algo pasa es culpa de Ingrid
            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        }
        catch (Throwable e){
            ErrorView.display("CIT260OregonTrail",e.getMessage());
        }
        finally{
            try {
                if(CIT260OregonTrail.inFile != null)
                CIT260OregonTrail.inFile.close();
                if(CIT260OregonTrail.outFile != null)
                CIT260OregonTrail.outFile.close();
                if(CIT260OregonTrail.logFile != null)
                CIT260OregonTrail.logFile.close();
            } catch (IOException ex) {
                ErrorView.display("CIT260OregonTrail","Error closing files " + ex.getMessage());
                return;
            }
        }
        
    }
        
    
}
