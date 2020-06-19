package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTest {

    @Test
    public void should_return_4A0B_given_gameAnswer_1234_and_userAnswer_1234() {
        //given
        int[] gameAnswer = new int[]{1,2,3,4};
        int[] userAnswer = new int[]{1,2,3,4};
        GuessNumber guessNumber = new GuessNumber();

        //when
        String result = guessNumber.check(gameAnswer,userAnswer);

        //then
        Assert.assertEquals("4A0B",result);

    }
}
