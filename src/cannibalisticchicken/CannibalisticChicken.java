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
        String name,restart,question1,question2,question3,question4;
        
        int restartGame = 0;
        int i = 0;
        int question = 0;
        
        //Creating the story
        //Intro
        while (i == 0){
            if (restartGame == 0){
                //Making sure game wont randomly restart
                restartGame = 5;
                question = 0;
                
                if (question == 0){
                    System.out.println("Welcome adventurer. What is your name?");
                    name = keyedInput.nextLine();//Creating the username string
                    System.out.println("Welcome " + name + ". I am the story teller.");
                    System.out.println("To give you some context, you are a chicken.\n"
                            + "To be spesific you are an adventuring chicken.");
                    question = 1;
                }
                if (question == 1){ 
                    while (question == 1){
                    question = -1;
                    //First Obsitcal
                    System.out.println("You are currently in the town of Canibal.\n"
                            + "Would you like to leave the town? (Enter \" Yes Or No \" )");
                    question1 = keyedInput.nextLine();
                    if (question1.equalsIgnoreCase("yes")){
                        System.out.println("As you leave the town you smell cooking chicken");

                        System.out.println("Would you like to go back into town? Enter (\"Yes or No\")");
                        question2 = keyedInput.nextLine();

                        question = 2;
                        if (question == 2){
                            while (question == 2){ 
                                question = -1;
                                
                                if (question2.equalsIgnoreCase("yes")){
                                    question = 4;
                                    while (question == 4){
                                        question = -1;
                                        System.out.println("You turn back and run into town."
                                                + "You find your Friend Joes house on fire and help him");

                                        System.out.println("Should you help him move his pictures or money? "
                                                + "Enter (\"Pictures Or Money\")");
                                        question4 = keyedInput.nextLine();
                                        
                                        switch (question4){
                                            case "Pictures": case "pictures": case "PICTURES":
                                                System.out.println("You help joe by moving the pictures.\n"
                                                        + "Joe dies of his burns and hands you down his pictures.\n"
                                                        + "You are now to sad to continue adventuring.\n"
                                                        + "You get a dead end job at subway and live forever alone.\n"
                                                        + "You have finsihed adventuring forever.");
                                                question = 10;
                                                while (question == 10){
                                                    question = 11;
                                                    System.out.println("Would you like to restart? Enter (\" Yes Or No \")");
                                                    restart = keyedInput.nextLine();
                                                    //Code to restart
                                                    if (restart.equalsIgnoreCase("yes")){
                                                        restartGame = 1;
                                                    }
                                                    else if (restart.equalsIgnoreCase("no")){
                                                        restartGame = 2;
                                                    }
                                                    else {
                                                        question = 10;
                                                    }
                                                    if (restartGame == 1){
                                                        restartGame = 0;
                                                    }
                                                    else if (restartGame == 2){
                                                        i = 1;
                                                    }
                                                }
                                                break;
                                            case "Money": case "money":
                                                System.out.println("Joe is a billionare, and when he passes away \n"
                                                        + "he give you all the money. You are rich you win at life.\n"
                                                        + "Good Job.");
                                                question = 10;
                                                while (question == 10){
                                                    question = 11;
                                                    System.out.println("Would you like to restart? Enter (\" Yes Or No \")");
                                                    restart = keyedInput.nextLine();
                                                    //Code to restart
                                                    if (restart.equalsIgnoreCase("yes")){
                                                        restartGame = 1;
                                                    }
                                                    else if (restart.equalsIgnoreCase("no")){
                                                        restartGame = 2;
                                                    }
                                                    else {
                                                        question = 10;
                                                    }
                                                    if (restartGame == 1){
                                                        restartGame = 0;
                                                    }
                                                    else if (restartGame == 2){
                                                        i = 1;
                                                    }
                                                }
                                                break;
                                            default:
                                                System.out.println("Enter Pictures Or Money");
                                                question3 = keyedInput.nextLine();
                                                question = 4;
                                                break;
                                        }
                                    }
                                }
                                else if (question2.equalsIgnoreCase("no")){
                                    question = 3;
                                    while (question == 3){
                                        question = -1;
                                        System.out.println("You continue onto the next town.");

                                        System.out.println("On your way to the next town you reach "
                                                + "a fork in the road. Do you go left or right "
                                                + "Enter (\"Left or Right\")");
                                        question3 = keyedInput.nextLine();
                                        
                                        switch (question3){
                                            case "Left": case "left": case "LEFT":
                                                System.out.println("You have found a pot of gold "
                                                        + "you became very rich.\n"
                                                        + "You buy a nice house a settle down.\n"
                                                        + "Your adventuring days are over.");
                                                question = 10;
                                                while (question == 10){
                                                    question = 11;
                                                    System.out.println("Would you like to restart? Enter (\" Yes Or No \")");
                                                    restart = keyedInput.nextLine();
                                                    //Code to restart
                                                    if (restart.equalsIgnoreCase("yes")){
                                                        restartGame = 1;
                                                    }
                                                    else if (restart.equalsIgnoreCase("no")){
                                                        restartGame = 2;
                                                    }
                                                    else {
                                                        question = 10;
                                                    }
                                                    if (restartGame == 1){
                                                        restartGame = 0;
                                                    }
                                                    else if (restartGame == 2){
                                                        i = 1;
                                                    }
                                                }
                                                break;
                                            case "Right": case "right": case "RIGHT":
                                                System.out.println("You go right and fall off a clif.\n"
                                                        + "Watch your step. You have died.");
                                                question = 10;
                                                question = 10;
                                                while (question == 10){
                                                    question = 11;
                                                    System.out.println("Would you like to restart? Enter (\" Yes Or No \")");
                                                    restart = keyedInput.nextLine();
                                                    //Code to restart
                                                    if (restart.equalsIgnoreCase("yes")){
                                                        restartGame = 1;
                                                    }
                                                    else if (restart.equalsIgnoreCase("no")){
                                                        restartGame = 2;
                                                    }
                                                    else {
                                                        question = 10;
                                                    }
                                                    if (restartGame == 1){
                                                        restartGame = 0;
                                                    }
                                                    else if (restartGame == 2){
                                                        i = 1;
                                                    }
                                                }
                                                break;
                                            default:
                                                System.out.println("Enter Left Or Right");
                                                question3 = keyedInput.nextLine();
                                                question = 3;
                                                break;
                                        }
                                    }
                                }
                                else {
                                    System.out.println("Enter Yes or No");
                                    question2 = keyedInput.nextLine();
                                    question = 2; 
                                }
                            }
                        }
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
                    else {
                        System.out.println("Enter Yes or no");
                        question1 = keyedInput.nextLine();
                        question = 1;
                    }
                }
                }
                
                
                
                

            }
        
        }
    }
    
    
}
