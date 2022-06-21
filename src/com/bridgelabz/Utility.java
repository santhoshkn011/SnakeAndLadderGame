package com.bridgelabz;
import java.util.Random;

import static com.bridgelabz.SnakeAndLadderGame.*;

public class Utility {
    //Welcome Message Method
    public static void welcomeMessage(int i, int j) {
        //welcome message
        System.out.println("Welcome to Snake and Ladder Game. \nLet's Begin.........");
        System.out.println("Player1 position: " + i);
        System.out.println("Player2 position: " + j + "\n");
    }

    //snakeLadder method: If its ladder moves up and play again. If its snake comes down and another player plays
    public static void snakeLadder(int i) {
        switch (i) {
            //Snake positions
            case 32:
                System.out.println("Oops: it's a Snake, moved down to 10.");
                if (i == playerOnePosition) {
                    playerOnePosition = 10;
                } else {
                    playerTwoPosition = 10;
                }
                break;
            case 36:
                System.out.println("Oops: it's a Snake, moved down to 6.");
                if (i == playerOnePosition) {
                    playerOnePosition = 6;
                } else {
                    playerTwoPosition = 6;
                }
                break;
            case 48:
                System.out.println("Oops: it's a Snake, moved down to 26.");
                if (i == playerOnePosition) {
                    playerOnePosition = 26;
                } else {
                    playerTwoPosition = 26;
                }
                break;
            case 62:
                System.out.println("Oops: it's a Snake, moved down to 18.");
                if (i == playerOnePosition) {
                    playerOnePosition = 18;
                } else {
                    playerTwoPosition = 18;
                }
                break;
            case 88:
                System.out.println("Oops: it's a Snake, moved down to 24.");
                if (i == playerOnePosition) {
                    playerOnePosition = 24;
                } else {
                    playerTwoPosition = 24;
                }
                break;
            case 95:
                System.out.println("Oops: it's a Snake, moved down to 56.");
                if (i == playerOnePosition) {
                    playerOnePosition = 56;
                } else {
                    playerTwoPosition = 56;
                }
                break;
            case 97:
                System.out.println("Oops: it's a Snake, moved down to 78.");
                if (i == playerOnePosition) {
                    playerOnePosition = 78;
                } else {
                    playerTwoPosition = 78;
                }
                break;
            //Ladder positions
            case 1:
                System.out.println("Hurray: it's a Ladder and roll again, moved up to 38.");
                if (i == playerOnePosition) {
                    playerOnePosition = 38;
                    play1();
                } else {
                    playerTwoPosition = 38;
                    play2();
                }
                break;
            case 4:
                System.out.println("Hurray: it's a Ladder and roll again, moved up to 14.");
                if (i == playerOnePosition) {
                    playerOnePosition = 14;
                    play1();
                } else {
                    playerTwoPosition = 14;
                    play2();
                }
                break;
            case 8:
                System.out.println("Hurray: it's a Ladder and roll again, moved up to 30.");
                if (i == playerOnePosition) {
                    playerOnePosition = 30;
                    play1();
                } else {
                    playerTwoPosition = 30;
                    play2();
                }
                break;
            case 21:
                System.out.println("Hurray: it's a Ladder and roll again, moved up to 42.");
                if (i == playerOnePosition) {
                    playerOnePosition = 42;
                    play1();
                } else {
                    playerTwoPosition = 42;
                    play2();
                }
                break;
            case 28:
                System.out.println("Hurray: it's a Ladder and roll again, moved up to 76.");
                i = 76;
                if (i == playerOnePosition) {
                    playerOnePosition = 76;
                    play1();
                } else {
                    playerTwoPosition = 76;
                    play2();
                }
                break;
            case 50:
                System.out.println("Hurray: it's a Ladder and roll again, moved up to 67.");
                if (i == playerOnePosition) {
                    playerOnePosition = 67;
                    play1();
                } else {
                    playerTwoPosition = 67;
                    play2();
                }
                break;
            case 71:
                System.out.println("Hurray: it's a Ladder and roll again, moved up to 92.");
                if (i == playerOnePosition) {
                    playerOnePosition = 92;
                    play1();
                } else {
                    playerTwoPosition = 92;
                    play2();
                }
                break;
            case 80:
                System.out.println("Hurray: it's a Ladder and roll again, moved up to 99.");
                if (i == playerOnePosition) {
                    playerOnePosition = 99;
                    play1();
                } else {
                    playerTwoPosition = 99;
                    play2();
                }
                break;
        }
    }
}

