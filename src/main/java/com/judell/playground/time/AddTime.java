package com.judell.playground.time;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class AddTime {

    public static void main(String[] args) {
        Instant utcTime = Instant.now();

        System.out.println("Time in UTC: " + utcTime);
        System.out.println("Time in UTC + 2hrs: " + utcTime.plus(2, ChronoUnit.HOURS));
        System.out.println("Time in UTC - 2hrs: " + utcTime.minus(2, ChronoUnit.HOURS));
    }
}
