package pl.anicos.patterns.exercises.singleton.billpugh;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertSame;

public class BillPughSingletonTest {

    @Test
    public void shouldReturnAlwaysTheSameInstanceInMultiThreadEnviroment() {
        List<BillPughSingleton> result = IntStream.range(0, 3).parallel()
                .mapToObj(i -> BillPughSingleton.getInstance())
                .collect(Collectors.toList());

        assertSame(result.get(0), result.get(1));
        assertSame(result.get(1), result.get(2));
    }
}