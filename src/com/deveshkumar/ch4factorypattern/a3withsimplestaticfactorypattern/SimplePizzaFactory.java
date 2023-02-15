package com.deveshkumar.ch4factorypattern.a3withsimplestaticfactorypattern;

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
public class SimplePizzaFactory {
    /**
     * follows the single responsibility principle of only creating the pizza
     */
    public static Pizza createPizza(String type) {
        Pizza pizza = null;

        // we have separated and encapsulated the things which were varied
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
