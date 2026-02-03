package pract4_koshynskyi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }
    @Test
    public void divideByZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(5,0));
    }

    @Test
    public void divideCorrect(){
        Assertions.assertEquals(5,calculator.divide(10,2));
    }
}
