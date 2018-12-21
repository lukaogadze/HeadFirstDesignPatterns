package ge.gov.smartlogic.command.generics.command;

import java.util.function.Consumer;

/**
 * Created by loghadze on 17/12/2018.
 */
public class Command<T> implements Executable {
    private final T target;
    private final Consumer<T> command;

    public Command(T target, Consumer<T> command) {
        this.command = command;
        this.target = target;
    }

    public void execute() {
        command.accept(target);
    }
}
