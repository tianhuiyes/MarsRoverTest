package com.twschool.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GuessNumber {

    public String check(int[] gameAnswer, int[] userAnswer) {
        int correctA = checkA(gameAnswer,userAnswer);
        int correctB = checkB(gameAnswer,userAnswer);
        String result = correctA + "A"+correctB+"B";
        return result;
    }

    private int checkB(int[] gameAnswer, int[] userAnswer) {
        int correctB = 0;
        for(int i = 0;i <gameAnswer.length;i++){
            for(int j = 0; j < userAnswer.length; j++){
                if(gameAnswer[i] == userAnswer[j] && i!= j){
                    correctB++;
                }
            }
        }
        return correctB;
    }

    private int checkA(int[] gameAnswer, int[] userAnswer) {
        int correctA = 0;
        Arrays.sort(gameAnswer);
        Arrays.sort(userAnswer);
        for(int i = 0;i< gameAnswer.length;i++){
            if(gameAnswer[i] == userAnswer[i]){
                correctA++;
            }
        }

        return correctA;
    }
}
