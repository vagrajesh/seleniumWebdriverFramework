package com.demo;
//Create class Calculator

public class Calculator{
    // Create Main method
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("Inside main method calculator");
        int addResult = calculator.addition(4,5); // Calling addition method
        System.out.println("Main Method result: " + addResult);
        int subtractResult = calculator.subtraction(10, 5);// Calling subtraction method
        System.out.println("Main Method result: " + subtractResult);
    }

    public int addition(int a, int b){
        System.out.println("Inside addition");
        int additionResult;
        additionResult = a+b;
        //System.out.println(additionResult);
        return additionResult;
    }

    public int subtraction(int c, int d){
        System.out.println("Inside subtraction");
        int subtractionResult;
        subtractionResult = c-d;
        //System.out.println(subtractionResult);
        return subtractionResult;
    }
}