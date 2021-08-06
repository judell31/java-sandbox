package com.judell.playground.design_patterns.strategy;

public class SuperSaiyanThree implements SaiyanStrategy {
    @Override
    public void transform() {
        System.out.println("Goku transformed into a Super Saiyan 3");
    }
}
