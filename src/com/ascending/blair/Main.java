package com.ascending.blair;

public class Main {

    public static void main(String[] args) {

        Bike myBike = new Bike("Wonderful bike", "round", 2, "trangle");
        Bicycle myBicycle = new Bicycle("Cute bike", "super round", 2, "small trangle", 2);
        Motorcycle myMotorcycle = new Motorcycle("Cool motor", "extremely round", 2, "foam rectangle", 2, 5, "electric");

        System.out.println(myBike.toString());
        System.out.println(myBicycle.toString());
        System.out.println(myMotorcycle.toString());

    }
}
