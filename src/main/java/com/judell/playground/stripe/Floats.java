package com.judell.playground.stripe;

/**
 * Converting floats from whole to decimal and vis versa
 */
public class Floats {

    public static void main(String[] args) {
        double charge = 20.99;
        System.out.println(Math.round(charge * 100));
        double res = charge * .45;
        System.out.println("correct " + Math.round(res * 100));
        System.out.println(aDouble(charge));
    }

    public static double aDouble(double num){
        double result = num * .45;
        long x = Math.round(result * 100);
        return Math.round(result * 100);
    }
}
