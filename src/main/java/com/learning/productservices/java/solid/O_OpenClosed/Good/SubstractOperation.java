package com.learning.productservices.java.solid.O_OpenClosed.Good;

public class SubstractOperation implements Operation{
    @Override
    public int perform(int numer1, int number2) {
        return numer1 - number2;
    }
}
