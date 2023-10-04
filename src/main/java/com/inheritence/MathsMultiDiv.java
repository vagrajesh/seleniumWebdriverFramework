package com.inheritence;

public class MathsMultiDiv extends MathsAddSub{
    int results;
    public void multiplication(int a, int b){
        results = a*b;
        System.out.println("Multiplication Results: " + results);
    }
    public void division(int a, int b){
        results = a/b;
        System.out.println("Division Results: " + results);
    }
}
