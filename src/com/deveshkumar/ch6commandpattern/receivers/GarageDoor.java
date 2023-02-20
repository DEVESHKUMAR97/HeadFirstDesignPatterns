package com.deveshkumar.ch6commandpattern.receivers;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 20-02-2023
 * @time : 12:01 am
 */
public class GarageDoor {
    private String location = "";

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " garage Door is up");
    }

    public void down() {
        System.out.println(location + " garage Door is down");
    }

    public void stop() {
        System.out.println(location + " garage Door is stop");
    }

    public void lightOn() {
        System.out.println(location + " garage Door light is on");
    }

    public void lightOff() {
        System.out.println(location + " garage Door light is off");
    }
}
