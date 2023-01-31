package com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.components;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 31-01-2023
 * @time : 04:04 am
 */

/**
 * Concrete beverage component.
 * 1) We need to set a description for the specific beverage
 * 2) We need to implement the cost method.
 */
public class HouseBlend extends Beverage {


    public HouseBlend() {
        setDescription("House Blend Coffee");
    }

    @Override
    public double cost() {
        return .89;
    }
}
