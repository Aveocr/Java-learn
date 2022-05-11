package com.example.App.work5;

public class Rectangle {
    private float width, height;
    private double area;
    public Color figureColor;

    // FigureColor = ('rgb'\'hsb'\'r'\'h', 134, 122, 234)
    // construction
    public Rectangle(float width, float height, Color figureColor ) throws Exception {
        if (isCorrectSide(width, height)) {
            this.width = width;
            this.height = height;
            this.area = width * height;
            this.figureColor = figureColor;
        }
        else {
            throw new Exception("Side\\Sides specified incorrectly!");
        }

    }
    public boolean isCorrectSide(float width, float height){
        return (width > 0 && height > 0);
    }

    // Getters
    public Color getFigureColor() {
        return figureColor;
    }

    public float getHeight(){
        return height;
    }

    public float getWidth(){
        return width;
    }
    public double getArea(){
        return area;
    }
    // Setter
    public void setColor(Color color){
        this.figureColor = color;
    }
    // Information output about figure
    public void OutputInformation(){
        System.out.println("Height: " + height);
        if (width == height) {
            System.out.println("Figure: Square");
        }
        else{
            System.out.println("Figure: Rectangle");
            System.out.println("Width: " + width);
        }
        System.out.println("Area: " + area);
        System.out.println("Color: " + figureColor);

    }
}

