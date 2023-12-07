package com.example.Spring.calculator.Testing;

import org.springframework.stereotype.Service;

@Service

public class CalculatorServiceImpl implements CalculatorService {

    public String welcomingText() {
        return "<b> Калькулятор </b>";
    }


    public String welcoming() {

        return "<b> “Добро пожаловать в калькулятор\". </b>";
    }

    public Integer sum(int number1, int number2) {
        return (number1 + number2);
    }

    public Integer deduction(int number1, int number2) {
        return (number1 - number2);
    }

    public Integer multiply(int number1, int number2) {
        return (number1 * number2);
    }

    public Double divide(Integer number1, Integer number2) {
        if (number2 == 0) throw new IllegalArgumentException (" На ноль делить НЕЛЬЗЯ! ");
            return Double.valueOf(number1 / number2);
        }

    @Override
    public String showError(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return "Ошибка!!! Вы забыли добавить еще одно число";
        }
        return null;
    }
}