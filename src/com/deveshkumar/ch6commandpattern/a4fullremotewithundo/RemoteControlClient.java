package com.deveshkumar.ch6commandpattern.a4fullremotewithundo;

import com.deveshkumar.ch6commandpattern.a4fullremotewithundo.commands.*;
import com.deveshkumar.ch6commandpattern.receivers.*;

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
 */
public class RemoteControlClient {
    public static void main(String[] args) {
        // 1. Preparation steps
        // 1.1 Creating the remote control
        FullRemoteControl remoteControl = new FullRemoteControl(7);

        // 1.2 Creating the Vendor class objects
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan livingRoomFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Main house");
        Hottub hottub = new Hottub();
        Stereo stereo = new Stereo("Living Room");
        TV livingRoomTV = new TV("Living Room");
        TV bedRoomTV = new TV("Bed Room");


        // 2. Creating the command objects
        Command livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        Command kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        Command kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(livingRoomFan);
        Command ceilingFanLowCommand = new CeilingFanLowCommand(livingRoomFan);
        Command ceilingFanMediumCommand = new CeilingFanMediumCommand(livingRoomFan);
        Command ceilingFanHighCommand = new CeilingFanHighCommand(livingRoomFan);
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        Command hottubOnCommand = new HottubOnCommand(hottub);
        Command hottubOffCommand = new HottubOffCommand(hottub);
        Command stereoOnCommand = new StereoOnCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);
        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        Command livingRoomTVOnCommand = new TVOnCommand(livingRoomTV);
        Command livingRoomTVOffCommand = new TVOffCommand(livingRoomTV);
        Command bedRoomTVOnCommand = new TVOnCommand(bedRoomTV);
        Command bedRoomTVOffCommand = new TVOffCommand(bedRoomTV);

        Command[] partyOn = { livingRoomLightOnCommand, stereoOnCommand, livingRoomTVOnCommand, hottubOnCommand};
        Command[] partyOff = { hottubOffCommand, livingRoomTVOffCommand, stereoOffCommand, livingRoomLightOffCommand};
        Command partyOnCommand = new MacroCommand(partyOn);
        Command partyOffCommand = new MacroCommand(partyOff);


        // 3. Setting the command objects to the remote control slots
        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stereoOnCommand, stereoOffCommand);
        remoteControl.setCommand(4, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(5, hottubOnCommand, hottubOffCommand);
        remoteControl.setCommand(6, livingRoomTVOnCommand, livingRoomTVOffCommand);

        System.out.println(remoteControl);


        // 4. Pressing the buttons on remote to invoke the execute method of the command objects
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(4);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);
        remoteControl.undoButtonWasPushed();

        // 5. Mapping another command objects to the same of remote control
        remoteControl.setCommand(1, partyOnCommand, partyOffCommand);
        remoteControl.setCommand(2, ceilingFanMediumCommand, ceilingFanLowCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);
        remoteControl.setCommand(6, bedRoomTVOnCommand, bedRoomTVOffCommand);

        System.out.println(remoteControl);

        // 6. Again, pressing the button on remote to invoke the execute method of the command object
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);
        remoteControl.undoButtonWasPushed();


    }
}
