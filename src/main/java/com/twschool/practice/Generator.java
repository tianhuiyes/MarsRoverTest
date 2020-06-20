package com.twschool.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generator {

    public String getAnswer() {
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        while (list.size() < 4){
            int num = random.nextInt(10);
            if(!list.contains(num)){
                list.add(num);
            }
        }
        String gameAnswer = "";
        for(int i = 0 ;i<list.size();i++){
            gameAnswer += list.get(i)+" ";
        }
        System.out.println("gameAnswer:"+gameAnswer);
        return gameAnswer;
    }

}
