package com.example.Spring.calculator.Testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void welcomingText() {
        String expected = "b> Калькулятор </b>";
        assertEquals(expected, calculatorService.welcomingText());
    }

    @Test
    void welcoming() {
        String expected = "<b> “Добро пожаловать в калькулятор\". </b>";
        assertEquals(expected, calculatorService.welcoming());
    }

    @Test
    void sum() {
        Integer expected = 10;
        assertEquals(expected, calculatorService.sum(8, 2));
    }

    @ParameterizedTest
    @CsvSource(value = {"3,2,1", "15,10,5", "45, 15, 30"})
    void deduction(Integer number1, Integer number2, Integer expected) {
        assertEquals(expected, calculatorService.deduction(number1, number2));
    }

    @Test
    void multiply() {
        Integer expected = 25;
        assertEquals(expected, calculatorService.multiply(5, 5));
    }

    @Test
    void dividePositive() {
        Integer expected = 20;
        assertEquals(expected, calculatorService.divide(40, 2));
    }
    @Test
    void divideNegative(){
        assertThrows(IllegalArgumentException.class, ()->calculatorService.divide(Integer.MAX_VALUE, 0));
    }

}