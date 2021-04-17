package com.nestedfluentbuilder;

public class CarBuilder
{
    protected Car car;

    // Constructor
    protected CarBuilder(Car car) {
        this.car = car;
    }

    // Create our car to start with
    public static CarBuilder create()
    {
        // Build the default car - we can change any of these values using the methods below when we create the car in code
        Car newCar = new Car();
        newCar.setBrand("Audi");
        newCar.setModel("A6");
        newCar.setEngineSize(2000);
        return new CarBuilder(newCar);
    }

    public CarBuilder setBrand(String brand){
        car.setBrand(brand);
        return this;
    }

    public CarBuilder setModel(String model){
        car.setModel(model);
        return this;
    }

    public CarBuilder setEngineSize(int engineSize){
        car.setEngineSize(engineSize);
        return this;
    }

    public Car build(){
        return car;
    }

}
