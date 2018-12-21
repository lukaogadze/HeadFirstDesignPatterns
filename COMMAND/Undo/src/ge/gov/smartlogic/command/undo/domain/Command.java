package ge.gov.smartlogic.command.undo.domain;

public interface Command {
	public void execute();
	public void undo();
}
