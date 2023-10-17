import org.example.exception.CalculatorException;
import org.example.service.Calculator;
import org.example.service.MathService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorTest {

    @Test
    public void givenTwoPositiveNumbers_whenAdding_thenCorrectResultIsReturned() {
        var mathService = Mockito.mock(MathService.class);
        Mockito.when(mathService.add(1, 2)).thenReturn(3.0);

        var calculator = new Calculator(mathService);

        var result = calculator.add(1, 2);

        Mockito.verify(mathService, Mockito.times(1)).add(1, 2);
        Assertions.assertEquals(result, 3.0);
    }

    @Test
    public void givenTwoPositiveNumbers_whenSubtracting_thenCorrectResultIsReturned() {
        var mathService = Mockito.mock(MathService.class);
        Mockito.when(mathService.subtract(6, 5)).thenReturn(1.0);

        var calculator = new Calculator(mathService);

        var result = calculator.subtract(6, 5);

        Mockito.verify(mathService, Mockito.times(1)).subtract(6, 5);
        Assertions.assertEquals(result, 1.0);
    }

    @Test
    public void givenTwoPositiveNumbers_whenMultiplying_thenCorrectResultIsReturned() {
        var mathService = Mockito.mock(MathService.class);
        Mockito.when(mathService.multiply(6, 5)).thenReturn(30.0);

        var calculator = new Calculator(mathService);

        var result = calculator.multiply(6, 5);

        Mockito.verify(mathService, Mockito.times(1)).multiply(6, 5);
        Assertions.assertEquals(result, 30.0);
    }

    @Test
    public void givenTwoPositiveNumbers_whenDividing_thenCorrectResultIsReturned() {
        var mathService = Mockito.mock(MathService.class);
        Mockito.when(mathService.divide(10, 2)).thenReturn(5.0);

        var calculator = new Calculator(mathService);

        var result = calculator.divide(10, 2);

        Mockito.verify(mathService, Mockito.times(1)).divide(10, 2);
        Assertions.assertEquals(result, 5.0);
    }

    @Test
    public void givenAPositiveNumberAndZero_whenDividing_thenThrowsException() {
        var mathService = Mockito.mock(MathService.class);
        Mockito.when(mathService.divide(10, 0)).thenThrow(ArithmeticException.class);

        var calculator = new Calculator(mathService);

        Assertions.assertThrows(CalculatorException.class, () -> calculator.divide(10, 0));
    }
}
