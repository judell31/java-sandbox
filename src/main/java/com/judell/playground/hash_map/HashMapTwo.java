package com.judell.playground.hash_map;

import java.util.HashMap;
import java.util.Map;

//Todo: Refactor this and add javadoc
public class HashMapTwo {
    private final static String PREFIX = "!";
    private static final HashMap<String, String> triggers = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(triggerKeyList());
    }

    private static HashMap<String, String> triggerMap(){
        triggers.put("nero", PREFIX + "n");
        triggers.put("son", PREFIX + "s");
        triggers.put("smh", PREFIX + "nsmh");
        return triggers;
    }

    public static Map<String, String> triggerKeys(){
        return triggerMap();
    }

    public static String triggerKeyList(){
        for (Object name : triggerMap().values()){
            return name.toString();
        }
        return triggerKeys().toString();
    }
}
