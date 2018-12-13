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
public class Authentication {
    private final static String PASSWORD = "p@ssword";
    
    private  final static String SECRET =
            "The meaning of life is (100 % 2) * 9 + 1!";
    
    private final static int NUM_ATTEMPTS = 3;
    
    public static void main(String[]args ){
        System.out.println("***Authenticator revisited***");
        System.out.println("Enter the system password to learn the protected information");
        
        Scanner scanner = new Scanner (System.in);
        
        int attempts = 0;
        
        while(attempts < NUM_ATTEMPTS){
            
            String userPassword = scanner.next();
            if(userPassword.equals(PASSWORD)){
                
                System.out.println("Correct password!");
                
                System.out.println("**********");
                System.out.println("your secret is: " + SECRET);
                System.out.println("**********");
                
                System.out.println("Thank you for participating");
                
                break;
                
            } else {
                System.out.println("Incorrect password try again:");
                
                
                attempts = attempts +1;
                
                System.out.println("Number of attempts" + attempts);
                
                System.out.println("Number of attempts allowed:" + NUM_ATTEMPTS);
                
                if(attempts == NUM_ATTEMPTS){
                    
                    System.out.println("Sorry, you have tried too many"
                    + "times...exiting Java Authrnticator teller");
                    
                } else {
                    System.out.println("Please try again: ");
                    
                }
                
                
            }
            
        }
        
    
    
        
        
        
        
    }
    
}
