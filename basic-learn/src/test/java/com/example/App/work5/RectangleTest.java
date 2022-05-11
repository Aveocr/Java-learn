package com.example.App.work5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Color color;
    @BeforeEach
    void setUp() throws Exception {
        color = new Color("rgb", 49, 89, 96);
    }

    @ParameterizedTest
    @CsvSource({"32, 64", "14, 9", "17, 1"})
    void checkCorrectSideTrue(float a, float b){
        boolean haveException = true;

        try {
            Rectangle rect;
            rect = new Rectangle(a, b, color);
        }
        catch (Exception e){
            haveException = false;
        }
        finally {
            assertTrue(haveException);
        }
    }


    @ParameterizedTest
    @CsvSource({"-32, -64", "-14, 9", "17, 0"})
    void checkCorrectSideFalse(float a, float b){
        boolean haveException = true;

        try {
            Rectangle rect;
            rect = new Rectangle(a, b, color);
        }
        catch (Exception e){
            haveException = false;
        }
        finally {
            assertFalse(haveException);
        }
    }

    @ParameterizedTest
    @CsvSource({"32, 64, 2048", "14, 9, 126", "17, 17, 289"})
    void checkArea(float width, float heigth,  double result) throws Exception {
        Rectangle rect = new Rectangle(width, heigth, color);
        assertEquals(rect.getArea(), result);
    }

    @ParameterizedTest
    @CsvSource({"rgb, 17, 18, 20", "hSb, 104, 100, 100", "rGb, 255, 255, 255"})
    void checkSetColor(String type, int a, int b, int c) throws Exception {
        Color newColor = new Color(type, a,b,c);
        Rectangle rect = new Rectangle(32, 40, color);
        rect.setColor(newColor);
        assertTrue((rect.getFigureColor()).equals(newColor));

    }

    @ParameterizedTest
    @CsvSource({"32, 1024", "9, 81", "17, 289"})
    void checkSquare(int width, int result) throws Exception {
        Square square = new Square(width, color);
        assertEquals(square.getArea(), result);
    }
}