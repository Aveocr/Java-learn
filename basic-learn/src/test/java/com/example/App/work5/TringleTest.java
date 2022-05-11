package com.example.App.work5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TringleTest {

    Color color;
    @BeforeEach
    void setUp() throws Exception {
        color = new Color("rgb", 49, 89, 96);
    }

    @ParameterizedTest
    @CsvSource({"3, 4, 5", "5, 4, 6", "17, 9, 24"})
    void checkCorrectSideTrue(float a, float b, float c){
        boolean haveException = true;

        try {
            Tringle tringle;
            tringle = new Tringle(a, b,c, color);
        }
        catch (Exception e){
            haveException = false;
        }
        finally {
            assertTrue(haveException);
        }
    }


    @ParameterizedTest
    @CsvSource({"32, 64, 32", "-4, 9, 9", "-3, 4, 5", "0, 4, 5", "2, 4, 15"})
    void checkCorrectSideFalse(float a, float b, float c){
        boolean haveException = true;

        try {
            Tringle tringle = new Tringle(a, b, c, color);
        }
        catch (Exception e){
            haveException = false;
        }
        finally {
            assertFalse(haveException);
        }
    }


    @ParameterizedTest
    @CsvSource({"rgb, 17, 18, 20", "hSb, 104, 100, 100", "rGb, 255, 255, 255"})
    void checkSetColor(String type, int a, int b, int c) throws Exception {
        Color newColor = new Color(type, a,b,c);
        Tringle tringle = new Tringle(4, 3, 5, color);
        tringle.setColor(newColor);
        assertTrue((tringle.getColor()).equals(newColor));

    }

    @ParameterizedTest
    @CsvSource({"3, 5, 5", "5, 4, 6", "17, 9, 24", "2, 4, 4"})
    void testLong(float a, float b, float c) throws Exception {
        float[] arr = new float[]{a, b, c};
        Tringle tringle = new Tringle(a, b, c, color);
        assertArrayEquals(tringle.getLong(), arr);
    }
}