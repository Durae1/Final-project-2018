/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author christopher.lewis
 */
public class purchaseCalculator {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    public static void main(String[] args){
        //we would ordinarily declare thise constant in class scope
        //stay-tuned for next weeks module
        final double ITEM_PRICE = 100.00;
        System.out.println("Hard-coded price value: $" + ITEM_PRICE);
        
        //call method and pass in a double value as the declaration requires
        displayPriceWithTax(ITEM_PRICE);
        
    }
    
    
    
    
    public static void displayPriceWithTax(double price){
        
        final double TAX_RATE = 0.075;
        
        double totalPrice = price * (1+ TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice );
    }
    
}
