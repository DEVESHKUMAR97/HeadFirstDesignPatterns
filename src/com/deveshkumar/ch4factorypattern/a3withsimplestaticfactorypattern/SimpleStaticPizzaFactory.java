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
public class SimpleStaticPizzaFactory {
    /**
     * follows the single responsibility principle of only creating the pizza
     * Note: We make this method as static. So, now we don't need to create object for
     * factory. We can directly use this.
     * But this has one disadvantage, now we won't be able to change or override the behavior
     * for subclasses of this factory(moy have in future) because static methods don't override they
     * do method hiding(compile time polymorphism, not runtime polymorphism)
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
