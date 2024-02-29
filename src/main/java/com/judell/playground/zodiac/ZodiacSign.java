package com.judell.playground.zodiac;

public class ZodiacSign {

    public static void main(String[] args) {
        System.out.println(getZodiacSign(9, 20));
    }

    public static String getZodiacSign(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid month or day");
        }

        if (month == 1 && day <= 19) {
            return "capricorn";
        } else if (month == 1 && day >= 20) {
            return "aquarius";
        } else if (month == 2 && day <= 18) {
            return "aquarius";
        } else if (month == 2 && day >= 19) {
            return "pisces";
        } else if (month == 3 && day <= 20) {
            return "pisces";
        } else if (month == 3 && day >= 21) {
            return "aries";
        } else if (month == 4 && day <= 19) {
            return "aries";
        } else if (month == 4 && day >= 20) {
            return "taurus";
        } else if (month == 5 && day <= 20) {
            return "taurus";
        } else if (month == 5 && day >= 21) {
            return "gemini";
        } else if (month == 6 && day <= 20) {
            return "gemini";
        } else if (month == 6 && day >= 21) {
            return "cancer";
        } else if (month == 7 && day <= 22) {
            return "cancer";
        } else if (month == 7 && day >= 23) {
            return "leo";
        } else if (month == 8 && day <= 22) {
            return "leo";
        } else if (month == 8 && day >= 23) {
            return "virgo";
        } else if (month == 9 && day <= 22) {
            return "virgo";
        } else if (month == 9 && day >= 23) {
            return "libra";
        } else if (month == 10 && day <= 22) {
            return "libra";
        } else if (month == 10 && day >= 23) {
            return "scorpio";
        } else if (month == 11 && day <= 21) {
            return "scorpio";
        } else if (month == 11 && day >= 22) {
            return "sagittarius";
        } else if (month == 12 && day <= 21) {
            return "sagittarius";
        } else if (month == 12 && day >= 22) {
            return "capricorn";
        } else {
            throw new AssertionError("Should not reach here");
        }
    }
}
