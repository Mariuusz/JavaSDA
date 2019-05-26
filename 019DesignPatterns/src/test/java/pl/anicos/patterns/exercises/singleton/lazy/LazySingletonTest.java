package pl.anicos.patterns.exercises.singleton.lazy;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertSame;

public class LazySingletonTest {

    @Test
    public void shouldReturnAlwaysTheSameInstance() {
        LazySingleton firstCall = LazySingleton.getInstance();
        LazySingleton secondCall = LazySingleton.getInstance();

        assertSame(firstCall, secondCall);
    }

    @Test
    public void shouldReturnAlwaysTheSameInstanceInMultiThreadEnviroment() {
        List<LazySingleton> result = IntStream.range(0, 3).parallel()
                .mapToObj(i -> LazySingleton.getInstance())
                .collect(Collectors.toList());


        assertSame(result.get(0), result.get(1));
        assertSame(result.get(1), result.get(2));
    }
}