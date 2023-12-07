package com.example.Spring.calculator.Testing;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;


    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
@RequestMapping("/calculator")
    @GetMapping
    public String welcomingText() {
        return calculatorService.welcomingText();
    }

    @GetMapping()
    public String welcoming() {

        return calculatorService.welcoming();
    }

    @GetMapping("/plus")
    public Integer sum(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.sum(number1, number2);
    }

    @GetMapping("/minus")
    public Integer deduction(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.deduction(number1, number2);
    }

    @GetMapping("/multiply")
    public Integer multiply(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.multiply(number1, number2);
    }

    @GetMapping("/divide")
    public Double divide(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.divide(number1, number2);

    }

    @GetMapping
    public String errorText (@RequestParam ("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.showError(number1, number2);
    }
    @ExceptionHandler (IllegalArgumentException.class)
    public String devideByZero (IllegalArgumentException il, HttpServletResponse response){
        response.setStatus(400);
        return il.getMessage();
    }
}
