package com.learning.productservices.java.solid.D_DependencyInversion.Good;

public class Calculator {
    public int calculate(int a, int b, CalculatorOperation operation) {
        return operation.calculate(a,b);
    }
}
