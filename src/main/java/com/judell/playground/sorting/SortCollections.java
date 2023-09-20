package com.judell.playground.sorting;

import java.util.*;
import java.util.Map.Entry;

public class SortCollections {

    public static void main(String[] args) {
//        Map<Integer,String> employeeIdandNameMap = new HashMap<>();
        Map<String, Integer> employeeIdandNameMap = new HashMap<>();

//        employeeIdandNameMap.put(10234, "Sean");
//        employeeIdandNameMap.put(10033, "KK");
//        employeeIdandNameMap.put(11004, "MARK");
//        employeeIdandNameMap.put(11724, "ANTONY");
//        employeeIdandNameMap.put(12004, "WEST");
//        employeeIdandNameMap.put(13234, "BEAN");
//        employeeIdandNameMap.put(10004, "AK");

        employeeIdandNameMap.put("Prod1", 32);
        employeeIdandNameMap.put("Prod2", 10);
        employeeIdandNameMap.put("Prod3", 55);
        employeeIdandNameMap.put("Prod4", 8);

        System.out.println("Original Map::::");
        employeeIdandNameMap.forEach((k,v)->System.out.println(k+"\t"+v));

//        Set<Entry<Integer, String>> entrySet = employeeIdandNameMap.entrySet();
        Set<Entry<String, Integer>> entrySet = employeeIdandNameMap.entrySet();
//        List<Entry<Integer, String>> list = new ArrayList<>(entrySet);
        List<Entry<String, Integer>> list = new ArrayList<>(entrySet);

        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        /* Reversed */
        list.sort(Entry.<String, Integer>comparingByValue().reversed());

        System.out.println("Map sorted based on Values::::");

        list.forEach(item -> {
            System.out.println(item.getKey()+"\t"+item.getValue());
        });
    }
}
