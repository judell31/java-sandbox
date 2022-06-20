package com.judell.playground.time_date;

import java.util.TimeZone;

public class TimeZoneList {

    public static void main(String[] args) {
        getTimeZoneIds();
    }

    public static void getTimeZoneIds() {
        String[] ids = TimeZone.getAvailableIDs();

        for(String id: ids){
            System.out.println(id);
        }
    }
}
