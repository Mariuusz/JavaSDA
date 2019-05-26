package pl.anicos.patterns.exercises.command.example1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CommandDemoTest {

    @Test
    public void runDemo() {
        List queue = produceRequests();
        workOffRequests(queue);

    }

    private List produceRequests() {
        List<Command> queue = new ArrayList<>();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }

    private void workOffRequests(List queue) {
        for (Object command : queue) {
            ((Command) command).execute();
        }
    }

}