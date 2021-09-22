package com.judell.playground.design_patterns.strategy;

public class Goku {
    private SaiyanStrategy transform;
    private String saiyanLevel;

    public Goku(String saiyanLevel){
        this.saiyanLevel = saiyanLevel;
    }

    public void saiaynStrategy(SaiyanStrategy transform){
        this.transform = transform;
    }

    public void transform(){
        System.out.println("Saiyan Level: " + this.saiyanLevel);
        transform.transform();
    }
}
