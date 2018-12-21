package ge.gov.smartlogic.command.generics;

import ge.gov.smartlogic.command.generics.command.Executable;

/**
 * Created by loghadze on 17/12/2018.
 */
public class SimpleRemoteControl {
    private final Executable executable;

    public SimpleRemoteControl(Executable executable) {
        this.executable = executable;
    }

    public void buttonWasPressed()
    {
        executable.execute();
    }
}
