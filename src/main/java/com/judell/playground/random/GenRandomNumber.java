package com.judell.playground.random;

import java.util.Random;

/**
 * Generates a random number
 */
public class GenRandomNumber {
    private final Random random = new Random(System.currentTimeMillis());
    private int num;

    public Integer randomNumber(){
        num = random.nextInt(20);
        return num;
    }

    public Integer setRandomNumber(Integer num){
        return this.num = num;
    }
}
