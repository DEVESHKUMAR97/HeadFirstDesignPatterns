package com.deveshkumar.ch4factorypattern.a1withoutpattern;

import com.deveshkumar.ch4factorypattern.pizzas.Pizza;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 12:08 pm
 */
public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);
        System.out.println("=====================================");
        System.out.println();

        pizza = pizzaStore.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);
        System.out.println("=====================================");
        System.out.println();
    }
}
