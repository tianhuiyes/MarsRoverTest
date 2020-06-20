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

    @Test
    public void should_return_CONTINUE_given_gameAnswer_1234_and_userAnswer_1256() {
        //given
        Answer answer = new Answer("1 2 3 4 ");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        GameStatus gameStatus =guessNumberGame.guess("1 2 5 6");
        gameStatus =guessNumberGame.guess("1 2 5 6");

        //then
        Assert.assertEquals(GameStatus.CONTINUE,gameStatus);
    }

    @Test
    public void should_return_FAILED_given_gameAnswer_1234_and_userAnswer_1256_and_game_chance_6() {
        //given
        Answer answer = new Answer("1 2 3 4 ");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        GameStatus gameStatus =guessNumberGame.guess("1 2 5 6");
        gameStatus =guessNumberGame.guess("1 2 5 6");
        gameStatus =guessNumberGame.guess("1 2 5 6");
        gameStatus =guessNumberGame.guess("1 2 5 6");
        gameStatus =guessNumberGame.guess("1 2 5 6");
        gameStatus =guessNumberGame.guess("1 2 5 6");

        //then
        Assert.assertEquals(GameStatus.FAILED,gameStatus);
    }

    @Test
    public void should_return_correct_input_when_checkUserInput_given_userAnswer_1234() {
        //given
        UserInput userInput = new UserInput();

        //when
        String result = userInput.checkUserInput("1 2 3 4");

        //then
        Assert.assertEquals("correct input",result);
    }

    @Test
    public void should_return_incorrect_input_when_checkUserInput_given_userAnswer_length_is_not_4() {
        //given
        UserInput userInput = new UserInput();

        //when
        String result = userInput.checkUserInput("1 2");

        //then
        Assert.assertEquals("Wrong Input,Input again!",result);
    }

    @Test
    public void should_return_incorrect_input_when_checkUserInput_given_userAnswer_have_repeat_number() {
        //given
        UserInput userInput = new UserInput();

        //when
        String result = userInput.checkUserInput("1 1 2 4");

        //then
        Assert.assertEquals("Wrong Input,Input again!",result);
    }



}
