package ge.gov.smartlogic.command.remote.domain.devices.hottub;

import ge.gov.smartlogic.command.remote.domain.common.Command;

public class HottubOffCommand implements Command {
	private final Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
}
