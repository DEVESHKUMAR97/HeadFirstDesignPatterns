package com.deveshkumar.ch4factorypattern.a5withfactorymethodpattern;

import com.deveshkumar.ch4factorypattern.a4withmultiplesimplefactorypattern.factories.SimplePizzaFactory;
import com.deveshkumar.ch4factorypattern.pizzas.Pizza;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 12:20 pm
 */

/**
 * This is the client which request factory(Abstract factory method) to create product(Pizza) for it.
 */
public abstract class PizzaStore {

    /**
     * This method acts as client for the "abstract factory method"(createPizza)
     * and it has no clue which Pizza factory will create which Pizza.
     * It just knows, it will get the pizza from factory, and it will prepare that.
     */
    public final Pizza orderPizza(String type) {
        // we have separated and encapsulated the things which were varied
        // inside the "Abstract factory method".
        // We are now not creating concrete objects inside the client
        // and client has delegated this job to "Abstract factory method".
        Pizza pizza = createPizza(type);


        // Things that remains the same
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
