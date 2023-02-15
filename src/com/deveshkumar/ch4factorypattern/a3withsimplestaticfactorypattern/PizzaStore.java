package com.deveshkumar.ch4factorypattern.a3withsimplestaticfactorypattern;

import com.deveshkumar.ch4factorypattern.pizzas.Pizza;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 12:20 pm
 */

/**
 * This is the client which request factory(SimpleStaticPizzaFactory) to create product(Pizza) for it.
 */
public class PizzaStore {
    public Pizza orderPizza(String type) {
        // we have separated and encapsulated the things which were varied
        // inside the simpleStaticPizzaFactory.
        // We are now not creating concrete objects inside the client
        // and client has delegated this job to factory.
        Pizza pizza = SimpleStaticPizzaFactory.createPizza(type);


        // Things that remains the same
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }
}
