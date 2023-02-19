package com.deveshkumar.ch6commandpattern.a1simpleremote.commands;

import com.deveshkumar.ch6commandpattern.a1simpleremote.receivers.GarageDoor;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 20-02-2023
 * @time : 12:04 am
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
