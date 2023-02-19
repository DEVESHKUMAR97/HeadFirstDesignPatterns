package com.deveshkumar.ch6commandpattern.a1simpleremote.receivers;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 19-02-2023
 * @time : 11:28 pm
 */

/**
 * This is the receiver object(Cook/Vendor classes) which knows
 * how to actually do actions(like turn on/off the light).
 */
public class Light {
    public void on() {
        System.out.println("Light is On");
    }

    public void off() {
        System.out.println("Light is Off");
    }
}
