package com.practice.cleancode.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testMultiply() {
        assertEquals(4.6, calculator.multiply(2.0, 2.3));
    }

    @Test
    public void testDivision() {
        assertEquals(3.0, calculator.divide(6.0, 2.0));
    }

    @Test
    public void testInvalidDivision() {
        assertThrows(DivisionByZeroException.class, () -> {
            calculator.divide(6.0, 0.0);
        });
    }

    @Test
    public void testPositiveAbs() {
        assertEquals(3.0, calculator.abs(3.0));
    }

    @Test
    public void testNegativeAbs() {
        assertEquals(3.0, calculator.abs(-3.0));
    }
}
