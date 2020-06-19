package com.twschool.practice;

import static com.twschool.practice.GameStatus.CONTINUE;
import static com.twschool.practice.GameStatus.SUCCEED;

public class GuessNumberGame {
    private final int MAX_GAME_CHANCE = 6;
    private Answer answer;
    private GameStatus gameStatus = GameStatus.CONTINUE;
    private int leftGameChance = MAX_GAME_CHANCE;


    public GuessNumberGame(Answer answer) {
        this.answer = answer;
    }


    public GameStatus guess(String userAnswer) {
        String result = answer.check(userAnswer);
        leftGameChance--;
        if("4A0B".equals(result)) {
            gameStatus = GameStatus.SUCCEED;
        }else if(leftGameChance == 0){
            gameStatus = GameStatus.FAILED;
        }
        return gameStatus;
    }
}
