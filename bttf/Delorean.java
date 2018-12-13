/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttf;

/**
 *
 * @author christopher.lewis
 */
public class Delorean {
    public static void main(String[] args) {
        boolean timeCircuits = true;
        double speed = 0;
        int gear = 1;
        double plutoniumLevelPercent = 100.0;
        if(timeCircuits) {
            System.out.println("Ready...");
            speed = (1000 / (20*5)) + 78;
            if(speed >= 88 && gear == 1){
                gear = 4;
            } else if(speed < 88 || gear != 4) {
                gear = 3;
                 
            }
                   
        }
                
    } 
    
}
