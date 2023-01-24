package com.deveshkumar.ch1strategypattern.withstrategypattern.ducks;

import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors.FlyNoWay;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors.IFlyBehavior;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors.IQuackBehavior;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors.Squeak;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 24-01-2023
 * @time : 01:12 pm
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public RubberDuck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a real Rubber Duck");
    }
}
