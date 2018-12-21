package ge.gov.smartlogic.command.undo.domain;

public class LightOffCommand implements Command {
	private final Light light;
	private int level;
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
        level = light.getLevel();
		light.off();
	}
 
	public void undo() {
		light.dim(level);
	}
}
