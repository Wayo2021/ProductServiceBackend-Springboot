package com.learning.productservices.java.solid.D_DependencyInversion.Good;

public class AddOperation implements CalculatorOperation{
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
