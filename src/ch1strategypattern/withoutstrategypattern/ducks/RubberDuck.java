package ch1strategypattern.withoutstrategypattern.ducks;

import ch1strategypattern.withoutstrategypattern.Duck;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a real Rubber Duck");
    }
}
