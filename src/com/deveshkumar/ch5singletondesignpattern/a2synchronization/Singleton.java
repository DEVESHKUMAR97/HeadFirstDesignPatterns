package com.deveshkumar.ch5singletondesignpattern.a2synchronization;

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
     * this approach is thread safe since we have synchronized the method.
     * now, only 1 thread will go inside this method at a time and others will wait until the first finish its job.
     * So, when the very first thread will go inside it will create the object and assign it to variable and later for
     * all the threads the variable will be not null and will return the same object.
     *
     * But this approach is not efficient because it will synchronize every method call, but we need synchronization
     * only for the 1st thread.
     *
     * In next approach we will be optimizing it by double check lock mechanism.
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Other useful methods(can be static or non-static)
}
