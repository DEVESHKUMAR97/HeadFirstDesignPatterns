package com.deveshkumar.ch1strategypattern.withstrategypattern.ducks;

import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors.FlyWithWings;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors.IFlyBehavior;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors.IQuackBehavior;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public RedheadDuck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a real Redhead Duck");
    }
}
