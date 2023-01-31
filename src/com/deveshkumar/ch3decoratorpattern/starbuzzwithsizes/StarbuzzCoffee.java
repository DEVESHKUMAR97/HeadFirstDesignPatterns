package com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes;

import com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.components.Beverage;
import com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.components.DarkRoast;
import com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.components.HouseBlend;
import com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.decorators.Mocha;
import com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.decorators.Soy;
import com.deveshkumar.ch3decoratorpattern.starbuzzwithsizes.decorators.Whip;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 31-01-2023
 * @time : 04:44 am
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        System.out.println("==================");

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        System.out.println("==================");

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 =  new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
        System.out.println("==================");

    }
}
