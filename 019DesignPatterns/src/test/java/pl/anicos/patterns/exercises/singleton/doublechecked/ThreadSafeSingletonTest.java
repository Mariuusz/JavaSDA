package pl.anicos.patterns.exercises.singleton.doublechecked;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertSame;

public class ThreadSafeSingletonTest {

    @Test
    public void shouldReturnAlwaysTheSameInstanceInMultiThreadEnviroment() {
        List<ThreadSafeSingleton> result = IntStream.range(0, 5).parallel()
                .mapToObj(i -> ThreadSafeSingleton.getInstance())
                .collect(Collectors.toList());


        assertSame(result.get(0), result.get(1));
        assertSame(result.get(1), result.get(2));
    }

    @Test
    public void shouldReturnAlwaysTheSameInstanceInMultiThreadEnviroment_dubleChecked() {
        List<ThreadSafeSingleton> result = IntStream.range(0, 5).parallel()
                .mapToObj(i -> ThreadSafeSingleton.getInstanceUsingDoubleLocking())
                .collect(Collectors.toList());


        assertSame(result.get(0), result.get(1));
        assertSame(result.get(1), result.get(2));
    }
}