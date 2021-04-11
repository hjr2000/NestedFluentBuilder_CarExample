package com.nestedfluentbuilder;

public class Car
{
    private String brand;
    private String model;
    private int engineSize;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine size = " + engineSize +
               // ", body=" + body +
                '}';
    }

}
