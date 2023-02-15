package com.deveshkumar.ch4factorypattern.a4withmultiplesimplefactorypattern.factories;

import com.deveshkumar.ch4factorypattern.pizzas.*;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 12:22 pm
 */

/**
 * This is the factory which generates the products(Pizzas) for client(like PizzaStore)
 */
public interface SimplePizzaFactory {
    /**
     * follows the single responsibility principle of only creating the pizza
     */
    public Pizza createPizza(String type);
}
