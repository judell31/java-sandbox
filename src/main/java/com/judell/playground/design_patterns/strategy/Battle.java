package com.judell.playground.design_patterns.strategy;

/**
 * link to video
 */
//https://www.youtube.com/watch?v=11yEH9RAI28
public class Battle {

    public static void main(String[] args) {
        Goku ssj = new Goku("ssj");
        Goku ssj3 = new Goku("ssj3");

        System.out.println("Goku VS Freiza");
        ssj.saiaynStrategy(new SuperSaiyan());
        ssj.transform();

        System.out.println("\nGoku VS Kid Buu");
        ssj3.saiaynStrategy(new SuperSaiyanThree());
        ssj3.transform();
    }
}
