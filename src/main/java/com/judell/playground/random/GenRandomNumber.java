package com.judell.playground.random;

import java.util.Random;

public class GenRandomNumber {
    private Random random = new Random(System.currentTimeMillis());
    private int num;

    public Integer randomNumber(){
        num = random.nextInt(20);
        return num;
    }

    public Integer setRandomNumber(Integer num){
        return this.num = num;
    }
}
