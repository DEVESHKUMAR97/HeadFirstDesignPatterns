package com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.decorators;

import com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.components.Beverage; /**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 31-01-2023
 * @time : 03:32 am
 */

/**
 * CondimentDecorator is an abstract class and will be extended by the concrete decorators.
 * <p>
 * It inherits the Beverage component because after decorating the Beverage(by composition)
 * it will also become a Beverage.
 * Remember: We are using inheritance to achieve the type matching only,
 * but we aren't using inheritance to get behaviors.
 * Instead, We are adding new behaviors by composing the beverage component object.
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * Each condiment decorator has-a beverage component and using this we are decorating the component.
     * Note: We are using design principle: code to interface not the concrete classes.
     * So, Any concrete decorator can compose any concrete beverage.
     */
    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * All condiment decorators subclasses needs to re-implement this method again.
     * So, we will not be using the implementation provided by Beverage superclass.
     */
    public abstract String getDescription();

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
