package com.deveshkumar.ch5singletondesignpattern.b1chocolatecompany;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 14-02-2023
 * @time : 05:17 pm
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getChocolateBoiler() {
        if (chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoiler == null) {
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }

    public void fill() {
        if(empty) {
            System.out.println("Filling the boiler");
            empty = false;
        } else {
            System.out.println("Can't fill since boiler is already filled.");
        }
    }

    public void boil() {
        if(!empty) {
            if(!boiled) {
                System.out.println("Boiling...");
                boiled = true;
            } else {
                System.out.println("Can't boil since already boiled.");
            }
        } else {
            System.out.println("Can't boil since boiler is empty");
        }
    }

    public void drain() {
        if(!empty) {
            if(boiled) {
                System.out.println("Draining the boiler");
                empty = true;
                boiled = false;
            } else {
                System.out.println("Can't drain since not boiled");
            }
        } else {
            System.out.println("Can't drain since boiler is empty");
        }

    }

}
