/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christopher.lewis
 */
public class Burger {
        public int percRemaining = 100;
    public boolean containsCheese;
    public String name;
    
    public void simulateEating(int percentEaten){
        System.out.println("Inside simulateEating method");
        percRemaining = percRemaining - percentEaten;
    
    
    } // close method
    
      public int getPercRemaining(){
        System.out.println("Inside getPercRemaining method");
        return percRemaining;
    // method: takes no input parameters and returns percRemaining
    
     
    } // close method
}
