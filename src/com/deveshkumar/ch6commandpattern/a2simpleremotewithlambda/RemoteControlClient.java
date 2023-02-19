package com.deveshkumar.ch6commandpattern.a2simpleremotewithlambda;

import com.deveshkumar.ch6commandpattern.receivers.GarageDoor;
import com.deveshkumar.ch6commandpattern.receivers.Light;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 19-02-2023
 * @time : 11:44 pm
 */

/**
 * This is the client(Customers/Users) who creates the command object
 * and map that with invoker slots by setCommand.
 * Later, it will press the button, then invoker will invoke the execute method of command object.
 *
 * NOTE: In this approach, we are not creating any concrete command class.
 * We will be passing lambda expressions as functions object.
 * this approach will only work when Command interface has only one abstract method.
 */
public class RemoteControlClient {
    public static void main(String[] args) {
        // 1. Preparation steps
        // 1.1 Creating the remote control
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        // 1.2 Creating the Vendor class objects
        Light light = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor("Main house");


        // 2. Not creating the command objects, will be passing lambda expressions as functions object
        // NOTE: this approach will only work when Command interface has only one abstract method.
//        Command lightOnCommand = new LightOnCommand(light);
//        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);


        // 3. Setting the command object to the remote control slot
        remoteControl.setSlot(light::on);


        // 4. Pressing the button on remote to invoke the execute method of the command object(LightOnCommand)
        remoteControl.buttonWasPressed();

        // 5. Mapping another command object to the same of remote control
        remoteControl.setSlot(garageDoor::up);

        // 6. Again, pressing the button on remote to invoke the execute method of the command object(GarageDoorOpenCommand)
        remoteControl.buttonWasPressed();


    }
}
