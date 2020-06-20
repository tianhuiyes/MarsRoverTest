package com.twschool.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        String checkInput = checkUserInput(userAnswer);
        if ("Wrong Input,Input again!".equals(checkInput)) {
            System.out.println(checkInput);
            leftGameChance--;
            gameStatus = GameStatus.CONTINUE;
            return gameStatus;
        }else {
            String result = answer.check(userAnswer);
            leftGameChance--;
            modifyStatus(result);
            return gameStatus;
        }
    }

    public String checkUserInput(String userInput) {
        String result = "correct input";
        List<String> userInputNumbers = Arrays.asList(userInput.split(" "));
        Set<String> set = new HashSet<String>(userInputNumbers);
        if(userInputNumbers.size() != 4){
            result = "Wrong Input,Input again!";
        }else if(set.size() != userInputNumbers.size()){
            result = "Wrong Input,Input again!";
        }
        return result;
    }

    public void modifyStatus(String result) {
        if("4A0B".equals(result)) {
            gameStatus = GameStatus.SUCCEED;
        }else if(leftGameChance == 0){
            gameStatus = GameStatus.FAILED;
        }
        System.out.println(result);
    }
}
