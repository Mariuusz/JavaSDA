import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.sda.Calculator;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class CalcTests {
    private static Calculator calculator;
    private int number;

    @Parameterized.Parameters(name = "{index} : isEven {0}")
    public static Iterable<? extends Object> getData(){
        return Arrays.asList(2,4,6,8,10,12,14,16,18);
    }
    public CalcTests(int number){
        this.number = number;
    }

    @Test
    public void isEven_evenNumbers_true(){

        assertTrue(Calculator.isEven(this.number));
    }


}
