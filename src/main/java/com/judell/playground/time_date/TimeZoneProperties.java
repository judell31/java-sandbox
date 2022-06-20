package com.judell.playground.time_date;

import java.util.TimeZone;

public class TimeZoneProperties {

    public static void main(String[] args) {
        getTimeZone();
    }

    public static void getTimeZone() {
        System.out.println("ID: " + TimeZone.getDefault().getID());
        System.out.println("Display Name: " + TimeZone.getDefault().getDisplayName());
        System.out.println("Raw Offset: " + TimeZone.getDefault().getRawOffset());
        System.out.println("DST: " + TimeZone.getDefault().getDSTSavings());
    }
}
