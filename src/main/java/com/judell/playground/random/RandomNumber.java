package com.judell.playground.random;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random handler = new Random();
        int handlerNum = handler.nextInt(200);

        System.out.println(handlerNum);
    }
}
