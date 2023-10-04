package com.challanges;

public class EqualValuesOrNot {
    public static boolean isSameNum(int x, int y){
        System.out.println(x==y);
        return x == y;
    }

    public static void main(String[] args) {
        EqualValuesOrNot.isSameNum(10,12);
        EqualValuesOrNot.isSameNum(10,10);
    }
}
