package com.judell.playground.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractText {

    public static void main(String[] args) {
        String str = "[Cum in me]";

        Pattern pattern = Pattern.compile("\\[(.*?)]");
        Matcher matcher = pattern.matcher(str);

        if( matcher.find() ) {
            System.out.println( matcher.group(1));
        }
    }
}
