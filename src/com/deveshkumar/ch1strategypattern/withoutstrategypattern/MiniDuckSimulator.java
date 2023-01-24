package com.deveshkumar.ch1strategypattern.withoutstrategypattern;

import com.deveshkumar.ch1strategypattern.withoutstrategypattern.ducks.Duck;
import com.deveshkumar.ch1strategypattern.withoutstrategypattern.ducks.MallardDuck;
import com.deveshkumar.ch1strategypattern.withoutstrategypattern.ducks.RedheadDuck;
import com.deveshkumar.ch1strategypattern.withoutstrategypattern.ducks.RubberDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        System.out.println("Calling methods for Mallard Duck.");
        duck.quack();
        duck.swim();
        duck.display();
        duck.fly();
        System.out.println("----------------------");

        duck = new RedheadDuck();
        System.out.println("Calling methods for Redhead Duck.");
        duck.quack();
        duck.swim();
        duck.display();
        duck.fly();
        System.out.println("----------------------");


        duck = new RubberDuck();
        System.out.println("Calling methods for Rubber Duck.");
        duck.quack();    // problem rubber duck is quacking
        duck.swim();
        duck.display();
        duck.fly(); // problem rubber duck is flying
        System.out.println("----------------------");

    }
}
