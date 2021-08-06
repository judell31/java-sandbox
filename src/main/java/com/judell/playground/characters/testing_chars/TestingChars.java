package com.judell.playground.characters.testing_chars;

import java.util.ArrayList;
import java.util.Arrays;

public class TestingChars {
    private static String[] punc = {",", ".", "!", "?", "/", ":", ";", "'", "\"", "-"};
    private static ArrayList<Character> characters = new ArrayList<>();

    public static void main(String[] args) {
        char c = 0;
        int num = 0;
        for (int i = 0; i < punc.length; i++){
            System.out.println(Arrays.toString(punc[i].getBytes()));
//            c++;
//            if (Character.isLetterOrDigit(c)){
//                characters.add(c);
//                System.out.println(num++ + ":" + c);
//            }
        }
    }
}
