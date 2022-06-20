package com.judell.playground.time_date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateAndTime {
    private static final String SEPARATOR = "------------------------------------------------------------------------";
    public static void main(String[] args) {
        System.out.println("Add and Subtract Time");
        addSubtractTime();
//        System.out.println("UTC Time");
//        getUtcTime();
//        System.out.println("UTC to Local Time");
//        utcToLocalTime();
//        System.out.println("Local to UTC Time");
//        localToUtcTime();
//        System.out.println("Date Properties");
//        getLocalDateProperties();
//        System.out.println("UTC Next Day");
//        utcNextDay();
//        System.out.println("Date");
//        dateFromInstant();
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

    public static void getLocalDateProperties() {
        Instant utcTimeStamp = Instant.now();
        ZonedDateTime cstTime = utcTimeStamp.atZone(ZoneId.of("America/Chicago"));

        System.out.println("Day of Week: " + cstTime.getDayOfWeek());
        System.out.println("Day of Month: " + cstTime.getDayOfMonth());
        System.out.println("Day of Year: " + cstTime.getDayOfYear());
        System.out.println("Year: " + cstTime.getYear());
        System.out.println("Month: " + cstTime.getMonth() + " or " + cstTime.getMonthValue());
        System.out.println(SEPARATOR);
    }

    public static void utcNextDay() {
        String inputValue = "2012-08-15T00:00:00.000Z";
        Instant utcTimestamp = Instant.parse(inputValue);
        ZonedDateTime cstTime = utcTimestamp.atZone(ZoneId.of("America/Chicago"));
        System.out.println(utcTimestamp);
        System.out.println(cstTime);
        System.out.println(SEPARATOR);
    }

    /**
     * HH = 24hr format hh = 12hr format
     */
    public static void dateFromInstant() {
        Instant utcTimeStamp = Instant.now();

        SimpleDateFormat militaryFormatter = new SimpleDateFormat("MM-dd-yyyy HH:mm");
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm");
        String militaryFormat = militaryFormatter.format(Date.from(utcTimeStamp));
        String regularFormat = formatter.format(Date.from(utcTimeStamp));

        System.out.println("UTC Date: " + utcTimeStamp);
        System.out.println("Non Formatted Date: " + Date.from(utcTimeStamp));
        System.out.println("Formatted Date 24hr: " + militaryFormat);
        System.out.println("Formatted Date 12hr: " + regularFormat);
        System.out.println(SEPARATOR);
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
