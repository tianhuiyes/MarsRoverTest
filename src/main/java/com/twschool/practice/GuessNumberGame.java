package com.twschool.practice;

import static com.twschool.practice.GameStatus.CONTINUE;
import static com.twschool.practice.GameStatus.SUCCEED;

public class GuessNumberGame {
    private Answer answer;
    private GameStatus gameStatus = CONTINUE;


    public GuessNumberGame(Answer answer) {
        this.answer = answer;
    }


    public GameStatus guess(String userAnswer) {
        String result = answer.check(userAnswer);
        if("4A0B".equals(result)) {
            return gameStatus.SUCCEED;
        }
        return gameStatus;
    }
}
