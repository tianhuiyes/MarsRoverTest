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
        int x = marsRoverPosition.getX();
        int y = marsRoverPosition.getY();
        String dir = marsRoverPosition.getDirection();
            if (comments.equals("M")) {
                if (dir.equals("N")) {
                    marsRoverPosition.setY(y + 1);
                }
                if (dir.equals("W")) {
                    marsRoverPosition.setX(x - 1);
                }
                if (dir.equals("S")) {
                    marsRoverPosition.setY(y - 1);
                }
                if (dir.equals("E")) {
                    marsRoverPosition.setX(x + 1);
                }
            }

            if (comments.equals("L")) {
                if (dir.equals("N")) {
                    marsRoverPosition.setDirection("W");
                }
                if (dir.equals("W")) {
                    marsRoverPosition.setDirection("S");
                }
                if (dir.equals("S")) {
                    marsRoverPosition.setDirection("E");
                }
                if (dir.equals("E")) {
                    marsRoverPosition.setDirection("N");
                }
            }
            if (comments.equals("R")) {
                if (dir.equals("N")) {
                    marsRoverPosition.setDirection("E");
                }
                if (dir.equals("W")) {
                    marsRoverPosition.setDirection("N");
                }
                if (dir.equals("S")) {
                    marsRoverPosition.setDirection("W");
                }
                if (dir.equals("E")) {
                    marsRoverPosition.setDirection("S");
                }
            }

        return marsRoverPosition;
    }

    public MarsRoverPosition receive1(String comments) {
        int x = marsRoverPosition.getX();
        int y = marsRoverPosition.getY();
        String dir = marsRoverPosition.getDirection();
        List<Character> commandList = Arrays.asList(ArrayUtils.toObject(comments.toCharArray()));
        for(Character singleCommand : commandList) {
            String com = singleCommand.toString();

            if (com.equals("M")) {
                if (dir.equals("N")) {
                    y++;
                }
                if (dir.equals("W")) {
                    x--;
                }
                if (dir.equals("S")) {
                    y--;
                }
                if (dir.equals("E")) {
                    x++;
                }
            }

            if (com.equals("L")) {
                if (dir.equals("N")) {
                    dir = "W";
                }
                if (dir.equals("W")) {
                    dir = "S";
                }
                if (dir.equals("S")) {
                    dir = "E";
                }
                if (dir.equals("E")) {
                    dir = "N";
                }
            }
            if (com.equals("R")) {
                if (dir.equals("N")) {
                    dir = "E";
                }
                if (dir.equals("W")) {
                    dir = "N";
                }
                if (dir.equals("S")) {
                    dir = "W";
                }
                if (dir.equals("E")) {
                    dir = "S";
                }
            }
        }
        marsRoverPosition.setY(y);
        marsRoverPosition.setX(x);
        marsRoverPosition.setDirection(dir);
        return marsRoverPosition;
    }
}
