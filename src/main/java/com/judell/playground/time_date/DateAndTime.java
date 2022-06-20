package com.judell.playground.time_date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateAndTime {
    private static final String SEPARATOR = "------------------------------------------------------------------------";
    public static void main(String[] args) {
        System.out.println("Add and Subtract Time");
        addSubtractTime();
        System.out.println("UTC Time");
        getUtcTime();
        System.out.println("UTC to Local Time");
        utcToLocalTime();
        System.out.println("Local to UTC Time");
        localToUtcTime();
    }

    //TODO: Switch to using Joda Time
    public static void addSubtractTime() {
        Instant utcTime = Instant.now();

        System.out.println("Time in UTC: " + utcTime);
        System.out.println("Time in UTC + 2hrs: " + utcTime.plus(2, ChronoUnit.HOURS));
        System.out.println("Time in UTC - 2hrs: " + utcTime.minus(2, ChronoUnit.HOURS));
        System.out.println(SEPARATOR);
    }

    /**
     * Using Joda time, gets a UTC timestamp
     */
    public static void getUtcTime() {
        System.out.println(Instant.now());
        System.out.println(SEPARATOR);
    }

    /**
     * Converts a UTC timestamp to local time
     */
    public static void utcToLocalTime() {
        Instant utcTimeStamp = Instant.now();
        ZonedDateTime cstTime = utcTimeStamp.atZone(ZoneId.of("America/Chicago"));
        System.out.println("UTC Time: " + utcTimeStamp);
        System.out.println("Local Time: " + cstTime);
        System.out.println(SEPARATOR);
    }

    public static void localToUtcTime() {
        Instant utcTimeStamp = Instant.now();
        ZonedDateTime cstTime = utcTimeStamp.atZone(ZoneId.of("America/Chicago"));
        convertLocalToUtc(cstTime);
    }

    /**
     * Converts a Local timestamp to UTC time
     */
    private static void convertLocalToUtc(ZonedDateTime zonedDateTime) {
        System.out.println("Local Time: " + zonedDateTime);
        System.out.println("UTC Time: " + zonedDateTime.toInstant());
        System.out.println(SEPARATOR);
    }
}
