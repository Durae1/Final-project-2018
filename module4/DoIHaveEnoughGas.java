

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg4;
import java.util.Scanner;

/**
 *
 * @author lewic
 */
public class DoIHaveEnoughGas {
    public static void main(String[]args ) {
        //set up our gass mpg
        final int MILES_PER_GALLON= 28;
        
        // declare double typpe variables
        double gasTank;
        double stationDistance;
        //create a scanner object
        Scanner userInputScanner = new Scanner(System.in);
        
        //prompt the user
        System.out.println("How many gallons of gas remain in your tank?");
        gasTank = userInputScanner.nextDouble();
      
        
        System.out.println("How many miles to the next service station?");
        stationDistance = userInputScanner.nextDouble();
        // reading if the station distance is furthere than the max fuel
        if(stationDistance < MILES_PER_GALLON * gasTank){
            System.out.println("Whew youll make it to the next station!");
            
        } else {
            // code to run if the comparison results top false
            System.out.println(" Red Alert! Youll soon be marooned sucker!");
            
            
        } // close if else block
            
        
    
    
        
    }//close main method
    
} // close class DoIHaveEnoughGas