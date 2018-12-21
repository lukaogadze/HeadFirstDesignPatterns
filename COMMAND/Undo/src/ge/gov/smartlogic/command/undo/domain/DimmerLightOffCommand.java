package ge.gov.smartlogic.command.undo.domain;

public class DimmerLightOffCommand implements Command {
	private final Light light;
	private int prevLevel;

	public DimmerLightOffCommand(Light light) {
		this.light = light;
		prevLevel = 100;
	}

	public void execute() {
		prevLevel = light.getLevel();
		light.off();
	}

	public void undo() {
		light.dim(prevLevel);
	}
}
