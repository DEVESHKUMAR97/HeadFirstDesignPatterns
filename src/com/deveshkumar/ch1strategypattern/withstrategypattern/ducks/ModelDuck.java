package com.deveshkumar.ch1strategypattern.withstrategypattern.ducks;

import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors.FlyNoWay;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors.IFlyBehavior;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors.IQuackBehavior;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors.Quack;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 24-01-2023
 * @time : 01:17 pm
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public ModelDuck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I am a model duck!!!");
    }
}
