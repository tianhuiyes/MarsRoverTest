package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static com.twschool.practice.Direction.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class MarsRoverTest {

    @Test
    public void should_return_00W_given_00N_and_command_L() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,N);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "L";


        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(0,marsRoverPosition.getX());
        Assert.assertEquals(0,marsRoverPosition.getY());
        Assert.assertEquals(W,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_01N_given_00N_and_command_M() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,N);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "M";


        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(0,marsRoverPosition.getX());
        Assert.assertEquals(1,marsRoverPosition.getY());
        Assert.assertEquals(N,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_00E_given_00N_and_command_R() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,N);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "R";


        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(0,marsRoverPosition.getX());
        Assert.assertEquals(0,marsRoverPosition.getY());
        Assert.assertEquals(E,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_fu10W_given_00W_and_command_M() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,W);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "M";

        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(-1,marsRoverPosition.getX());
        Assert.assertEquals(0,marsRoverPosition.getY());
        Assert.assertEquals(W,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_00S_given_00W_and_command_L() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,W);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "L";

        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(0,marsRoverPosition.getX());
        Assert.assertEquals(0,marsRoverPosition.getY());
        Assert.assertEquals(S,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_00N_given_00W_and_command_R() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,W);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "R";

        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(0,marsRoverPosition.getX());
        Assert.assertEquals(0,marsRoverPosition.getY());
        Assert.assertEquals(N,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_0fu1S_given_00S_and_command_M() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,S);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "M";

        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(0,marsRoverPosition.getX());
        Assert.assertEquals(-1,marsRoverPosition.getY());
        Assert.assertEquals(S,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_00E_given_00S_and_command_L() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,S);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "L";

        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(0,marsRoverPosition.getX());
        Assert.assertEquals(0,marsRoverPosition.getY());
        Assert.assertEquals(E,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_00W_given_00S_and_command_R() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,S);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "R";

        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(0,marsRoverPosition.getX());
        Assert.assertEquals(0,marsRoverPosition.getY());
        Assert.assertEquals(W,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_10E_given_00E_and_command_M() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,E);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "M";

        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(1,marsRoverPosition.getX());
        Assert.assertEquals(0,marsRoverPosition.getY());
        Assert.assertEquals(E,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_00N_given_00E_and_command_L() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,E);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "L";

        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(0,marsRoverPosition.getX());
        Assert.assertEquals(0,marsRoverPosition.getY());
        Assert.assertEquals(N,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_00S_given_00E_and_command_R() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,E);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "R";

        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(0,marsRoverPosition.getX());
        Assert.assertEquals(0,marsRoverPosition.getY());
        Assert.assertEquals(S,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_04N_given_00N_and_command_MMMM() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,N);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "MMMM";

        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(0,marsRoverPosition.getX());
        Assert.assertEquals(4,marsRoverPosition.getY());
        Assert.assertEquals(N,marsRoverPosition.getDirection());
    }

    @Test
    public void should_return_fu11N_given_00N_and_command_MLMR() {
        //given
        MarsRoverPosition initPosition = new MarsRoverPosition(0,0,N);
        MarsRover marsRover = new MarsRover(initPosition);
        String comments = "MLMR";

        //when
        MarsRoverPosition marsRoverPosition = marsRover.receive(comments);

        //then
        Assert.assertEquals(-1,marsRoverPosition.getX());
        Assert.assertEquals(1,marsRoverPosition.getY());
        Assert.assertEquals(N,marsRoverPosition.getDirection());
    }

}

