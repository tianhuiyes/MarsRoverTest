package com.twschool.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Answer {

    private List<String> gameAnswerNumbers;

    public Answer(String gameAnswerString) {
        List<String> gameAnswerNumbers = Arrays.asList(gameAnswerString.split(" "));
        this.gameAnswerNumbers = gameAnswerNumbers;
    }

    public String check(String userAnswerString) {
        List<String> userAnswerNumbers = Arrays.asList(userAnswerString.split(" "));
        int numberAndPositionCorrect = 0;
        int numberCorrectAndPositionIncorrect = 0;
        for(int i = 0;i<userAnswerNumbers.size();i++){
            if(gameAnswerNumbers.get(i).equals(userAnswerNumbers.get(i))){
                numberAndPositionCorrect++;
            }else if(gameAnswerNumbers.contains(userAnswerNumbers.get(i))){
                numberCorrectAndPositionIncorrect++;
            }
        }
        return numberAndPositionCorrect+"A"+numberCorrectAndPositionIncorrect+"B";
    }
}
