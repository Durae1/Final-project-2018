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
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] japaneseCars = new String[5];
        
        //filling array
        
        japaneseCars[0]="Nissan 280z";
        japaneseCars[1]="Nissan s14 240sx";
        japaneseCars[2]="Toyota AE86";
        japaneseCars[3]="Nissan 300zx";
        japaneseCars[4]="Lexus IS300";
        
        printArrayContents(japaneseCars);
        
    }
    
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
        
        
        
        
        
        
    
}
