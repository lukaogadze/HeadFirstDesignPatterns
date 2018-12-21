package ge.gov.smartlogic.command.undo.domain;

public class DimmerLightOnCommand implements Command {
	private final Light light;
	private int prevLevel;

	public DimmerLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		prevLevel = light.getLevel();
		light.dim(75);
	}

	public void undo() {
		light.dim(prevLevel);
	}
}
