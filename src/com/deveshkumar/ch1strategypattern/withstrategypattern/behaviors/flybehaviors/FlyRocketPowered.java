package com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 24-01-2023
 * @time : 01:15 pm
 */
public class FlyRocketPowered implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!!!");
    }
}
