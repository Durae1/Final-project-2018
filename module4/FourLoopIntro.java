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
public class FourLoopIntro {
    public static void main(String[]args ){
        int loopControl;
        
        Scanner userScanner = new Scanner(System.in);
        
        System.out.println("How many loops shall i print with for()?");
        
        loopControl = userScanner.nextInt();
        
        for(int numLoops = 0; numLoops <= loopControl; numLoops = numLoops + 1){
            System.out.println("the value  of numLoops: " + numLoops);
            
        }
    }
    
}
