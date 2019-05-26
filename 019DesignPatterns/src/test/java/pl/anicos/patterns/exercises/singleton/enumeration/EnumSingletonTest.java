package pl.anicos.patterns.exercises.singleton.enumeration;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertSame;

public class EnumSingletonTest {

    @Test
    public void shouldReturnAlwaysTheSameInstanceInMultiThreadEnviroment() {
        List<EnumSingleton> result = IntStream.range(0, 3).parallel()
                .mapToObj(i -> EnumSingleton.INSTANCE)
                .collect(Collectors.toList());

        assertSame(result.get(0), result.get(1));
        assertSame(result.get(1), result.get(2));
    }
}