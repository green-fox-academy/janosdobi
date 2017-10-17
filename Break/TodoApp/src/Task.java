public class Task {

    private boolean completed;
    private String name;
    private int id;

    public Task(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setCompleted() {
        this.completed = true;
    }

    public boolean getCompleted() {
        return completed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " - " + (!completed ? "[ ] " : "[x] ") + name;
    }
}