/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffinal;

/**
 *
 * @author christopher.lewis
 */
public class Nissan {

    public int passengers;
    //amount of passengerts tis vehicle can hold
    public int horsePower;
    //amount of stock horsepower
    public double fuelCapacity;
    //max fuel level
    public double milesPerGallon;
    //the mpg of the vehicle
    public int maxSpeed;
    //the max speed of the vehicle
    public String engine;
    //the motor in the vehicle

// declares an array of integers
    double[] anArray;

    
public void loadArray(){
        anArray = new double[5];
        //allocates memory for 5 doubles
        anArray[0] = 6.5;
        //first array double
        anArray[1] = 7.5;
        //second array double
        anArray[2] = 7.2;
        //third array double
        anArray[3] = 6.8;
        //fourth array double
        anArray[4] = 6.6;
        //fifth array double
}
 

public void printArray(){
        System.out.println("Zero to Sixty time: "
                + anArray[0]);
        System.out.println("Zero to Sixty time: "
                + anArray[1]);
        System.out.println("Zero to Sixty time: "
                + anArray[2]);
        System.out.println("Zero to Sixty time: "
                + anArray[3]);
        System.out.println("Zero to Sixty time: "
                + anArray[4]);
               
}

public double averageArray(){

       //calculate sum of all array elements
       double sum = 0;
       for(int i=0; i < anArray.length ; i++)
        sum = sum + anArray[i];
       //calculate average value
        double average = sum / anArray.length;
         
return average;
    }
}
   