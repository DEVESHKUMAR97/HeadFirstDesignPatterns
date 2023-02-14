package com.deveshkumar.ch5singletondesignpattern.a1classic;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 14-02-2023
 * @time : 03:24 pm
 */
public class Singleton {
    private static Singleton uniqueInstance;

    // Other useful variables(can be static or non-static)

    private Singleton() {}

    /**
     * this approach is not thread safe
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Other useful methods(can be static or non-static)
}
