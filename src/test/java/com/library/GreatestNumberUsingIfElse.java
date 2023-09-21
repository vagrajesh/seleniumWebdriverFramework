package com.library;

public class GreatestNumberUsingIfElse {
   public static int firstNumber;
    public static int secondNumber;
    public static int thirdNumber;
    public static int largestNumber;
    public static void getGreatestNumber(int a, int b, int c){
        firstNumber = a;
        secondNumber = b;
        thirdNumber = c;

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            largestNumber = firstNumber;
            System.out.println("Largest First Number: " + largestNumber);
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            largestNumber = secondNumber;
            System.out.println("Largest Second Number: " + secondNumber);
        }
        else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            largestNumber = thirdNumber;
            System.out.println("Largest Third Number: " + thirdNumber);
        }
        else if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println(" All Numbers are Same");
        }
        else if (firstNumber == secondNumber) {
            System.out.println(" First and Seconds Numbers are Same");
        }
        else if (secondNumber == thirdNumber) {
            System.out.println(" Second and Third Numbers are Same");
        }
        else
            System.out.println ("first and Third are same");

    }
}
