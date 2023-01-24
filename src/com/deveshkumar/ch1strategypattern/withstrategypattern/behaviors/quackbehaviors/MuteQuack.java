package com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 24-01-2023
 * @time : 12:46 pm
 */
public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence, Sorry I can't quack!!! :(");
    }
}
