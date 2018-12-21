package ge.gov.smartlogic.command.party.domain.devices.hottub;

import ge.gov.smartlogic.command.party.domain.common.Command;

public class HottubOnCommand implements Command {
	private final Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	public void execute() {
		hottub.on();
		hottub.setTemperature(104);
		hottub.circulate();
	}
	public void undo() {
		hottub.off();
	}
}
