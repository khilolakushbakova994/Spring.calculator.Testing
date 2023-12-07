package com.example.Spring.calculator.Testing;

public interface CalculatorService {
    String welcoming();

    String welcomingText();

    Integer sum(int number1, int number2);

    Integer deduction(int number1, int number2);

    Integer multiply(int number1, int number2);

    Double divide(Integer number1, Integer number2);


    String showError(Integer number1, Integer number2);
}