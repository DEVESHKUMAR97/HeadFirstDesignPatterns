package com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 24-01-2023
 * @time : 12:36 pm
 */
public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {   // Flying behavior implementation strategy
        System.out.println("I am flying with Wings!!! uuhhoooo");
    }
}
