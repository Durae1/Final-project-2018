/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refractoring;

import java.util.Scanner;

/**
 *
 * @author christopher.lewis
 */
public class GreetingMachine { 
    
  public static void main(String[] args) {
    System.out.println("Please enter your name and press enter"); 
    Scanner scan = new Scanner(System.in); 
    String name = scan.next();
    System.out.println("Whoa, " + name + " What an interesting name card you have!");
    } // close class GreetingMachine
} // close class GreetingMachine
