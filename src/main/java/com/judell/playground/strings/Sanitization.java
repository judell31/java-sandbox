package com.judell.playground.strings;

public class Sanitization {

    public static void main(String[] args) {
        String string = "daddY, i want cuddles?";
        String x = "daddy i want cuddles";
        String words = string.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        System.out.println(words.equalsIgnoreCase(x));
//        String[] words = string.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    }
}
