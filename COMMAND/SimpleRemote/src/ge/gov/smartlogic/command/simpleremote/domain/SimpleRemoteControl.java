package ge.gov.smartlogic.command.simpleremote.domain;

//
// This is the invoker
//
public class SimpleRemoteControl {
	private Command slot;
 
	public SimpleRemoteControl(Command slot) {
		this.slot = slot;
	}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public void buttonWasPressed() {
		slot.execute();
	}
}
