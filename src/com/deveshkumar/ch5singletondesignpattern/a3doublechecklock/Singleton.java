package com.deveshkumar.ch5singletondesignpattern.a3doublechecklock;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 14-02-2023
 * @time : 03:24 pm
 */

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class Singleton {
    private volatile static Singleton uniqueInstance;
    /**
     * here volatile keyword is important, if we will not use this then we might get some partially constructed objects.
     * <a href="https://stackoverflow.com/questions/7855700/why-is-volatile-used-in-double-checked-locking">Stack overflow</a>
     */

    // Other useful variables(can be static or non-static)

    private Singleton() {}

    /**
     * this approach is thread safe as well as optimized.
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // Other useful methods(can be static or non-static)
}
