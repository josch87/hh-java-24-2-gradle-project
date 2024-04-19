package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {

    @Test
    public void sum_WhenBothNumbersArePositive_ThenReturnSum() {
        // GIVEN
        int a = 6;
        int b = 7;

        // WHEN
        int actual = Calculation.sum(a, b);

        // THEN
        int expected = 13;
        assertEquals(expected, actual);
    }

    @Test
    public void sum_WhenBothNumbersAreNegative_ThenReturnSum() {
        // GIVEN
        int a = -4;
        int b = -3;
        
        // WHEN
        int actual = Calculation.sum(a, b);

        // THEN
        int expected = -7;
        assertEquals(expected, actual);
    }

    @Test
    public void sum_WhenOneNumberIsZero_ThenReturnSum() {
        // GIVEN
        int a = 0;
        int b = 5;
        
        // WHEN
        int actual = Calculation.sum(a, b);

        // THEN
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void sum_WhenBothNumbersAreZero_ThenReturnSum() {
        // GIVEN
        int a = 0;
        int b = 0;
        
        // WHEN
        int actual = Calculation.sum(a, b);

        // THEN
        int expected = 0;
        assertEquals(expected, actual);
    }
}