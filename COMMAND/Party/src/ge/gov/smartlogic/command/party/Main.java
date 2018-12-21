package ge.gov.smartlogic.command.party;

import ge.gov.smartlogic.command.party.domain.MacroCommand;
import ge.gov.smartlogic.command.party.domain.RemoteControl;
import ge.gov.smartlogic.command.party.domain.common.Command;
import ge.gov.smartlogic.command.party.domain.devices.hottub.Hottub;
import ge.gov.smartlogic.command.party.domain.devices.hottub.HottubOffCommand;
import ge.gov.smartlogic.command.party.domain.devices.hottub.HottubOnCommand;
import ge.gov.smartlogic.command.party.domain.devices.light.Light;
import ge.gov.smartlogic.command.party.domain.devices.light.LightOffCommand;
import ge.gov.smartlogic.command.party.domain.devices.light.LightOnCommand;
import ge.gov.smartlogic.command.party.domain.devices.stereo.Stereo;
import ge.gov.smartlogic.command.party.domain.devices.stereo.StereoOffCommand;
import ge.gov.smartlogic.command.party.domain.devices.stereo.StereoOnCommand;
import ge.gov.smartlogic.command.party.domain.devices.tv.TV;
import ge.gov.smartlogic.command.party.domain.devices.tv.TVOffCommand;
import ge.gov.smartlogic.command.party.domain.devices.tv.TVOnCommand;

public class Main {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
}
