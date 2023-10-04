package com.inheritence;

public class Service extends MathsMultiDiv{

    public static void main(String[] args) {
        int firstNumber = 50;
        int secondNumber = 20;
        MathsMultiDiv mathsMultiDiv = new MathsMultiDiv();
        mathsMultiDiv.addition(firstNumber,secondNumber);
        mathsMultiDiv.subtraction(firstNumber,secondNumber);
        mathsMultiDiv.multiplication(firstNumber,secondNumber);
        mathsMultiDiv.division(firstNumber,secondNumber);
    }
}
