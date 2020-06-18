package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class FizzBuzzTest {

    @Test
    public void should_return_1_given_number_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(1);

        //then
        assertThat(result, is("1"));
    }

    @Test
    public void should_return_fizz_given_number_can_be_divided_by_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(3);

        //then
        assertThat(result, is("fizz"));
    }

    @Test
    public void should_return_buzz_given_number_can_be_divided_by_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(5);

        //then
        assertThat(result, is("buzz"));
    }

    @Test
    public void should_return_fizzbuzz_given_number_can_be_divided_by_3and5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(15);

        //then
        assertThat(result, is("fizzbuzz"));
    }

    @Test
    public void should_return_whizz_given_number_can_be_divided_by_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(7);

        //then
        assertThat(result, is("whizz"));
    }

    @Test
    public void should_return_fizzbuzzwhizz_given_number_can_be_divided_by_3_and_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(105);

        //then
        assertThat(result, is("fizzbuzzwhizz"));
    }

    @Test
    public void should_return_fizz_given_number_contains_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(13);

        //then
        assertThat(result, is("fizz"));
    }

    @Test
    public void should_return_fizz_given_number_contains_3_and_can_be_divided_by_3_and_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(30);

        //then
        assertThat(result, is("fizz"));
    }

    @Test
    public void should_return_buzzwhizz_given_number_can_be_divided_by_5_and_7_and_contains_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(35);

        //then
        assertThat(result, is("buzzwhizz"));
    }

    @Test
    public void should_return_fizz_given_number_contains_7_and_can_be_devided_by_3_and_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.say(75);

        //then
        assertThat(result, is("fizz"));
    }
}

