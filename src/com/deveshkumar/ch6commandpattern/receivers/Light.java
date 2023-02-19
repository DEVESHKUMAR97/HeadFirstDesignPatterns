package com.deveshkumar.ch6commandpattern.receivers;

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
    private String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is On");
    }

    public void off() {
        System.out.println(location + " light is Off");
    }
}
