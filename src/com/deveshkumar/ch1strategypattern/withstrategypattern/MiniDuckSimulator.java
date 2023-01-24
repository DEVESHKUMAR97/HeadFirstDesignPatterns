package com.deveshkumar.ch1strategypattern.withstrategypattern;

import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.flybehaviors.FlyRocketPowered;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors.MuteQuack;
import com.deveshkumar.ch1strategypattern.withstrategypattern.behaviors.quackbehaviors.SingQuack;
import com.deveshkumar.ch1strategypattern.withstrategypattern.ducks.*;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        // Here, in the MallardDuck, we have violating design principle.
        // we are coding to concrete implementation, not the interface
        // we are injecting quacking behavior strategy to MallardDuck, while coding the mallardDuck class

        System.out.println("Calling methods for Mallard Duck.");
        duck.performQuack();
        duck.swim();
        duck.display();
        duck.performFly();
        System.out.println("----------------------");


        duck = new RedheadDuck();
        System.out.println("Calling methods for Redhead Duck.");
        duck.performQuack();
        duck.swim();
        duck.display();
        duck.performFly();
        System.out.println("----------------------");


        duck = new RubberDuck();
        System.out.println("Calling methods for Rubber Duck.");
        duck.performQuack();
        duck.swim();
        duck.display();
        duck.performFly();
        System.out.println("----------------------");


        duck = new ModelDuck();
        System.out.println("Calling methods for Model Duck.");
        duck.performQuack();
        duck.swim();
        duck.display();
        duck.performFly();
        System.out.println("After dynamically changing the behaviour strategy for Model Duck");
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.setQuackBehavior(new MuteQuack());
        duck.performQuack();
        duck.swim();
        duck.display();
        duck.performFly();
        System.out.println("----------------------");

        duck = new MallardDuck(new FlyRocketPowered(), new SingQuack());
        // Here, in the MallardDuck, we are using design principle by passing concrete behaviour strategy to interfaces
        // we are coding the interface and passing strategies to interface at run time
        // we are injecting quacking behavior strategy to MallardDuck, while using the mallardDuck class dynamically

        System.out.println("Calling methods for Mallard Duck.");
        duck.performQuack();
        duck.swim();
        duck.display();
        duck.performFly();
        System.out.println("----------------------");

    }

}
