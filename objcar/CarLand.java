/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objcar;

/**
 *
 * @author christopher.lewis
 */
public class CarLand {
    public static void main(String[]args ){
        
        Car hilux = new Car ();
        
        hilux.year = 1985;
        hilux.makeModel = "Toyota Hilux";
    displayCarStats(hilux);
    
    hilux.startEngine();
    hilux.accelerate(60);
    hilux.decelerate(5);
    
    displayCarStats(hilux);
    hilux.stopEngine();
    displayCarStats(hilux);
    
    }
    public static void displayCarStats(Car anyCarObject){
        System.out.println("**** STATS ****");
        System.out.println(anyCarObject.year + " " + anyCarObject.makeModel);
        System.out.println("Engine running?" + anyCarObject.checkEngineStatus());
        System.out.println("CurrentSpeed" + anyCarObject.getCurrentSpeed());
        System.out.println("***************");
        
    }
    
    
    
}
