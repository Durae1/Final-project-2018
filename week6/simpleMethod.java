/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author christopher.lewis
 */
public class simpleMethod {
    public static String classScope = "All methods can see me";
    
    public static void generateBigNumber() {
        
        Random r = new Random();
        
        BigInteger bigInt = new BigInteger(1100000, r);
        00
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             System.out.println(bigInt);
        
    
}

    
    public static void main(String[] args) {
        String methodScope = "im only visible inside main";
                System.out.println(methodScope);
        System.out.println("This code is inside method: main");
        // call the method pritStatement, transferring execution to that block
        printStatement();
        generateBigNumber();
        System.out.println(methodScope);
      

    }//end main
        
    public static void printStatement() {
        System.out.println("Where theres a will theres a way!");
        System.out.println(classScope);
    }// end print statement
       
 
    
}// close class
