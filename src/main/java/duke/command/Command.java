package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

public abstract class Command {
    protected String[] args;

    public Command() {
        this.args = null;
    }

    public Command(String[] args) {
        this.args = args;
    }

    public abstract void execute(TaskList tasks, Ui ui, Storage storage);

    public abstract boolean isExit();
}