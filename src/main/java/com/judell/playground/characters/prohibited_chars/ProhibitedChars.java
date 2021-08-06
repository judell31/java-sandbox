package com.judell.playground.characters.prohibited_chars;

import java.util.ArrayList;

public class ProhibitedChars {

    /**
     * This only checks for ASCII Values 0-127
     */
    //Todo: Account for Unicode Characters
    public static void main(String[] args) throws Exception{
        ArrayList<Character> prohibitedCharsList = new ArrayList<>();
        String correctInput = "Judell";
        String incorrectInput = "Judell!";

        char c = 0;
        for (int i = 0; i < 128; i++){
            c++;
            if (!Character.isLetter(c) && c != 39 && c != 32){
                prohibitedCharsList.add(c);
            }
        }
        System.out.println(prohibitedCharsList);

        char x = 32;
        correctInput = correctInput.replaceAll("\\s", "");

        System.out.println("Valid Input");
        System.out.println(correctInput);
        for (int i = 0; i < correctInput.length(); i++){
            for (int p = 0; p < prohibitedCharsList.size(); p++){
                if (correctInput.charAt(i) == prohibitedCharsList.get(p) || correctInput.charAt(i) >= '\u0080'){
                    System.out.println("String " + correctInput + " contains illegal character(s): " + correctInput.charAt(i));
                    throw new Exception("You have entered an illegal character");
                }
            }
        }

        System.out.println("\nInvalid Input");
        System.out.println(incorrectInput);
        for (int i = 0; i < incorrectInput.length(); i++){
            for (int p = 0; p < prohibitedCharsList.size(); p++){
                if (incorrectInput.charAt(i) == prohibitedCharsList.get(p) || incorrectInput.charAt(i) >= '\u0080'){
                    System.out.println("String " + incorrectInput + " contains illegal character(s): " + incorrectInput.charAt(i));
                    throw new Exception("You have entered an illegal character");
                }
            }
        }
    }
}
