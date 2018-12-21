package ge.gov.smartlogic.command.remote.domain.devices.light;

import ge.gov.smartlogic.command.remote.domain.common.Command;

public class LivingroomLightOnCommand implements Command {
	private final Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
