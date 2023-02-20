package com.deveshkumar.ch6commandpattern.a4fullremotewithundo;

import com.deveshkumar.ch6commandpattern.a4fullremotewithundo.commands.Command;
import com.deveshkumar.ch6commandpattern.a4fullremotewithundo.commands.NoCommand;


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
public class FullRemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public FullRemoteControl(int numberOfSlots) {
        onCommands = new Command[numberOfSlots];
        offCommands = new Command[numberOfSlots];
        Command noCommand = new NoCommand();
        for(int i = 0; i < numberOfSlots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        System.out.println("--- On button was pushed at slot " + slot + " ---");
        onCommands[slot].execute();
        System.out.println();
    }

    public void offButtonWasPushed(int slot) {
        System.out.println("--- Off button was pushed at slot " + slot + " ---");
        offCommands[slot].execute();
        System.out.println();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName()
                    + "    " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuff.toString();
    }
}
