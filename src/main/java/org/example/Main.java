package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //In this dice game, the player will roll two dice and bet whether the next roll will
        // result in a higher, lower or equal total than the current one. The game will have five rounds,
        // and the player's goal is to make correct predictions and accumulate points.
        //If the player's prediction is correct, they earn 10 points.
        //If the player's prediction is that the next roll is equal with the previous one, and is correct, they earn 30 points.
        //If the player's prediction is incorrect, they lose 5 points.

        Scanner scanner = new Scanner(System.in);
        int points = 10;
        System.out.println("Do you wish to play? y/n");
        String play = scanner.nextLine();
        if (play.equalsIgnoreCase("y")) {
            System.out.println("The game begins");
            System.out.println("Your default starting points are: " + points);
            System.out.println("FIRST ROUND");
            System.out.println("Press ENTER to roll the dices");
            scanner.nextLine();
            Random random = new Random();
            int dice1 = random.nextInt(6);
            int dice2 = random.nextInt(6);
            System.out.println("The first dice rolled: " + (dice1 + 1));
            System.out.println("The second dice rolled: " + (dice2 + 1));
            int result1 = (dice1 + 1) + (dice2 + 1);
            System.out.println("The score of ROUND 1 is: " + result1);

            for (int i = 2; i < 6; i++) {
                System.out.println("The next roll will result in a higher, lower or equal score? h/l/e");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("h")) {
                    System.out.println("Your prediction has been set to Higher");
                    System.out.println("ROUND " + i + " begins.\nPress ENTER to roll the dices");
                    scanner.nextLine();
                    int dice3 = random.nextInt(6);
                    int dice4 = random.nextInt(6);
                    System.out.println("The first dice rolled: " + (dice3 + 1));
                    System.out.println("The second dice rolled: " + (dice4 + 1));
                    int result2 = (dice3 + 1) + (dice4 + 1);
                    System.out.println("The score of ROUND " + i + " is: " + result2);
                    if (result1 > result2) {
                        points = points - 5;
                        System.out.println("Your prediction was wrong. You lose 5 points. You have now " + points + " points.");
                    } else if (result1 < result2) {
                        points = points + 10;
                        System.out.println("Your prediction was right. You win 10 points. You have now " + points + " points.");
                    } else {
                        points = points - 5;
                        System.out.println("Your prediction was wrong. You lose 5 points. You have now " + points + " points.");
                    }
                    result1 = result2;
                } else if (input.equalsIgnoreCase("l")) {
                    System.out.println("Your prediction has been set to Lower");
                    System.out.println("ROUND " + i + " begins. Press ENTER to roll the dices");
                    scanner.nextLine();
                    int dice3 = random.nextInt(6);
                    int dice4 = random.nextInt(6);
                    System.out.println("The first dice rolled: " + (dice3 + 1));
                    System.out.println("The second dice rolled: " + (dice4 + 1));
                    int result2 = (dice3 + 1) + (dice4 + 1);
                    System.out.println("The score of ROUND " + i + " is: " + result2);
                    if (result1 > result2) {
                        points = points + 10;
                        System.out.println("Your prediction was right. You win 10 points. You have now " + points + " points.");
                    } else if (result1 < result2) {
                        points = points - 5;
                        System.out.println("Your prediction was wrong. You lose 5 points. You have now " + points + " points.");
                    } else {
                        points = points - 5;
                        System.out.println("Your prediction was wrong. You lose 5 points. You have now " + points + " points.");
                    }
                    result1 = result2;
                } else if (input.equalsIgnoreCase("e")) {
                    System.out.println("Your prediction has been set to Equals");
                    System.out.println("ROUND " + i + " begins. Press ENTER to roll the dices");
                    scanner.nextLine();
                    int dice3 = random.nextInt(6);
                    int dice4 = random.nextInt(6);
                    System.out.println("The first dice rolled: " + (dice3 + 1));
                    System.out.println("The second dice rolled: " + (dice4 + 1));
                    int result2 = (dice3 + 1) + (dice4 + 1);
                    System.out.println("The score of ROUND " + i + " is: " + result2);
                    if (result1 == result2) {
                        points = points + 30;
                        System.out.println("Your prediction was right. You win 30 points. You have now " + points + " points.");
                    } else if (result1 > result2 || result1 < result2) {
                        points = points - 5;
                        System.out.println("Your prediction was wrong. You lose 5 points. You have now " + points + " points.");
                    }
                    result1 = result2;
                } else {
                    System.out.println("Invalid input.\nGame over");
                    break;
                }
            }
            System.out.println();
            System.out.println("You accumulated " + points + " points");
            if (points >= 40) {
                System.out.println("Congratulations! You aced the game. You are a true winner!");
            } else if (points >= 30) {
                System.out.println("Great job! Your predictions were spot on. Well done!");
            } else if (points >= 20) {
                System.out.println("Well played, but you can do better");
            } else if (points >= 10) {
                System.out.println("Not bad! You managed to score some points, keep trying.");
            } else {
                System.out.println("Better luck next time! You were a bit unlucky this time.");
            }

        } else if (play.equalsIgnoreCase("n")) {
            System.out.println("Game over");
        } else {
            System.out.println("Invalid input.\nGame over");
        }

    }
}