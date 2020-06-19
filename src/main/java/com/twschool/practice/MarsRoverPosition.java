package com.twschool.practice;

import static com.twschool.practice.Direction.*;

public class MarsRoverPosition {
    private int x;
    private int y;
    private Direction direction;

    public MarsRoverPosition(int x, int y, Direction direction) {
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

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {
        if (direction.equals(N)) {
            y++;
        }
        if (direction.equals(W)) {
            x--;
        }
        if (direction.equals(S)) {
            y--;
        }
        if (direction.equals(E)) {
            x++;
        }
    }


    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }
}
