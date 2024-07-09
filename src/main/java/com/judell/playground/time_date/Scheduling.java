package com.judell.playground.time_date;

import net.time4j.*;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class Scheduling {

    public static void main(String[] args) {
        PlainDate date = PlainDate.of(2024, 2, 28);

        PlainTime aptTime1 = PlainTime.of(15, 0); // 3:30pm
        PlainTime aptTime2 = PlainTime.of(14, 0);
        PlainTime aptTime3 = PlainTime.of(10, 0);

        PlainTimestamp appointment1 = PlainTimestamp.of(date, aptTime1);
        PlainTimestamp otherAppointment2 = PlainTimestamp.of(date, aptTime2);
        PlainTimestamp otherAppointment3 = PlainTimestamp.of(date, aptTime3);

        List<PlainTimestamp> appointments = new ArrayList<>();

        appointments.add(appointment1);
        appointments.add(otherAppointment2);
        appointments.add(otherAppointment3);

        Weekday startDay = Weekday.MONDAY;
        Weekday endDay = Weekday.FRIDAY;

        PlainTime tutorStartTime = PlainTime.of(8, 0);
        PlainTime tutorEndTime = PlainTime.of(17, 0);

        PlainDate inputStartDate = PlainDate.of(2024, 2, 26);
        PlainDate inputEndDate = PlainDate.of(2024, 3, 26);

        PlainTime currentTutorStartTime = tutorStartTime;

        int interval = 1;

        while (inputStartDate.getDayOfWeek().compareTo(startDay) >= 0 && inputEndDate.getDayOfWeek().compareTo(endDay) <= 0) {
            System.out.println("\n" + inputStartDate);

            for (int i = tutorStartTime.getHour(); i < tutorEndTime.getHour(); i++) {
                boolean isAvailable = true;  // Reset availability for each hour
                for (PlainTimestamp appointmentTime : appointments) {
                    if (i == appointmentTime.getHour() && inputStartDate.equals(appointmentTime.toDate())) {
                        isAvailable = false;
                        break;  // No need to check further appointments for this hour
                    }
                }

                if (isAvailable) {
                    System.out.println("---------- Available: " + i + ":00");
                }
            }

            inputStartDate = inputStartDate.plus(interval, CalendarUnit.DAYS);
            currentTutorStartTime = currentTutorStartTime.plus(interval, ClockUnit.HOURS);

            if (inputStartDate.compareTo(inputEndDate) > 0) {
                break;
            }
        }
    }
}
