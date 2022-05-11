package com.example.App.work5;

public class Circle {
    private float radius;
    private double area;
    public Color FigureColor;
    // FigureColor = ('rgb'\'hsb'\'r'\'h', 134, 122, 234)

    public Circle(float radius, Color FigureColor ) throws Exception {
        if (isCorrectRadius(radius)) {
            this.radius = radius;
            this.area = 3.14 * radius * radius;
            this.FigureColor = FigureColor;
        }
        else {
            throw new Exception("Radius set incorrectly! ");
        }
    }

    public boolean isCorrectRadius(float radius){ return (radius > 0); }

    public double getArea(){ return area; }
    public Color getColor() { return FigureColor; }
    public float getRadius() { return radius; }

    public void setColor(Color newColor){
        this.FigureColor = newColor;
    }

    private void OutputInformation(){
        System.out.println("Radius: " + radius);
        System.out.println("Figure: Circle");
        System.out.println("Area: " + area);
        System.out.println("Color: " + FigureColor);

    }
}
