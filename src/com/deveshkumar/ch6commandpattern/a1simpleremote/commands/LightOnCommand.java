package com.deveshkumar.ch6commandpattern.a1simpleremote.commands;

import com.deveshkumar.ch6commandpattern.receivers.Light;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 19-02-2023
 * @time : 11:25 pm
 */

/**
 * This is the command which contains the receiver object for this command
 * and the required actions on that receiver object.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
