package com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.decorators;

import com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.components.Beverage;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 31-01-2023
 * @time : 05:48 am
 */
public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return getBeverage().cost() + .15;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Soy";
    }
}
