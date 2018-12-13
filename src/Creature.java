/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christopher.lewis
 */
public class Creature {
    String name;
    String species;
    String color;
    Boolean cheerleader;
    Boolean attendYale;
    private int biteSizeInPercent;
    
    public void eatDonut(SizedDonut donutToEat){
        System.out.println("Inside Beary.eatDonut");
        donutToEat.simulateEating(100);
    }
    public int getBiteSizeInPercent() {
        return biteSizeInPercent;
    }
    public void setBiteSizeInPercent(int biteSizeInPercent){
        
        this .biteSizeInPercent = biteSizeInPercent;
    }
    
    public int doBackflips(){
        System.out.println(name + "is doing Backflips");
        
    }
    
    public int doCartwheels(){
        
        System.out.println(name + "is doing Cartwheels");
        
    }
        
}
    
    
