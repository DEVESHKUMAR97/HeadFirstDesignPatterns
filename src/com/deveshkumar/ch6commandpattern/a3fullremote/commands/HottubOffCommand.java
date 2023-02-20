package com.deveshkumar.ch6commandpattern.a3fullremote.commands;

import com.deveshkumar.ch6commandpattern.receivers.Hottub;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 20-02-2023
 * @time : 02:16 pm
 */
public class HottubOffCommand implements Command {
    private Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOff();
        hottub.setTemperature(98);
        hottub.off();
    }
}
