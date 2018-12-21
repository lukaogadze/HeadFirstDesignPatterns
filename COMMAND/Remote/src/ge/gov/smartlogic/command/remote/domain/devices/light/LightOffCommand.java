package ge.gov.smartlogic.command.remote.domain.devices.light;

import ge.gov.smartlogic.command.remote.domain.common.Command;

public class LightOffCommand implements Command {
	private final Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
