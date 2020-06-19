package com.twschool.practice;

public class MarsRoverPosition {
    private int x;
    private int y;
    private String direction;

    public MarsRoverPosition(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }


    public void move() {
        if (getDirection().equals("N")) {
            y++;
        }
        if (getDirection().equals("W")) {
            x--;
        }
        if (getDirection().equals("S")) {
            y--;
        }
        if (getDirection().equals("E")) {
            x++;
        }
    }

    public void turnLeft() {
        if (this.getDirection().equals("N")) {
            setDirection("W");
        }
        else if (getDirection().equals("W")) {
            setDirection("S");
        }
        else if (getDirection().equals("S")) {
            setDirection("E");
        }
        else if (getDirection().equals("E")) {
            setDirection("N");
        }
    }

    public void turnRight() {
        if (getDirection().equals("N")) {
            setDirection("E");
        }
        else if (getDirection().equals("W")) {
            setDirection("N");
        }
        else if (getDirection().equals("S")) {
            setDirection("W");
        }
        else if (getDirection().equals("E")) {
            setDirection("S");
        }
    }
}
