package pl.anicos.patterns.exercises.singleton.eager;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertSame;

public class EagerInitializedSingletonTest {

    @Test
    public void shouldReturnAlwaysTheSameInstance() {
        EagerInitializedSingleton firstCall = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton secondCall = EagerInitializedSingleton.getInstance();

        assertSame(firstCall, secondCall);
    }

    @Test
    public void shouldReturnAlwaysTheSameInstanceInMultiThreadEnviroment() {
        List<EagerInitializedSingleton> result = IntStream.range(0, 3).parallel()
                .mapToObj(i -> EagerInitializedSingleton.getInstance())
                .collect(Collectors.toList());


        assertSame(result.get(0), result.get(1));
        assertSame(result.get(1), result.get(2));
    }
}