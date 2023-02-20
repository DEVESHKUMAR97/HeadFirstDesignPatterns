package com.deveshkumar.ch6commandpattern.a4fullremotewithundo.commands;

import com.deveshkumar.ch6commandpattern.receivers.GarageDoor;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 20-02-2023
 * @time : 02:24 pm
 */
public class GarageDoorCloseCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
        garageDoor.lightOff();
        garageDoor.down();
    }
}
