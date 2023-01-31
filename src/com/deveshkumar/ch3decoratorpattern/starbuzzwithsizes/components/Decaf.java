package com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.components;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 31-01-2023
 * @time : 05:19 am
 */
public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Decaf");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
