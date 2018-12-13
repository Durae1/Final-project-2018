/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author christopher.lewis
 */
public class Japancars {
    public static void printArrayContents(String[] arrayInsideMethod){
        System.out.println("********** Extract array value and store it **********");
        
        String extractedArrayValue = arrayInsideMethod[0];
        System.out.println("Car at array at index 0: " + extractedArrayValue );
        
        extractedArrayValue = arrayInsideMethod[1];
        System.out.println("Car at array at index 1: " + extractedArrayValue );
        
        extractedArrayValue = arrayInsideMethod[2];
        System.out.println("Car at array at index 2: " + extractedArrayValue );
        
        extractedArrayValue = arrayInsideMethod[3];
        System.out.println("Car at array at index 3: " + extractedArrayValue );
        
        extractedArrayValue = arrayInsideMethod[3];
        System.out.println("Car at array at index 4: " + extractedArrayValue );
}
