package com.deveshkumar.ch4factorypattern.a1withoutpattern;

import com.deveshkumar.ch4factorypattern.pizzas.*;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 12:00 pm
 */
public class PizzaStore {

    /**
     * this  method is not following the single responsibility principle
     * we are creating the pizza as well as preparing the pizza
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        // Things that varies
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        // Things that remains the same
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }
}
