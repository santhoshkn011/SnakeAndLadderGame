/*
The Player then checks for a Option. They are No Play, Ladder or Snake. - Use ((RANDOM)) to check for Options
*/
package com.bridgelabz;
import java.util.Random; //importing Random function

public class SnakeAndLadderGame {
    public static int playerOnePosition = 0;//Initial player1 position.
    public static final int winPosition = 100; //win position is at 100
    public static void main(String args[]) {
        //welcome message
        System.out.println("Welcome to Snake and Ladder Game. \nLet's Begin.........");
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
        if(dieRolled ==6 ) {
            System.out.println("Hurray! Player1 enters.\n");
            //Rolling the die till player1 reaches 100 or win.
            while(playerOnePosition<=winPosition){
                //Rolling the die after player enters into the game.
                dieRolled = random.nextInt(6) + 1;
                System.out.println("Die rolled: " + dieRolled);
                playerOnePosition = playerOnePosition + dieRolled; //Player1 moving with the die number.
                if(playerOnePosition>100){
                    //After rolling the die, if it exceeds 100. Stays in same position and continuing the loop.
                    playerOnePosition = playerOnePosition - dieRolled; //same position
                    System.out.println("Oops! Roll again. Player1 position: " + playerOnePosition + "\n");
                    continue;
                }
                else if(playerOnePosition == 100) {
                    //Winning the game.
                    System.out.println("Player1 position: " + playerOnePosition);
                    System.out.println("Congratulations! Player1 Won the game......");
                    break;
                }
                System.out.println("Player1 position: " + playerOnePosition);
                switch(playerOnePosition) {
                    //Snake positions
                    case 32:
                        System.out.println("Oops: it's a Snake, moved down to 10.");
                        playerOnePosition = 10;
                        break;
                    case 36:
                        System.out.println("Oops: it's a Snake, moved down to 6.");
                        playerOnePosition = 6;
                        break;
                    case 48:
                        System.out.println("Oops: it's a Snake, moved down to 26.");
                        playerOnePosition = 26;
                        break;
                    case 62:
                        System.out.println("Oops: it's a Snake, moved down to 18.");
                        playerOnePosition = 18;
                        break;
                    case 88:
                        System.out.println("Oops: it's a Snake, moved down to 24.");
                        playerOnePosition = 24;
                        break;
                    case 95:
                        System.out.println("Oops: it's a Snake, moved down to 56.");
                        playerOnePosition = 56;
                        break;
                    case 97:
                        System.out.println("Oops: it's a Snake, moved down to 78.");
                        playerOnePosition = 78;
                        break;
                    //Ladder positions
                    case 1:
                        System.out.println("Hurray: it's a Ladder, moved up to 38.");
                        playerOnePosition = 38;
                        break;
                    case 4:
                        System.out.println("Hurray: it's a Ladder, moved up to 14.");
                        playerOnePosition = 14;
                        break;
                    case 8:
                        System.out.println("Hurray: it's a Ladder, moved up to 30.");
                        playerOnePosition = 30;
                        break;
                    case 21:
                        System.out.println("Hurray: it's a Ladder, moved up to 42.");
                        playerOnePosition = 42;
                        break;
                    case 28:
                        System.out.println("Hurray: it's a Ladder, moved up to 76.");
                        playerOnePosition = 76;
                        break;
                    case 50:
                        System.out.println("Hurray: it's a Ladder, moved up to 67.");
                        playerOnePosition = 67;
                        break;
                    case 71:
                        System.out.println("Hurray: it's a Ladder, moved up to 92.");
                        playerOnePosition = 92;
                        break;
                    case 80:
                        System.out.println("Hurray: it's a Ladder, moved up to 99.");
                        playerOnePosition = 99;
                        break;
                }
                System.out.println();
            }
        }
        else {
            System.out.println("No Play: Better luck next time to roll 6.");
            playerOnePosition = 0;
            System.out.println("Player1 position: " + playerOnePosition);
        }
    }
}
