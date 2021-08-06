package com.judell.playground.hash_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTwo {
    private final static String PREFIX = "!";
    private static HashMap<String, String> triggers = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(triggerKeyList());
    }

    private static HashMap triggerMap(){
        triggers.put("nero", PREFIX + "n");
        triggers.put("son", PREFIX + "s");
        triggers.put("smh", PREFIX + "nsmh");
        return triggers;
    }

    public static Map triggerKeys(){
        return triggerMap();
    }

    public static String triggerKeyList(){
        for (Object name : triggerMap().values()){
            return name.toString();
        }
        return triggerKeys().toString();
    }
}
