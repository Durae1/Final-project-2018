/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christopher.lewis
 */
public class DonutLand {

    public static void main(String[] args) {
        final int firstBiteSize = 5;

        SizedDonut firstDonut;

        firstDonut = new SizedDonut();

        firstDonut.name = "Cina";
        firstDonut.sizeInmm = 100;
        firstDonut.flavor = "Cinnamon";
        firstDonut.color = "Brown";

        System.out.println("When first created," + firstDonut.name + "'s/n"
                + "percent remaining is " + firstDonut.getPercRemaining());
        System.out.println("The flavor is " + firstDonut.flavor);

        System.out.println("The color is " + firstDonut.color);

        
        
        Creature creature = new Creature();
        creature.name = "Beary";
        creature.species = "Bear";
        creature.setBiteSizeInPercent(30);
        System.out.println("Perc remaining before eating" 
                + firstDonut.getPercRemaining());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        creature.eatDonut(firstDonut);
        displayCreatureStats(creature);
        }
        
        public static void displayCreatureStats(Creature creatureToPrint){
            System.out.println("***Displaying Creature Stats***");
            System.out.println("Name:" + creatureToPrint.name);
            System.out.println("Species: " + creatureToPrint.species);
            System.out.println("Bite Size:" + creatureToPrint.getBiteSizeInPercent()
                    + "% of a donut");
            
        
        

   
    } //close main

       }


