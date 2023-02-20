package com.deveshkumar.ch6commandpattern.a3fullremote.commands;

import com.deveshkumar.ch6commandpattern.receivers.Hottub;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 20-02-2023
 * @time : 02:13 pm
 */
public class HottubOnCommand implements Command {
    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
        hottub.setTemperature(104);
        hottub.jetsOn();
        hottub.circulate();
    }
}
