package com.practice.smell.p3_lsp;


public class Mammal {

    private Integer weight;
    private Integer ageInDays;

    public Integer getWeight() {
        return weight;
    }

    public Integer getAgeInDays() {
        return ageInDays;
    }

    public void walk() {
        System.out.println("I am walking");
    }

}