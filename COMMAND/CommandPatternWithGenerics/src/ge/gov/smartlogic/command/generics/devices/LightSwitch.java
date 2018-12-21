package ge.gov.smartlogic.command.generics.devices;

/**
 * Created by loghadze on 17/12/2018.
 */
public class LightSwitch {
    private boolean isOn;
    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

    public void displayStatus() {
        System.out.println("LightSwitch is " + (isOn ? "On" : "Off"));
    }

}
