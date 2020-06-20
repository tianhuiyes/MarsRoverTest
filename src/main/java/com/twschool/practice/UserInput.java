package com.twschool.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserInput {
    public String checkUserInput(String userInput) {
        String result = "correct input";
        List<String> userInputNumbers = Arrays.asList(userInput.split(" "));
        Set<String> set = new HashSet<String>(userInputNumbers);
        if(userInputNumbers.size() != 4){
            result = "Wrong Input,Input again!";
        }else if(set.size() != userInputNumbers.size()){
                result = "Wrong Input,Input again!";
        }
//        for(int i =0;i<userInputNumbers.size();i++){
//
//        }
        return result;
    }
}
