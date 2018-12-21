package ge.gov.smartlogic.command.remote.domain.devices.ceilingfan;

import ge.gov.smartlogic.command.remote.domain.common.Command;

public class CeilingFanOnCommand implements Command {
	private final CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
}
