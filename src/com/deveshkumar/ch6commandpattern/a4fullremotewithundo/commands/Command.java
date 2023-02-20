package com.deveshkumar.ch6commandpattern.a4fullremotewithundo.commands;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 17-02-2023
 * @time : 06:28 pm
 */

/**
 * This is the Command Interface contains only one method execute()
 * which will be called by invoker(Waitress/Remote Control).
 */
public interface Command {
    public void execute();
}
