package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberGameTest {

    @Test
    public void should_return_SUCCEED_given_gameAnswer_1234_and_userAnswer_1234() {
        //given
        Answer answer = new Answer("1 2 3 4 ");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        GameStatus gameStatus =guessNumberGame.guess("1 2 3 4");

        //then
        Assert.assertEquals(GameStatus.SUCCEED,gameStatus);
    }
}
