package org.example;

import org.example.service.Calculator;
import org.example.service.SimpleMathService;

public class Main {

    public static void main(String[] args) {
        var calculator = new Calculator(new SimpleMathService());

        System.out.println("Adding 1 and 2");
        var result = calculator.add(1, 2);

        System.out.println(result);

        System.out.println("Dividing 123 and 255");
        result = calculator.divide(123, 255);

        System.out.println(result);
    }
}