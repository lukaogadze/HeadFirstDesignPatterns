package ge.gov.smartlogic.command.remote.domain.devices.stereo;

import ge.gov.smartlogic.command.remote.domain.common.Command;

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
}
