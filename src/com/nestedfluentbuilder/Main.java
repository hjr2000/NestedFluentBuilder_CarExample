package com.nestedfluentbuilder;

public class Main {

    public static void main(String[] args) {

        // See README.md for documentation

        Car car = CarBuilder
                .create()
                .setBrand("VW")
                .setModel("Passat")
                .build();
        System.out.println(car);

    }
}
