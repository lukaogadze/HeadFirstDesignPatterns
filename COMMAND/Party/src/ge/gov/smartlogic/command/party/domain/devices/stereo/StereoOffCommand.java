package ge.gov.smartlogic.command.party.domain.devices.stereo;

import ge.gov.smartlogic.command.party.domain.common.Command;

public class StereoOffCommand implements Command {
	private final Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}

	public void undo() {
		stereo.on();
	}
}
