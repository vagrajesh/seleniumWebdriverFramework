package com.library;
// This is to find Tallest person using NESTED IF
public class TallestPersonNestedIfElse {
    // Variables
    public static int firstPerson;

    public static int secondPerson;
    public static int thirdPerson;
    public static int tallestPerson;

    //Method

    public void tallestPersonFind(int a, int b, int c){
        firstPerson = a;
        secondPerson = b;
        thirdPerson = c;

        if(firstPerson>secondPerson){
            if(firstPerson>thirdPerson){
                tallestPerson = firstPerson;
                System.out.println("Tallest Person: First Person " + firstPerson);
            }
            else if (thirdPerson>firstPerson){
                tallestPerson = thirdPerson;
                System.out.println("Tallest Person: Third Person" + thirdPerson);
            }
            else {
                System.out.println("Tallest Person: First Person " + firstPerson + "Third Person" + thirdPerson);
            }
        }
        else if (secondPerson>firstPerson){
            if(secondPerson>thirdPerson){
                tallestPerson = secondPerson;
                System.out.println("Tallest Person: Second Person " + secondPerson);
            }

            else if (thirdPerson>secondPerson){
                tallestPerson = thirdPerson;
                System.out.println("Tallest Person: Third Person " + thirdPerson);
            }
            else {
                System.out.println("Tallest Person: Second Person " + secondPerson + "Third Person " + thirdPerson);
            }
        }
        else{
            if(secondPerson>thirdPerson){
                System.out.println("Tallest Person: First Person" + firstPerson + "First Person" + secondPerson);
            }
            else if(thirdPerson > secondPerson){
                tallestPerson = thirdPerson;
                System.out.println("Tallest Person: Third Person" + thirdPerson);

            }
        }
    }

}
