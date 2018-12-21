package ge.gov.smartlogic.command.generics;

import ge.gov.smartlogic.command.generics.command.Command;
import ge.gov.smartlogic.command.generics.command.Executable;
import ge.gov.smartlogic.command.generics.devices.LightSwitch;

public class Main {

    public static void main(String[] args) {
        LightSwitch lightSwitch = new LightSwitch();

        Executable lightOn = new Command<>(lightSwitch, l -> l.on());
        Executable lightOff = new Command<>(lightSwitch, l -> l.off());

        SimpleRemoteControl simpleRemoteControlOne = new SimpleRemoteControl(lightOn);
        simpleRemoteControlOne.buttonWasPressed();
        lightSwitch.displayStatus();

        SimpleRemoteControl simpleRemoteControlTwo = new SimpleRemoteControl(lightOff);
        simpleRemoteControlTwo.buttonWasPressed();
        lightSwitch.displayStatus();
    }
}
