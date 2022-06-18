/*
The Player rolls the die to get a number(1 to 6).
*/
package com.bridgelabz;
import java.util.Random; //importing Random function

public class SnakeAndLadderGame {
    public static void main(String args[]) {
        System.out.println("Welcome to Snake and Ladder Game. \nLet's Begin.........");
        //declaring variables
        int playerOnePosition = 0;
        //Player1 position and die rolled.
        System.out.println("Player1 position: " + playerOnePosition + "\n");
        System.out.println("Player1 rolls the die.");
        Random random = new Random();
        int dieRolled = random.nextInt(6) + 1;
        System.out.println("Die rolled: " + dieRolled);
    }
}
