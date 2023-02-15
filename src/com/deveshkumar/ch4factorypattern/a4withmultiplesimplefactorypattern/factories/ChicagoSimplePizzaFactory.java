package com.deveshkumar.ch4factorypattern.a4withmultiplesimplefactorypattern.factories;

import com.deveshkumar.ch4factorypattern.pizzas.*;
import com.deveshkumar.ch4factorypattern.pizzas.chicagostylepizzas.ChicagoStyleCheesePizza;
import com.deveshkumar.ch4factorypattern.pizzas.chicagostylepizzas.ChicagoStyleClamPizza;
import com.deveshkumar.ch4factorypattern.pizzas.chicagostylepizzas.ChicagoStylePepperoniPizza;
import com.deveshkumar.ch4factorypattern.pizzas.chicagostylepizzas.ChicagoStyleVeggiePizza;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 02:28 pm
 */
public class ChicagoSimplePizzaFactory implements SimplePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
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
