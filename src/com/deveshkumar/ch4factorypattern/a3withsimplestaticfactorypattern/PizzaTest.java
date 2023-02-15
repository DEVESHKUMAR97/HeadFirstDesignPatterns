package com.deveshkumar.ch4factorypattern.a3withsimplestaticfactorypattern;

import com.deveshkumar.ch4factorypattern.pizzas.Pizza;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 12:31 pm
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

/*
Preparing Cheese Pizza
Baking Cheese Pizza for 20 minutes.
Cutting Cheese Pizza
Boxing Cheese Pizza
We ordered a Cheese Pizza
---- Cheese Pizza ----
dough: Regular Crust
sauce: Marinara Pizza Sauce
toppings:
Fresh Mozzarella
Parmesan

=====================================

Preparing Veggie Pizza
Baking Veggie Pizza
Cutting Veggie Pizza in stylish way.
Boxing Veggie Pizza
We ordered a Veggie Pizza
---- Veggie Pizza ----
dough: Crust
sauce: Marinara sauce
toppings:
Shredded mozzarella
Grated parmesan
Diced onion
Sliced mushrooms
Sliced red pepper
Sliced black olives

=====================================


 */
