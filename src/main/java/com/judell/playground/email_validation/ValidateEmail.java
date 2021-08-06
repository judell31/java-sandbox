package com.judell.playground.email_validation;

import java.util.regex.Pattern;

public class ValidateEmail {
    public final static String emailRegex =
            "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";

    public static void main(String[] args) {
        String correctEmailFormat = "jtda vis@gmail.com";
        String incorrectEmailFormat = "jtdavis";

        correctEmailFormat = correctEmailFormat.replaceAll("\\s", "");
        if (isValid(correctEmailFormat)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        System.out.println(correctEmailFormat);
    }

    public static boolean isValid(String email){
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null){
            return false;
        }
        return pat.matcher(email).matches();
    }
}
