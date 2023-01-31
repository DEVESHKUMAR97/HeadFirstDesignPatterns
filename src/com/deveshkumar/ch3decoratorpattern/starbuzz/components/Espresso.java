package com.deveshkumar.ch3decoratorpattern.starbuzz.components;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 31-01-2023
 * @time : 05:16 am
 */
public class Espresso extends Beverage {
    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
