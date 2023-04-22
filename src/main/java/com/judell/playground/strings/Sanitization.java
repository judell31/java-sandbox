package com.judell.playground.strings;

/**
 * Sanitizes a string based on a regex
 */
public class Sanitization {

    public static void main(String[] args) {
        String string = "daddY, i want cuddles?";
        String x = "daddy i want cuddles";
        String words = string.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        System.out.println(words.equalsIgnoreCase(x));
    }
}
