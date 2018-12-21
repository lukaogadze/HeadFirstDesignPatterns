package ge.gov.smartlogic.command.party.domain.devices.ceilingfan;

import ge.gov.smartlogic.command.party.domain.common.Command;

public class CeilingFanMediumCommand implements Command {
	private final CeilingFan ceilingFan;
	private int prevSpeed;


	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
	}
	public void undo() {
		switch (prevSpeed) {
			case CeilingFan.HIGH: 	ceilingFan.high(); break;
			case CeilingFan.MEDIUM: ceilingFan.medium(); break;
			case CeilingFan.LOW: 	ceilingFan.low(); break;
			default: 				ceilingFan.off(); break;
		}
	}
}
