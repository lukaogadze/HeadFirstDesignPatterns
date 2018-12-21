package ge.gov.smartlogic.command.remote.domain.devices.ceilingfan;

import ge.gov.smartlogic.command.remote.domain.common.Command;

public class CeilingFanOffCommand implements Command {
	private final CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
	}
}
