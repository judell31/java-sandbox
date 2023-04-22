package com.judell.playground.read_num_of_chars;

import java.util.Scanner;

public class ReadNumOfChars {

    /**
     *Reads the number of characters in a string.
     */
    public static void main(String[] args) {
        int x = 1;

        while (x == 1) {
            System.out.println(
                    "\nType any string bellow and get the length."
            );

            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter a String: ");
            String s = input.nextLine();
            System.out.println("Number of chars in string: " + s.length());

            System.out.print("\nDo you want to enter another string?(y or n): ");
            String exit = input.nextLine();

            if (exit.equals("y")){
                x = 4;
            }
            else if (exit.equals("n")){
                x = 2;
                System.out.println("Exiting...");
            }
        }
    }
}