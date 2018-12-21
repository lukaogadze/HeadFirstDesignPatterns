package ge.gov.smartlogic.command.remote.domain.devices.garagedoor;

import ge.gov.smartlogic.command.remote.domain.common.Command;

public class GarageDoorUpCommand implements Command {
	private final GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
