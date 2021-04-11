package com.nestedfluentbuilder;

public class Main {

    public static void main(String[] args) {

        // See README.md for instructions/docs

        Car car = CarBuilder
                .create()
                .setBrand("VW")
                .setModel("Passat")
                .build();
        System.out.println(car);

    }
}
