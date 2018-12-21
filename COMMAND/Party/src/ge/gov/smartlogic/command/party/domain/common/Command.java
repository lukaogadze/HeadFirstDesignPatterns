package ge.gov.smartlogic.command.party.domain.common;

public interface Command {
	public void execute();
	public void undo();
}
