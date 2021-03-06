package ge.gov.smartlogic.command.remote.domain.devices.light;

import ge.gov.smartlogic.command.remote.domain.common.Command;

public class LightOnCommand implements Command {
	private final Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
