package com.deveshkumar.ch6commandpattern.a3fullremote.commands;

import com.deveshkumar.ch6commandpattern.receivers.CeilingFan;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 20-02-2023
 * @time : 01:59 pm
 */
public class CeilingFanOffCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        ceilingFan.off();
    }
}
