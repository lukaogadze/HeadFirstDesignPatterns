package ge.gov.smartlogic.command.party.domain.devices.stereo;

import ge.gov.smartlogic.command.party.domain.common.Command;

public class StereoOnWithCDCommand implements Command {
	private final Stereo stereo;
 
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	public void undo() {
		stereo.off();
	}
}
