package com.deveshkumar.ch6commandpattern.a4fullremotewithundo.commands;

import com.deveshkumar.ch6commandpattern.receivers.CeilingFan;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 20-02-2023
 * @time : 01:59 pm
 */
public class CeilingFanOffCommand implements Command {
    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if(prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if(prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else {
            ceilingFan.off();
        }

    }
}
