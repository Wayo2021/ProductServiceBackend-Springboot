package com.learning.productservices.java.solid.O_OpenClosed.Bad;

public class Bad_Calculator {
    public int calculatorNumber(int number1, int number2, String type) {
        int result = 0;
        switch (type) {
            case "sum":
                result = number1 + number2;

            case "sub" :
                result = number1 + number2;
        }
        return result;
    }
}
