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
public class WhileWithScanner {
    public static void main(String[]args ){
        int numLoops = 0;
        int loopControl;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many loops shall I print?");
        loopControl = scanner.nextInt();
        
        while(numLoops <= loopControl){
            System.out.println("the value of numLoops: " + numLoops);
            numLoops = numLoops + 1;
        }
        
        System.out.println("....After the while loop");
        
        }
        
    }
    

