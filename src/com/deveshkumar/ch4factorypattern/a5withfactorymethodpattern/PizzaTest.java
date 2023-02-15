package com.deveshkumar.ch4factorypattern.a5withfactorymethodpattern;

import com.deveshkumar.ch4factorypattern.a5withfactorymethodpattern.factories.ChicagoPizzaStore;
import com.deveshkumar.ch4factorypattern.a5withfactorymethodpattern.factories.NYPizzaStore;
import com.deveshkumar.ch4factorypattern.pizzas.Pizza;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 12:31 pm
 */
public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);
        System.out.println("=====================================");
        System.out.println();


        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        pizza = chicagoPizzaStore.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);
        System.out.println("=====================================");
        System.out.println();

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);
        System.out.println("=====================================");
        System.out.println();
    }
}

/*
Preparing NY Style Sauce and Cheese Pizza
Baking NY Style Sauce and Cheese Pizza
Cutting NY Style Sauce and Cheese Pizza
Boxing NY Style Sauce and Cheese Pizza
We ordered a NY Style Sauce and Cheese Pizza
---- NY Style Sauce and Cheese Pizza ----
dough: Thin Crust Dough
sauce: Marinara Sauce
toppings:
Grated Reggiano Cheese

=====================================

Preparing Chicago Deep Dish Veggie Pizza
Baking Chicago Deep Dish Veggie Pizza
Cutting the Chicago Deep Dish Veggie Pizza pizza into square slices
Boxing Chicago Deep Dish Veggie Pizza
We ordered a Chicago Deep Dish Veggie Pizza
---- Chicago Deep Dish Veggie Pizza ----
dough: Extra Thick Crust Dough
sauce: Plum Tomato Sauce
toppings:
Shredded Mozzarella Cheese
Black Olives
Spinach
Eggplant

=====================================

Preparing Chicago Style Deep Dish Cheese Pizza
Baking Chicago Style Deep Dish Cheese Pizza
Cutting the Chicago Style Deep Dish Cheese Pizza pizza into square slices
Boxing Chicago Style Deep Dish Cheese Pizza
We ordered a Chicago Style Deep Dish Cheese Pizza
---- Chicago Style Deep Dish Cheese Pizza ----
dough: Extra Thick Crust Dough
sauce: Plum Tomato Sauce
toppings:
Shredded Mozzarella Cheese

=====================================


 */
