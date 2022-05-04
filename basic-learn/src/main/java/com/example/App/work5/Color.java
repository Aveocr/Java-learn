package com.example.App.work5;

public class Color {
    public String TypeColor;
    public int a, b, c;

    // TypeColor is RGB or HSB
    // RGB: a - Red, b - Green, c - Blue
    // HSB: a - Hue, b - Saturation, c - Brightness
    public Color(String typeColor, int a, int b, int c) throws Exception {
      if ((typeColor.equalsIgnoreCase("rgb") && rgb(a,b,c))
              || typeColor.equalsIgnoreCase("hsb") && hsb(a,b,c)) {
          this.a = a;
          this.b = b;
          this.c = c;
          this.TypeColor = typeColor;
      }
      else {
          throw new Exception("Color create error");
      }
    }

   private boolean rgb(int r, int g, int b){
        return !((r > 255 || r < 0 || g > 255 || g < 0 || b > 255 || b < 0));
   }
   private boolean hsb(int h, int s, int b){
        return !((h > 360 || h < 0 || s > 100 || s < 0 || b > 100 || b < 0));
   }

}
