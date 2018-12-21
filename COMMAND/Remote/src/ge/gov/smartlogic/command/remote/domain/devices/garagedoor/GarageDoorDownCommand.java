package ge.gov.smartlogic.command.remote.domain.devices.garagedoor;

import ge.gov.smartlogic.command.remote.domain.common.Command;

public class GarageDoorDownCommand implements Command {
	private final GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
