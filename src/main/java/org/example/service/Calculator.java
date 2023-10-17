package org.example.service;

import org.example.exception.CalculatorException;

public class Calculator {
    private MathService simpleMathService;

    public Calculator(MathService simpleMathService) {
        this.simpleMathService = simpleMathService;
    }

    public double add(double a, double b) {
        return simpleMathService.add(a, b);
    }

    public double subtract(double a, double b) {
        return simpleMathService.subtract(a, b);
    }

    public double divide(double a, double b) {
        try {
            return simpleMathService.divide(a, b);
        } catch (Exception ex) {
            System.out.printf("Error dividing: %s", ex.getMessage());
            throw new CalculatorException("Error dividing", ex);
        }
    }

    public double multiply(double a, double b) {
        return simpleMathService.multiply(a, b);
    }
}
