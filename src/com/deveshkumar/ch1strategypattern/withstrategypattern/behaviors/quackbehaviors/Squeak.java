package com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 24-01-2023
 * @time : 12:45 pm
 */
public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak Squeeeakkk!!!");
    }
}
