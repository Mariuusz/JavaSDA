package pl.anicos.patterns.exercises.builder.classic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskBuilderTest {

    @Test
    public void shouldCreateTask() {
        Task task = new TaskBuilder()
                .setDescription("descritpion")
                .setName("name")
                .createTask();

        assertEquals("descritpion", task.getDescription());
        assertEquals("name", task.getName());
    }
}