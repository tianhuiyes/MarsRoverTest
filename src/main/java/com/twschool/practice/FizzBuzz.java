package com.twschool.practice;

public class FizzBuzz {
    String say(int number){
        String rs="";

        if(number % 3 == 0){
            rs = "fizz";
        }
        if(number % 5 == 0){
            rs += "buzz";
        }
        if(number % 7 == 0){
            rs += "whizz";
            return rs;
        }

        String num = String.valueOf(number);
        if(num.contains("3") || num.contains("7")){
            rs = "fizz";
            return rs;
        }

        if(number % 5 == 0) {
            return rs;
        }

        return String.valueOf(number);
    }

}
