package com.example.calculator;

public interface Processor  {

    String SEPERATOR = " ";

    String getSymbol();

    String putSymbol();

    double doCalculation(double left,double right);




}
