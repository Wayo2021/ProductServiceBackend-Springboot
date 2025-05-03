package com.learning.productservices.java.solid.D_DependencyInversion.Bad;


public class Calculator {
    public int calculate(int a, int b, String operation) {
        int result = 0;

        switch (operation) {
            case "add":
                AddOperation addOperation = new AddOperation();
                result = addOperation.add(a,b);

            case "sub":
                SubOperation subOperation = new SubOperation();
                result = subOperation.sub(a,b);
        }
        return result;
    }
}
