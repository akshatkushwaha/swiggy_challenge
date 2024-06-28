package com.task;

import java.util.Random;

public class Dice {
    private static final int sides = 6;
    private final Random random;

    public Dice(){
        this.random = new Random();
    }

    public int roll(){
        return random.nextInt(sides) + 1;
    }
}
