package com.deveshkumar.ch3decoratorpattern.starbuzz.decorators;

import com.deveshkumar.ch3decoratorpattern.starbuzz.components.Beverage;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 31-01-2023
 * @time : 04:11 am
 */

/**
 * Concrete Condiment Decorator
 * 1) We need to re-implement the getDescription() method.
 * 2) We need to implement the cost() method.
 */
public class Milk extends CondimentDecorator {


    public Milk(Beverage beverage) {
        super(beverage);
    }

    /**
     * re-implemented the getDescription method. So, We first delegate to the object
     * which we are decorating to ge its description, then append ", Milk" to that description.
     */
    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Milk";
    }

    /**
     * Computing the cost of the beverage with Milk decorator.
     */
    @Override
    public double cost() {
        return .10 + getBeverage().cost();
    }


}
