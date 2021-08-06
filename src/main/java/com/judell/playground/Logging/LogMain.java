package com.judell.playground.Logging;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Todo: fix slf4j import dep
public class LogMain {
    private final static Logger LOGGER = LoggerFactory.getLogger(LogMain.class);

    public static void main(String[] args) {
        int x = 3;
        LOGGER.debug("Debug");
        LOGGER.info(x(4));
        LOGGER.error("Error {}", x);
        LOGGER.atInfo().addArgument(x(3)).log("the number was {}");
    }

    public static String x(int x){
        if(x == 3){
            return "hello";
        }
        return "you need to enter the number 3";
    }
}
