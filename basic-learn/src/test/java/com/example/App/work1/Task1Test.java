
package com.example.App.work1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1Test {

    Task1 task1;

    @BeforeEach
    void setUp() {
        task1 = new Task1();
    }

    @Test
    void testIsLuckTrue(){
        boolean actual = task1.isLucky(123402);
        assertTrue(actual);
    }
    @Test
    void testIsNotLuckTrue(){
        boolean actual = task1.isLucky(123401);
        assertFalse(actual);
    }
    @ParameterizedTest
    @ValueSource(ints = {475856, 348595, 529453, 759646, 948585})
    void testIsNotLuckyParametrized(int number) {
        boolean actual = task1.isLucky(number);
        assertFalse(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {123402, 456933, 666990, 856559, 109532})
    void testIsLuckyParametrized(int number) {
        boolean actual = task1.isLucky(number);
        assertTrue(actual);
    }

//    @ParameterizedTest
//    @CsvSource({"2,true", "1,false", "3,false"})
//    void testIsEvenCsv(int number, boolean expected) {
//        boolean actual = task1.isEven(number);
//        assertTrue(expected == actual);
//    }
}