package com.deveshkumar.ch6commandpattern.a3fullremote.commands;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 20-02-2023
 * @time : 02:36 pm
 */
public class MacroCommand implements Command {
    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }
}
