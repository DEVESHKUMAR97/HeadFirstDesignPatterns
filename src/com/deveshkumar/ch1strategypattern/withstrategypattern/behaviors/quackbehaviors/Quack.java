package com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 24-01-2023
 * @time : 12:44 pm
 */
public class Quack implements IQuackBehavior {
    @Override
    public void quack() { // quack behavior implementation strategy
        System.out.println("Quack Quack!!!");
    }
}
