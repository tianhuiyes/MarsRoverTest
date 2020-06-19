package com.twschool.practice;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class MarsRover {

    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }


    public MarsRoverPosition getMarsRoverPosition() {
        return marsRoverPosition;
    }


    public MarsRoverPosition receive(String comments) {
        List<Character> commandList = Arrays.asList(ArrayUtils.toObject(comments.toCharArray()));
        for(Character singleCommand : commandList) {
            String com = singleCommand.toString();

            if (com.equals("M")) {
                marsRoverPosition.move();
            }

            if (com.equals("L")) {
                marsRoverPosition.turnLeft();
            }
            if (com.equals("R")) {
                marsRoverPosition.turnRight();
            }
        }

        return marsRoverPosition;
    }



}
