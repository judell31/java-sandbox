package com.judell.playground.time_date;

import net.time4j.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Scheduling {

    public static void main(String[] args) {
        PlainDate date = PlainDate.of(2024, 2, 28);
        PlainTime aptTime = PlainTime.of(15, 0); // 3:30pm

        PlainDate date2 = PlainDate.of(2024, 2, 28);
        PlainTime aptTime2 = PlainTime.of(14, 0); // 3:30pm

        PlainTimestamp appointment = PlainTimestamp.of(date, aptTime);
        PlainTimestamp otherAppointment = PlainTimestamp.of(date2, aptTime2);

        List<PlainTimestamp> appointments = new ArrayList<>();

        appointments.add(appointment);
        appointments.add(otherAppointment);

        PlainTime startTime = PlainTime.of(8, 0); // 3:30pm
        PlainTime endTime = PlainTime.of(17, 0); // 3:30pm
        PlainTime time = startTime; // 3:30pm

        int interval = 1;

        while (time.isBefore(endTime)) {
            boolean isAvlailable = true;

            for (PlainTimestamp appointmentt : appointments) {
                if (appointmentt.equals(PlainTimestamp.of(date, time))) {
                    isAvlailable = false;

                    break;
                }
            }

            if (isAvlailable) {
                System.out.println(PlainTimestamp.of(date, time));
            }

            time = time.plus(interval, ClockUnit.HOURS);
        }

        for (int i = 0; i < 16; i++) {
            if (time.isBefore(endTime)) {
                for (PlainTimestamp apt : appointments) {
                    if (!apt.equals(PlainTimestamp.of(date, time))) {
                        System.out.println(PlainTimestamp.of(date, time));
                    }
                }

                time = time.plus(interval, ClockUnit.HOURS);
            }
        }
    }
}
