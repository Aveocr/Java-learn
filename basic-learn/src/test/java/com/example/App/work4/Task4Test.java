package com.example.App.work4;

import com.example.App.work0.Task1_example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Task4Test extends Task1_example {
    Task4 sumNumberFromString;
    @BeforeEach
    void setUp() {
        sumNumberFromString = new Task4();
    }

    @ParameterizedTest
    @CsvSource({"13AB&949Dfdssdc94///fs, 39", "179FDF&&&495, 35"})
    void onlyNumbersTrue(String string, int result) {
        assertEquals(sumNumberFromString.sumNumbersInString(string), result);
    }

    @ParameterizedTest
    @CsvSource({"13AB&949Dfdssdc94///fs, 1394994", "179FDF&&&495, 179495"})
    void onlyNumbersFalse(String string,  String result) {
        assertNotEquals(sumNumberFromString.sumNumbersInString(string), result);
    }
}