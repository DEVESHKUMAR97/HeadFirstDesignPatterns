package com.deveshkumar.ch4factorypattern.a5withfactorymethodpattern.factories;

import com.deveshkumar.ch4factorypattern.a5withfactorymethodpattern.PizzaStore;
import com.deveshkumar.ch4factorypattern.pizzas.Pizza;
import com.deveshkumar.ch4factorypattern.pizzas.newyorkstylepizzas.NYStyleCheesePizza;
import com.deveshkumar.ch4factorypattern.pizzas.newyorkstylepizzas.NYStyleClamPizza;
import com.deveshkumar.ch4factorypattern.pizzas.newyorkstylepizzas.NYStylePepperoniPizza;
import com.deveshkumar.ch4factorypattern.pizzas.newyorkstylepizzas.NYStyleVeggiePizza;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 05:49 pm
 */

/**
 * This is the factory which generates the products(Pizzas) for client(like PizzaStore).
 * Note, since now this factory is a subclass of its client(PizzaStore). So, there can be only one
 * client for this factory while in simple factory approach there can be multiple clients for a factory.
 */
public class NYPizzaStore extends PizzaStore {

    /**
     * This is the "method factory" which generates the products(Pizzas) for client(like PizzaStore).
     * This method follows the single responsibility principle of only creating the pizza.
     */
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        // we have separated and encapsulated the things which were varied
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
