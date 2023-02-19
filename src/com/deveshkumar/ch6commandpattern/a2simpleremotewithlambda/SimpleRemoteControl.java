package com.deveshkumar.ch6commandpattern.a2simpleremotewithlambda;


/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 19-02-2023
 * @time : 11:34 pm
 */

/**
 * This is the invoker(requester/waitress/remote control)
 * which have slots and each slot can be mapped(Can also be changed or discard later)
 * by any command object.
 * It just invokes the execute method of the corresponding command object
 * whenever client ask it to do by pressing the button.
 * So, it doesn't know which actions will be performed, who will perform and how it will be performed.
 * So, it decoupled from the actions and receiver objects.
 */
public class SimpleRemoteControl {
    Command slot;

    public void setSlot(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
