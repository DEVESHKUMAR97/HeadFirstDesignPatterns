package com.deveshkumar.ch4factorypattern.pizzas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 15-02-2023
 * @time : 11:04 am
 */

/**
 * Pizza is generic type of product which is generated by the factory.
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    /**
     * These are some default useful implementations for pizza that can be overridden by concrete pizza
     */
    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }


    public String getName() {
        return name;
    }
    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append("dough: " + dough + "\n");
        display.append("sauce: " + sauce + "\n");
        display.append("toppings:\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

}
