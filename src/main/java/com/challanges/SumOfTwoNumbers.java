package com.challanges;

public class SumOfTwoNumbers {

    public static void main(String[] args){
        SumOfTwoNumbers.sum(3,2);
        SumOfTwoNumbers.sum(-3,-6);
        SumOfTwoNumbers.sum(7,3);
    }
    public static int sum(int a, int b) {
        int results;
        results = a+b;
        System.out.println(results);
        return results;
    }
}