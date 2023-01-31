package com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.components;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 31-01-2023
 * @time : 05:20 am
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("Dark Roast");
    }

    @Override
    public double cost() {
        return .99;
    }
}
