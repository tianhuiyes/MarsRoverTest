package com.twschool.practice;

import java.util.Scanner;

public class GuessNumberGameMain {
    public static void main(String[] args) {
        //启动游戏
        System.out.println("Welcome, Let's guess number!");

        //生成游戏答案
        Generator generator = new Generator();
        String gameAnswer = generator.getAnswer();

        //用户输入，校验输入格式，对照游戏答案，输出相应的游戏状态
        Answer answer = new Answer(gameAnswer);
        Scanner input = new Scanner(System.in);

    }
}
