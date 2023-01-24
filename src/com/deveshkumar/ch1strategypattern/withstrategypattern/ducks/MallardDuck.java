package com.deveshkumar.ch1strategypattern.withstrategypattern.ducks;

import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors.FlyWithWings;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors.IFlyBehavior;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors.IQuackBehavior;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        // here we are violating design principle, we are coding to concrete implementation, not the interface
        quackBehavior = new Quack(); // injecting quacking behavior strategy to MallardDuck, while coding the class
        flyBehavior = new FlyWithWings();
    }

    public MallardDuck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
