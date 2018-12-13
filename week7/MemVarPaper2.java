/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author christopher.lewis
 */
public class MemVarPaper2 {
    private static int bravo = 2;
    private static boolean charlie = false;
    public static void testValue (){
        if(charlie) {
            bravo = bravo + 10;
            System.out.println("If block");
        } else {
            bravo = bravo - 10;
            System.out.println("Else block");
        }// close if/else 
    }//close testValue
    
    public static void main(String[]args ) {
        int lima = 3;
        bravo = bravo * lima;
        charlie = !charlie;
        System.out.println("Bravo: " + bravo);
        System.out.println("Charlie: " + charlie);
        testValue();
        System.out.println("Bravo: " + bravo);
        System.out.println("Charlie: " + charlie);
        
        
        
            
        }
    }
    

