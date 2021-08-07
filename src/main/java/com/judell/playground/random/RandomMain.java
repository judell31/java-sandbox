package com.judell.playground.random;

/**
 * Gives a status if the number is > 4
 */
public class RandomMain {
    private static GenRandomNumber randomNumber = new GenRandomNumber();

    public static void main(String[] args) {
        String user = "!help";

        if (user.equals(Triggers.triggerKeys("!help"))){
            randomNumber.setRandomNumber(20);
            System.out.println("you got helped");
        }
        else if (Triggers.triggerValues().contains(user) && randomNumber.randomNumber() <= 4){
            System.out.println("not in mood");
        }
        else {
            System.out.println("in mood to talk");
        }
    }
}
