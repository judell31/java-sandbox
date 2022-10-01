package com.judell.playground.scratchpad;

import java.sql.Timestamp;
import java.time.Instant;

public class ScratchPad {
    
    public static void main(String[] args) {
        System.out.println("I am a scratch pad");
        System.out.println("----------------------------------------");

        System.out.println(Timestamp.from(Instant.now()));
        System.out.println(Instant.now());
    }
}
