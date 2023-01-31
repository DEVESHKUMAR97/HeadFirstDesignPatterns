package com.deveshkumar.ch3decoratorpattern.starbuzz.decorators;

import com.deveshkumar.ch3decoratorpattern.starbuzz.components.Beverage;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 31-01-2023
 * @time : 05:48 am
 */
public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return getBeverage().cost() + .10;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Whip";
    }
}
