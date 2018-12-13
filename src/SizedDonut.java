/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christopher.lewis
 */
public class SizedDonut {
    
    public String name;
    public int sizeInmm;
    
    private int percRemaining = 100;
    String flavor;
    String color;
    
    public void simulateEating(int percentEaten){
        percRemaining = percRemaining - percentEaten;
        
    }
    
    public int getPercRemaining(){
        return percRemaining;
    }
}
        
    
