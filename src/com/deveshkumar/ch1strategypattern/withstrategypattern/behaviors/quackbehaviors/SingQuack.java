package com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 24-01-2023
 * @time : 01:25 pm
 */
public class SingQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Qaucking with Singing singing singing!!! hehe boyz");
    }
}
