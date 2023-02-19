package com.deveshkumar.ch6commandpattern.a1simpleremote.receivers;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 20-02-2023
 * @time : 12:01 am
 */
public class GarageDoor {
    public void up() {
        System.out.println("Garage Door is up");
    }

    public void down() {
        System.out.println("Garage Door is down");
    }

    public void stop() {
        System.out.println("Garage Door is stop");
    }

    public void lightOn() {
        System.out.println("Garage Door light is on");
    }

    public void lightff() {
        System.out.println("Garage Door light is off");
    }
}
