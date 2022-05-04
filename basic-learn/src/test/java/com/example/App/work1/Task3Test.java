package com.example.App.work1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task3Test {

    Task3 task3;

    @BeforeEach
    void setUp() {
        task3 = new Task3();
    }

    @ParameterizedTest
    @ValueSource(ints = {475856, 348595, 529453, 759646, 948585})
    void testIsNotLuckyParametrized(int number) {
        boolean actual = task3.checkPrimeNumber(number);
        assertFalse(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {9859,9871,9883,9887, 9901,	9907, 9923,	9929,  9931, 9941,	9949,	9967,	9973})
    void testIsLuckyParametrized(int number) {
        boolean actual = task3.checkPrimeNumber(number);
        assertTrue(actual);
    }

//    @ParameterizedTest
//    @CsvSource({"2,true", "1,false", "3,false"})
//    void testIsEvenCsv(int number, boolean expected) {
//        boolean actual = task1.isEven(number);
//        assertTrue(expected == actual);
//    }
}