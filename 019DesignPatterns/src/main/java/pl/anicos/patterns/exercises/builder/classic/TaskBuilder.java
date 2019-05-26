package pl.anicos.patterns.exercises.builder.classic;

public class TaskBuilder {
    private String description;
    private String name;

    public TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public TaskBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Task createTask() {
        return new Task(description, name);
    }
}