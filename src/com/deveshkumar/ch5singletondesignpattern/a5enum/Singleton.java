package com.deveshkumar.ch5singletondesignpattern.a5enum;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 14-02-2023
 * @time : 03:24 pm
 */

public enum Singleton {
    UNIQUE_INSTANCE;

    // Other useful variables(can be static or non-static)

    /**
     * is this approach equivalent to static initialization approach
     * <a href="https://stackoverflow.com/questions/75455307/static-initialization-vs-enum-approach-for-singleton-pattern">
     *     stack overflow</a>
     */

    public static Singleton getInstance() {
        return UNIQUE_INSTANCE;
    }

    // Other useful methods(can be static or non-static)
}
