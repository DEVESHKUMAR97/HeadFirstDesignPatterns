package com.deveshkumar.ch6commandpattern.a4fullremotewithundo.commands;

import com.deveshkumar.ch6commandpattern.receivers.CeilingFan;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 20-02-2023
 * @time : 02:03 pm
 */
public class CeilingFanMediumCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.medium();
    }
}
