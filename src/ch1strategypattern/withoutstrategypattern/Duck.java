package ch1strategypattern.withoutstrategypattern;

public abstract class Duck {

    public void quack() {
        System.out.println("Duck is quacking.");
    }

    public void swim() {
        System.out.println("Duck is swimming. All ducks float, even decoys!");
    }

    public abstract void display(); //abstract method, all subclasses have to implement this

    public void fly() {
        System.out.println("Duck is flying."); //
    }
}
