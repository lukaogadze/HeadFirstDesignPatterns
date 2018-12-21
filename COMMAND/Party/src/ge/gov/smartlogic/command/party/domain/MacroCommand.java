package ge.gov.smartlogic.command.party.domain;

import ge.gov.smartlogic.command.party.domain.common.Command;

public class MacroCommand implements Command {
	private final Command[] commands;
 
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}
 
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}
 
    /**
     * NOTE:  these commands have to be done backwards to ensure 
     * proper undo functionality
     */
	public void undo() {
		for (int i = commands.length -1; i >= 0; i--) {
			commands[i].undo();
		}
	}
}

