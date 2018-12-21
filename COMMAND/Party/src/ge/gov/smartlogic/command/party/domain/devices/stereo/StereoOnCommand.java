package ge.gov.smartlogic.command.party.domain.devices.stereo;

import ge.gov.smartlogic.command.party.domain.common.Command;

public class StereoOnCommand implements Command {
	private final Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
	}

	public void undo() {
		stereo.off();
	}
}
