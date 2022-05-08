package com.example.App.work6;

public class CarMaker {
    public String maker;
    public Car cars;

    public CarMaker(String maker, Car cars) {
        this.cars = cars;
        this.maker = maker;
    }

    public void setCars(Car cars){ this.cars = cars; }
    public void setMaker(String maker) { this.maker = maker; }
    public String getMaker() { return maker; }
    public Car getCars() { return cars;}
    public String getModel() { return cars.model; }
    @Override
    public String toString() {
        return "\nCarMaker{" +
                "maker='" + maker + '\'' +
                ",cars={model=\"" + cars.model + '\"' +
                ", maker=\"" + maker + "\"" +
                ", year=" + cars.year +
                ", color=\"" + cars.color + "\"}}";
    }
}
