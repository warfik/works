package com.telran.calculator.char_operation;
import com.telran.calculator.Operation;

public class Operation_42 implements Operation {
    @Override
    public double apply(double num1, double num2) {
        return num1 * num2;
    }
}
