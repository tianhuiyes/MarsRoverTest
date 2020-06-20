package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GeneratorTest {

    @Test
    public void should_return_game_answer_when_getAnswer_given_generator() {
        //given
        Generator generator = new Generator();

        //when
        String gameAnswer = generator.getAnswer();

        //then
        Assert.assertNotNull(gameAnswer);

    }
}
