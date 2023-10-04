package com.challanges;

public class PerimeterOfRectangle {
    public static int findPerimeter(int len, int wid){
        int results;
        results = (len*2) + (wid*2);
        System.out.println(results);
        return results;
    }

    public static void main(String[] args) {
        PerimeterOfRectangle.findPerimeter(10,20);
        PerimeterOfRectangle.findPerimeter(6,7);
        PerimeterOfRectangle.findPerimeter(2,9);
    }
}
