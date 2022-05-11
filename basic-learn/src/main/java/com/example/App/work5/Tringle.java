package com.example.App.work5;

public class Tringle {
    private float[] side;
    private double area;
    public Color FigureColor;
    // FigureColor = ('rgb'\'hsb'\'r'\'h', 134, 122, 234)

    public Tringle(float a, float b, float c, Color FigureColor ) throws Exception {
        if (isCorrectSide(a, b, c) && isCorrectCreateTringle(a, b, c)){
            this.side = new float[]{a, b, c};
            float P = a + b + c; // Perimeter
            this.area = Math.sqrt((P-a) * (P-b) * (P-c));
            this.FigureColor = FigureColor;
        }
        else {
            throw new Exception("The side\\sides specified incorrectly ");
        }
    }

    public boolean isCorrectSide(float a, float b, float c){
        return (a > 0 && b > 0 && c > 0);
    }

    public boolean isCorrectCreateTringle(float a, float b, float c){
        return ((a + b) > c && (a + c) > b && (b + c) > a);
    }

    public double getArea(){ return area; }
    public Color getColor() { return FigureColor; }
    public float[] getLong() { return side; }

    public void setColor(Color newColor){
        this.FigureColor = newColor;
    }

    private void OutputInformation(){
        System.out.println("a: " + side[0]);
        System.out.println("b: " + side[1]);
        System.out.println("c: " + side[2]);
        System.out.println("Figure: Tringle");
        System.out.println("Area: " + area);
        System.out.println("Color: " + FigureColor);

    }
}
