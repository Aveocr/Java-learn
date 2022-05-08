package com.example.App.work6;

public class Car {
    public String model;
    public int year;
    public String color;
    public String maker;

    public Car(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) { this.model = model;}
    public void setYear(int year) { this.year = year; }
    public void setColor(String color) { this.color = color;}

    public String getMaker() { return maker;}
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return  "\nmodel='" + model +
                ",maker='" + maker  +
                ",year=" + year +
                ",color='" + color +
                "";
    }
}
