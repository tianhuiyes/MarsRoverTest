package com.twschool.practice;

import java.util.Scanner;

public class GuessNumberGameMain {
    public static void main(String[] args) {
        //启动游戏
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, Let's guess number!");

        //生成游戏答案
        Generator generator = new Generator();
        String gameAnswer = generator.getAnswer();

        //用户输入，校验输入格式，对照游戏答案，输出相应的游戏状态
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
    }
}
