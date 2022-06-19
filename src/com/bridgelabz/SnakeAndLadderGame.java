/*
The Player then checks for a Option. They are No Play, Ladder or Snake. - Use ((RANDOM)) to check for Options
*/
package com.bridgelabz;
import java.util.Random; //importing Random function

public class SnakeAndLadderGame {
    public static void main(String args[]) {
        //welcome message
        System.out.println("Welcome to Snake and Ladder Game. \nLet's Begin.........");
        int playerOnePosition = 0; //Initial player1 position.
        System.out.println("Player1 position: " + playerOnePosition + "\n");
        //Player1 position initial = 0 and rolled die.
        System.out.println("Player1 rolls the die.");
        Random random = new Random(); //declaring random object
        int dieRolled = random.nextInt(6) + 1;
        System.out.println("Die rolled: " + dieRolled);
        /*
        Check position using Random:
        If player rolled 6, player moves and rolls a die again else will stay in same position. That is at 0.
        */
        if(dieRolled == 6) {
            System.out.println("Hurray! Player1 enters into the game.\n");
            //again player1 rolls the die.
            dieRolled = random.nextInt(6) + 1;
            System.out.println("Die rolled: " + dieRolled);
            //Using Switch and case to check for ladder or snake, else player will be at same position.
            switch(dieRolled) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Hurray: it's a Ladder.");
                    playerOnePosition = playerOnePosition + dieRolled;
                    System.out.println("Player1 position: " + playerOnePosition);
                    break;
                case 4:
                case 5:
                default :
                    System.out.println("Oops: it's a Snake, moved down to 0.");
                    playerOnePosition = 0;
                    System.out.println("Player1 position: " + playerOnePosition);
                    break;
            }
        }
        else {
            System.out.println("No Play: Better luck next time to roll 6.");
            playerOnePosition = 0;
            System.out.println("Player1 position: " + playerOnePosition);
        }
    }
}
