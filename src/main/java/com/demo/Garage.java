package com.demo;

//Create Class Garage
public class Garage{
    //Create main method
    public static void main(String[] args){
        //create object bus
        Garage bus = new Garage();
        System.out.println("Object Bus created");

        //Call method volvo
        bus.volvo();
    }
    // Create Function/Method called Volvo
    public void volvo(){
        System.out.println("Volvo bus");
        return;
    }

}