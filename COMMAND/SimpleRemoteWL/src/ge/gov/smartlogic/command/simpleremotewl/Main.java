package ge.gov.smartlogic.command.simpleremotewl;


public class Main {

    public static void main(String[] args) {
        // performTest();
    }

    private static void performTest() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        remote.setCommand(light::on);
        remote.buttonWasPressed();
        remote.setCommand(garageDoor::up);
        remote.buttonWasPressed();
        remote.setCommand(garageDoor::lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoor::lightOff);
        remote.buttonWasPressed();
    }
}
