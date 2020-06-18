package com.twschool.practice;

public class MarsRover {

    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }


    public MarsRoverPosition getMarsRoverPosition() {
        return marsRoverPosition;
    }

    public MarsRoverPosition receive(String[] comments) {
        int x = marsRoverPosition.getX();
        int y = marsRoverPosition.getY();
        String dir = marsRoverPosition.getDirection();
        for(String com:comments) {

            if (com.equals("M")) {
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

            if (com.equals("L")) {
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
            if (com.equals("R")) {
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
        }
        return marsRoverPosition;
    }
}
