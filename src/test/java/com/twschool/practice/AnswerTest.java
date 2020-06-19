package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class AnswerTest {

    @Test
    public void should_return_4A0B_given_gameAnswer_1234_and_userAnswer_1234() {
        //given
        Answer answer = new Answer("1 2 3 4");

        //when
        String result = answer.check("1 2 3 4");

        //then
        Assert.assertEquals("4A0B",result);

    }
}
