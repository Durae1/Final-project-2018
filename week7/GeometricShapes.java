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
public class GeometricShapes {
    public static void main(String[] args) {
        // call calcVolumeOfCube here
        double returnedVolume = calcVolumeOfCube(50.0);
         // print the inputs and the outputs to the console
         System.out.println("Volume of a cube: " + returnedVolume);
    }// close main method
    
    public static double calcVolumeOfCube(double sideLength){
        // implements the cube area formulas: side^3
        double cubeVolume = Math.pow(sideLength, 3);
        // raise side length to 3 and return the result
        return cubeVolume; 
        // placeholder return value
    }// close method
    
}// close class
