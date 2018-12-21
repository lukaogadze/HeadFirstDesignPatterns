package ge.gov.smartlogic.command.simpleremote;

import ge.gov.smartlogic.command.simpleremote.domain.GarageDoor;
import ge.gov.smartlogic.command.simpleremote.domain.GarageDoorOpenCommand;
import ge.gov.smartlogic.command.simpleremote.domain.Light;
import ge.gov.smartlogic.command.simpleremote.domain.LightOnCommand;
import ge.gov.smartlogic.command.simpleremote.domain.SimpleRemoteControl;

public class Main {

    public static void main(String[] args) {

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen =
                new GarageDoorOpenCommand(garageDoor);

        SimpleRemoteControl remote = new SimpleRemoteControl(lightOn);

        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
