package com.judell.playground.hash_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

//Todo: Refactor this and add javadoc
public class HashMapOne {
    private static final HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("t", "test");
        map.put("r", "remove");
        System.out.println(triggerKeyList());
        System.out.println(map.keySet() + " " + map.values());
        map.put("t", "test");
        map.put("r", "remove");
        deleteFromMap("t");
        addToMap();
        System.out.println(triggerKeyList());
        System.out.println(map.keySet() + " " + map.values());
    }

    public static void addToMap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Add a Key: ");
        String key = input.next();
        System.out.print("Add a Value: ");
        String value = input.next();
        map.put(key, value);
    }

    public static void deleteFromMap(String key){
        map.remove(key);
    }

    public static Collection<String> triggerValues(){
        return map.values();
    }

    public static String triggerKeyList(){
        return String.join("\n", triggerValues());
    }
}
