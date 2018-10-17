/*
 * Peter Horne-Deus
 * cannibalisticChicken.java
 * This is a choose your own adventure porgram
 * October 17,2018
 */

package cannibalisticchicken;

import java.util.Scanner;

public class CannibalisticChicken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Creating variables
        String name,restart,question1;
        
        int restartGame = 0;
        int i = 0;
        
        //Creating the story
        //Intro
        while (i == 0){
            if (restartGame == 0){
                System.out.println("Welcome adventurer. What is your name?");
                name = keyedInput.nextLine();//Creating the username string
                System.out.println("Welcome " + name + ". I am the story teller.");
                System.out.println("To give you some context, you are a chicken.\n"
                        + "To be spesific you are an adventuring chicken.");
                //First Obsitcal
                System.out.println("You are currently in the town of Canibal.\n"
                        + "Would you like to leave the town? (Enter \" Yes Or No \" )");
                question1 = keyedInput.nextLine();
//Work on next                if (question1.equalsIgnoreCase("yes")){
                    System.out.println("As you leave the town you smell cooking chicken");
                }
                else if(question1.equalsIgnoreCase("no")){
                    System.out.println("The town burnt around you and you die.\n"
                            + "would you like to restart? Enter (\" Yes Or No \")");
                    restart = keyedInput.nextLine();
                    //Code to restart
                    if (restart.equalsIgnoreCase("yes")){
                        restartGame = 1;
                    }
                    if (restart.equalsIgnoreCase("no")){
                        restartGame = 2;
                    }

                    if (restartGame == 1){
                        restartGame = 0;
                    }
                    else if (restartGame == 2){
                        i = 1;
                    }
                }
                
                
                
                
                

            }
        
        }
    }
    
    
}
