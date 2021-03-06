package ge.gov.smartlogic.command.party.domain.devices.light;

import ge.gov.smartlogic.command.party.domain.common.Command;

public class LightOffCommand implements Command {
	private final Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}

	public void undo() {
		light.on();
	}
}
