package com.example.App.work5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {
    Color testColor;

    @ParameterizedTest
    @CsvSource({"rgb, 17, 18, 20", "hSb, 104, 100, 100", "rGb, 255, 255, 255", "RGB, 0, 0,0", "HSB, 360, 100, 100", "hsb, 0, 0, 0"})
    void checkColorTrue(String type, int a, int b, int c){
        boolean haveException = true;
        try {
            testColor = new Color(type, a, b, c);
        }
        catch (Exception e){
            haveException = false;
        }
        finally {
            assertTrue(haveException);
        }
    }


    @ParameterizedTest
    @CsvSource({"rgb, 360, 18, 20", "hSb, 104, 101, 100", "rgd, 255, 255, 255", " rgb , -10, 0,0", "HSB, -10, 100, 100", " , 0, 0, 0"})
    void checkColorFalse(String type, int a, int b, int c){
        boolean haveException = true;
        try {
            testColor = new Color(type, a, b, c);
        }
        catch (Exception e){
            haveException = false;
        }
        finally {
            assertFalse(haveException);
        }
    }
}