package com.deveshkumar.ch1strategypattern.withstrategypattern.ducks;

import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors.IFlyBehavior;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors.IQuackBehavior;

public abstract class Duck {
    // Design principle 2: program(code) to interface(supertype), not to implementation(concrete subclass)
    // Design principle 3: Favor composition over inheritance. has-a relationship
    // has-a can be better than is-a
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public Duck() {
    }

    public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("Duck is swimming. All ducks float, even decoys!");
    }

    public abstract void display(); //abstract method, all subclasses have to implement this

    public void performQuack() {
        quackBehavior.quack(); // delegate the responsibility to quack to the behaviour class
    }

    public void performFly() {
        flyBehavior.fly(); // delegate the responsibility to fly to the behaviour class
    }


}
