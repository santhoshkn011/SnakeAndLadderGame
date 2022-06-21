/*
Play the game with 2 Player.
In this case if a Player gets a Ladder
then plays again. Finally report which player won the game.
*/
package com.bridgelabz;
import java.util.Random; //importing Random function
import static com.bridgelabz.Utility.snakeLadder; //importing snakeLadder method from Utility function

public class SnakeAndLadderGame {
    //Declaring variables
    public static int playerOnePosition = 0, playerTwoPosition = 0, playerOneNoOfTimesRolled = 0, playerTwoNoOfTimesRolled = 0, dieRolled1, dieRolled2;
//Player1 method
    public static void play1() {
        Random random = new Random();
        dieRolled1 = random.nextInt(6) + 1; //Rolling die and getting random number from 1 to 6.
        playerOnePosition = playerOnePosition + dieRolled1; //Player1 position after rolling the die
        System.out.println("Die Rolled: " + dieRolled1);
        System.out.println("Player position: " + playerOnePosition);
        snakeLadder(playerOnePosition); //imported from Utility class
        playerOneNoOfTimesRolled++; //Counting number of times rolled.
    }
    public static void play2() {
        Random random = new Random();
        dieRolled2 = random.nextInt(6) + 1;
        playerTwoPosition = playerTwoPosition + dieRolled2;
        System.out.println("Die Rolled: " + dieRolled2);
        System.out.println("Player position: " + playerTwoPosition);
        Utility.snakeLadder(playerTwoPosition); //imported from Utility class
        playerTwoNoOfTimesRolled++;
    }
    //Main method starts.......
    public static void main(String args[]) {
        Utility.welcomeMessage(0, 0); //Welcome Message importing from Utility class.
        //Game play begins
        while (playerOnePosition <= 100 && playerTwoPosition <= 100) {
            //Player1 rolls
            System.out.println("\nPlayer1 rolls the die: ");
            play1(); //Calling play1 method
            if(playerOnePosition>100){
                //After rolling the die, if it exceeds 100. Stays in same position and continuing the loop.
                playerOnePosition = playerOnePosition - dieRolled1; //same position
                System.out.println("Just missed! Need to roll again. Player1 position: " + playerOnePosition + "\n");
            }
            else if(playerOnePosition == 100) {
                //Winning the game.
                System.out.println("\nPlayer1 position: " + playerOnePosition);
                System.out.println("Congratulations! Player1 Won the game :)");
                break;
            }
            //player2 rolls
            System.out.println("\nPlayer2 rolls the die: ");
            play2(); //calling play2 method.
            if(playerTwoPosition>100){
                //After rolling the die, if it exceeds 100. Stays in same position and continuing the loop.
                playerTwoPosition = playerTwoPosition - dieRolled2; //same position
                System.out.println("Just missed! Need to roll again. Player2 position: " + playerTwoPosition + "\n");
            }
            else if(playerTwoPosition == 100) {
                //Winning the game.
                System.out.println("\nPlayer2 position: " + playerTwoPosition);
                System.out.println("Congratulations! Player2 Won the game :)");
                break;
            }
        }
        //Printing number of times rolled.
        System.out.println("\nPlayer1 rolled: " + playerOneNoOfTimesRolled + " times.");
        System.out.println("Player2 rolled: " + playerTwoNoOfTimesRolled + " times.\n");
    }
}