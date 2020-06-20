package com.twschool.practice;

import java.util.Scanner;

public class GuessNumberGameMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, Let's guess number!");

        Generator generator = new Generator();
        String gameAnswer = generator.getAnswer();

        Answer answer = new Answer(gameAnswer);
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        int chance = 1;
        while (true) {
            String userAnswer = scan.nextLine();
            GameStatus gameStatus = guessNumberGame.guess(userAnswer);
            if (gameStatus == GameStatus.SUCCEED) {
                System.out.println("win, all correct!");
                break;
            } else if (gameStatus == GameStatus.FAILED) {
                System.out.println("Game Over!");
            }

            chance++;
            if (chance == 7) {
                break;
            }
        }

        scan.close();
    }
}
