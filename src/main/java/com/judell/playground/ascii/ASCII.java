package com.judell.playground.ascii;

public class ASCII {

    /**
     * Prints out all ASCII Values
     */
    /*
     * Todo: Print out the escape character and description.
     * For example: \n is a new line but in the console it
     * actually makes the new line
     */
    public static void main(String[] args) {
        char c = 0;
        for (int i = 0; i < 128; i++){
            System.out.println(i + ": " + c++);
        }
    }
}
