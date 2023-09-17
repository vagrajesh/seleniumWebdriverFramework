package com.demo;
// Create Class Vehicle
public class Vehicle{
// create main method
    public static void main(String[] args){
        //Crete object vehicle
        Vehicle vehicle = new Vehicle();
        System.out.println("Object vehicle created");
        //call method bike of new object
        vehicle.bike();
        //Call method car of new object
        vehicle.car();
    }

    //create bike method
    public void bike(){
        System.out.println("Method Bike created");
    }

    //create car method
    public void car(){
        System.out.println("Method Car created");
    }
}
