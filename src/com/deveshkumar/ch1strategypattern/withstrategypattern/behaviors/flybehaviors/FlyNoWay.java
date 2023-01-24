package com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 24-01-2023
 * @time : 12:41 pm
 */
public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!! :(");
    }
}
