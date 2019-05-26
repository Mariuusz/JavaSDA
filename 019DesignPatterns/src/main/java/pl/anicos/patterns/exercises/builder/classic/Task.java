package pl.anicos.patterns.exercises.builder.classic;

public class Task {
    private final String description;
    private final String name;

    Task(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
