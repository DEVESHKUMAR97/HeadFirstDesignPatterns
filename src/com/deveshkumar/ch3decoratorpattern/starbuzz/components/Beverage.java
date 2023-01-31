package com.deveshkumar.ch3decoratorpattern.starbuzz.components;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 31-01-2023
 * @time : 03:30 am
 */


/**
 * Beverage Component is an abstract class. This will be extended by the Concrete Components.
 * <p>
 * Each Concrete Component(subclass) can be used on its own or wrapped bt a decorator.
 *
 */
public abstract class Beverage {
    /**
     * the description instance is set in each subclass and holds the description of the beverage.
     */
    private String description = "Unknown Beverage";

    /**
     * the cost method is abstract method and each subclass needs to define their own implementation.
     * <p>
     * It will return the cost of the beverage.
     */
    public abstract double cost();

    /**
     * getDescription() is already implemented here and each subclass(apart from decorator subclass) can use this.
     *
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
