package ge.gov.smartlogic.command.party.domain.devices.hottub;

import ge.gov.smartlogic.command.party.domain.common.Command;

public class HottubOffCommand implements Command {
	private final Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.setTemperature(98);
		hottub.off();
	}
	public void undo() {
		hottub.on();
	}
}
