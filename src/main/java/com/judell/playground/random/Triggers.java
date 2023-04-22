package com.judell.playground.random;

import java.util.Collection;
import java.util.HashMap;

public class Triggers {
    private static final String PREFIX = "!";
    private final static HashMap<String, String> triggers = new HashMap<>();

    static {
        triggers.put("hi", PREFIX + "hi");
        triggers.put("wyd", PREFIX + "wyd");
        triggers.put("food", PREFIX + "food");
        triggers.put("help", PREFIX + "help");
    }

    public static HashMap<String, String> triggerMap(){
        return triggers;
    }

    public static Collection<String> triggerValues(){
        return triggers.values();
    }

    public static String triggerKeys(String key){
        return triggers.get(key);
    }
}
