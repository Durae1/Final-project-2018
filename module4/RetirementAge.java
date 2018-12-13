/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module4;
import java.util.Scanner;
/**
 *
 * @author christopher.lewis
 */
public class RetirementAge {
    public static void main(String[]args ){
       double age;
        Scanner inputScanner = new Scanner(System.in);
        
        
        
        while(true){
            
            System.out.println("Enter ypur age to see if you can retire:");
            
            age = inputScanner.nextInt();
            
            if(age > 65.5){
                
                System.out.println("Wahoo! Grab the newspaper and martini!");
                } else { 
               
                System.out.println("Sorry, keep working...");
            }
        }
        
    }
    
}
