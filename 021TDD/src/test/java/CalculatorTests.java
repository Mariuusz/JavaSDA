import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import pl.sda.Calculator;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTests {
    @Test
    public void sum_a6b7_13() {
        int expected = 13;
        //  pl.sda.Calculator calculator = new pl.sda.Calculator();

        int actual = Calculator.sum(6, 7);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divide_a1b1_1() {

        int expected = 1;
        // pl.sda.Calculator calculator = new pl.sda.Calculator();

        int actual = Calculator.divide(1, 1);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_a1b0_IllegalArgumentException() {         // dopisalismy wyrzucanie wyjatku w kalkulatorze
        new Calculator().divide(1, 0);

    }

    // sprawdza ile się chce wyjatow
    @Rule
    public ExpectedException thrown = ExpectedException.none();     // ustawiamy none

    @Test
    public void divide_a1b0_IllegalArgumentExceptionRule() {
        thrown.expect(IllegalArgumentException.class);
        new Calculator().divide(1, 0);

    }


    @Test
    public void difference_a2b1_1() {
        int expected = 1;

        int actual = Calculator.difference(2, 1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiply_a2b1_2() {
        int expected = 2;

        int actual = Calculator.multiply(2, 1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void log_a4b16_2() {
        //Arrage
        double expected = 2.0;
        //Act
        double actual = Calculator.log(4.0, 16.0);
        //Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void pow_a22_4(){
        double expected = 4;

        double actual = Calculator.power(2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void podniesienieDoEntejPotegi(){
        double expected = 4;

        double actual = Calculator.podnies(2,2);

        assertThat(actual).isEqualTo(expected);
    }


}
