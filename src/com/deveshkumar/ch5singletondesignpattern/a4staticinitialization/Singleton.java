package com.deveshkumar.ch5singletondesignpattern.a4staticinitialization;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 14-02-2023
 * @time : 03:24 pm
 */

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    // Other useful variables(can be static or non-static)

    private Singleton() {}

    /**
     * this approach is thread safe as well as optimized, but it will always create object whether you are using
     * it or not.
     *
     * There may be some scenario where you are only using some other static methods of Singleton class, and you don't
     * need to create object for that but since it is static initialization, it will still create and assign object
     * at the time of class loading.
     */
    public static Singleton getInstance() {
        return uniqueInstance;
    }

    // Other useful methods(can be static or non-static)
}
