package com.deveshkumar.ch4factorypattern.a4withmultiplesimplefactorypattern.factories;

import com.deveshkumar.ch4factorypattern.pizzas.*;
import com.deveshkumar.ch4factorypattern.pizzas.newyorkstylepizzas.NYStyleCheesePizza;
import com.deveshkumar.ch4factorypattern.pizzas.newyorkstylepizzas.NYStyleClamPizza;
import com.deveshkumar.ch4factorypattern.pizzas.newyorkstylepizzas.NYStylePepperoniPizza;
import com.deveshkumar.ch4factorypattern.pizzas.newyorkstylepizzas.NYStyleVeggiePizza;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 02:28 pm
 */
public class NYSimplePizzaFactory implements SimplePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
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
