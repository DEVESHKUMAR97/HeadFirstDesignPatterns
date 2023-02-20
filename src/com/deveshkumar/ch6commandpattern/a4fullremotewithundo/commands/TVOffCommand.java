package com.deveshkumar.ch6commandpattern.a4fullremotewithundo.commands;

import com.deveshkumar.ch6commandpattern.receivers.TV;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 20-02-2023
 * @time : 02:34 pm
 */
public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv= tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
