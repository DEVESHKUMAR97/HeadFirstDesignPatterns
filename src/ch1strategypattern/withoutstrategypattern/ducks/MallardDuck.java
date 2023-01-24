package ch1strategypattern.withoutstrategypattern.ducks;

import ch1strategypattern.withoutstrategypattern.Duck;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
