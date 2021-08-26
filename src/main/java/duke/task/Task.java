package duke.task;

/**
 * This class represents a {@code Task}.
 * 
 * @author Eizabeth Chow
 */
public class Task {
    private boolean isDone = false;
    private final String title;

    /**
     * Constructs a new {@code Task} with the given title.
     *
     * @param title Title of Task
     */
    public Task(String title) {
        this.title = title.trim();
    }

    /**
     * Constructs a new {@code Task} with the given title and status.
     *
     * @param title  Title of {@code Task}
     * @param isDone Status of {@code Task}
     */
    public Task(String title, boolean isDone) {
        this.title = title.trim();
        this.isDone = isDone;
    }

    /**
     * Returns "X" if task is done, else " ".
     *
     * @return String "X" or " ".
     */
    private String getStatusIcon() {
        return isDone ? "X" : " ";
    }

    /**
     * Converts boolean isDone to int.
     * 
     * @return 1 if task is done, 0 otherwise.
     */
    private int convertIsDoneToInt() {
        return isDone ? 1 : 0;
    }

    /**
     * Returns whether the task is done.
     *
     * @return {@code true} if the task is done, {@code false} otherwise.
     */
    public boolean isDone() {
        return isDone;
    }

    /**
     * Marks the {@code Task} as done.
     * 
     * @return {@code false} if {@code Task} is done, {@code true} otherwise.
     */
    public boolean markAsDone() {
        if (isDone) {
            return false;
        } else {
            isDone = true;
            return true;
        }
    }

    /**
     * Returns a {@code String} containing the description of the {@code Task} to be
     * saved to storage.
     * 
     * @return a {@code String} representation of {@code Task} for file storage.
     */
    public String toFileString() {
        return String.format("%d | %s", convertIsDoneToInt(), title);
    }

    /**
     * Return a {@code String} format of the {@code Task} containing the status and
     * title of {@code Task}.
     *
     * @return String representation of {@code Task}.
     */
    public String toString() {
        return String.format("[%s] %s", getStatusIcon(), title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Task) {
            Task otherTask = (Task) other;
            return (this.isDone == otherTask.isDone) && this.title.equals(otherTask.title);
        }
        return false;
    }
}
