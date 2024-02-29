package com.judell.playground.available_times;

import java.util.ArrayList;
import java.util.List;

public class Availability {

    public static void main(String[] args) {
        List<Integer> sessions = new ArrayList<>();

        sessions.add(10);

        for (int i = 8; i <= 20; i++) {
            if (sessions.get(0) != i && sessions.get(0) != i+1) {
                System.out.println("available at: " + i + "-" + (i+1) + "\n");
            }
        }
    }
}
