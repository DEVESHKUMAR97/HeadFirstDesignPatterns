package com.deveshkumar.ch4factorypattern.a5withfactorymethodpattern.factories;

import com.deveshkumar.ch4factorypattern.a5withfactorymethodpattern.PizzaStore;
import com.deveshkumar.ch4factorypattern.pizzas.Pizza;
import com.deveshkumar.ch4factorypattern.pizzas.chicagostylepizzas.ChicagoStyleCheesePizza;
import com.deveshkumar.ch4factorypattern.pizzas.chicagostylepizzas.ChicagoStyleClamPizza;
import com.deveshkumar.ch4factorypattern.pizzas.chicagostylepizzas.ChicagoStylePepperoniPizza;
import com.deveshkumar.ch4factorypattern.pizzas.chicagostylepizzas.ChicagoStyleVeggiePizza;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 06:00 pm
 */

/**
 * This is the factory which generates the products(Pizzas) for client(like PizzaStore).
 * Note, since now this factory is a subclass of its client(PizzaStore). So, there can be only one
 * client for this factory while in simple factory approach there can be multiple clients for a factory.
 */
public class ChicagoPizzaStore extends PizzaStore {

    /**
     * This is the "method factory" which generates the products(Pizzas) for client(like PizzaStore).
     * This method follows the single responsibility principle of only creating the pizza.
     */
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        // we have separated and encapsulated the things which were varied
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
