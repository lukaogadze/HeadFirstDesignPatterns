package ge.gov.smartlogic.command.remotewl.domain;

//
// This is the invoker
//
public class RemoteControl {
	private final Command[] onCommands;
	private final Command[] offCommands;
 
	public RemoteControl() {
		int slotCount = 7;
		onCommands = new Command[slotCount];
		offCommands = new Command[slotCount];
 
		for (int i = 0; i < slotCount; i++) {
			onCommands[i] = () -> { };
			offCommands[i] = () -> { };
		}
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
  
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}

}
