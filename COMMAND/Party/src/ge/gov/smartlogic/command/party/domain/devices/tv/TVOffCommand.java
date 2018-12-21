package ge.gov.smartlogic.command.party.domain.devices.tv;

import ge.gov.smartlogic.command.party.domain.common.Command;

public class TVOffCommand implements Command {
	private final TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
