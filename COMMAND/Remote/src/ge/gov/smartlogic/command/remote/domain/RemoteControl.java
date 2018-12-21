package ge.gov.smartlogic.command.remote.domain;

import ge.gov.smartlogic.command.remote.domain.common.Command;
import ge.gov.smartlogic.command.remote.domain.common.NoCommand;

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
 
		Command noCommand = new NoCommand();
		for (int i = 0; i < slotCount; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
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

	@Override
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff
					.append("[slot ").append(i)
					.append("] ")
					.append(onCommands[i].getClass().getName())
					.append("    ")
					.append(offCommands[i].getClass().getName())
					.append("\n");
		}
		return stringBuff.toString();
	}
}
