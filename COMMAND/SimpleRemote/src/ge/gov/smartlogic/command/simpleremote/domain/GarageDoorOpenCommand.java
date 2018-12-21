package ge.gov.smartlogic.command.simpleremote.domain;

public class GarageDoorOpenCommand implements Command {
	private final GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
