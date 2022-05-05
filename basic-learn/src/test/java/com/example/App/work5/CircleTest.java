package com.example.App.work5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Color color;
    @BeforeEach
    void setUp() throws Exception {
        color = new Color("rgb", 49, 89, 96);
    }

    @ParameterizedTest
    @ValueSource(floats = {1, 3,2, 1,5, 7,9, 2, 3.2f, 9.5f})
    void checkCorrectRadiusTrue(float radius) throws Exception {
        boolean isCorrect = true;
        try {
            Circle circle = new Circle(radius, color);
        }
        catch (Exception e) {
            isCorrect = false;
        }
        finally {
            assertTrue(isCorrect);
        }
    }

    @ParameterizedTest
    @ValueSource(floats = {-1, -3, -2,0, -1.3f, 0})
    void checkCorrectRadiusFalse(float radius) throws Exception {
        boolean isCorrect = true;
        try {
            Circle circle = new Circle(radius, color);
        } catch (Exception e) {
            isCorrect = false;
        } finally {
            assertFalse(isCorrect);
        }
    }

    @ParameterizedTest
    @CsvSource({"rgb, 17, 18, 20", "hSb, 104, 100, 100", "rGb, 255, 255, 255"})
    void checkSetColor(String type, int a, int b, int c) throws Exception {
        Color newColor = new Color(type, a,b,c);
        Circle circle = new Circle(32, color);
        circle.setColor(newColor);
        assertTrue((circle.getColor()).equals(newColor));

    }

}