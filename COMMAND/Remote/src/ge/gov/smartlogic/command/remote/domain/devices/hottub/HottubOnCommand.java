package ge.gov.smartlogic.command.remote.domain.devices.hottub;

import ge.gov.smartlogic.command.remote.domain.common.Command;

public class HottubOnCommand implements Command {
	private final Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
}
