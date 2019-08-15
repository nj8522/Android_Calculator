package com.example.calculator;

public class Adder implements Processor {
    @Override
    public String getSymbol() {

        return "+";
    }

    @Override
    public String putSymbol() {
        return "+";
    }

    @Override
    public double doCalculation(double left, double right)
    {
        return left + right;
    }
}
