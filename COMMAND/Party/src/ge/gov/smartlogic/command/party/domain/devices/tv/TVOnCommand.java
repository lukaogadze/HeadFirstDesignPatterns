package ge.gov.smartlogic.command.party.domain.devices.tv;

import ge.gov.smartlogic.command.party.domain.common.Command;

public class TVOnCommand implements Command {
	private final TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	public void undo() {
		tv.off();
	}
}
