package com.deveshkumar.ch4factorypattern.pizzas;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 11:53 am
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }

    @Override
    public void bake() {
        System.out.println("Baking " + name + " for 20 minutes.");
    }
}
