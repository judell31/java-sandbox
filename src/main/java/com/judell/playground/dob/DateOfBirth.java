package com.judell.playground.dob;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOfBirth {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date birthDate = sdf.parse("1995-09-20");
        Date currentDate = new Date();

        long currentTime = currentDate.getTime();
        long birthTime = birthDate.getTime();

        int age = (int)((currentTime - birthTime) / (1000L * 60 * 60 * 24 * 365));

        System.out.println(age);
    }
}
