package com.example.App.work4;

import com.example.App.work0.Task1_example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Task5Test extends Task1_example {
    Task5 uniquesymbol;
    @BeforeEach
    void setUp() {
        uniquesymbol = new Task5();
    }

    @ParameterizedTest
    @CsvSource({"13AB&949Dfdssdc94///fs, 13AB&94Dfdsc/", "179FDF&&&495, 179FD&45"})
    void onlyNumbersTrue(String string, String result) {
        assertEquals(uniquesymbol.uniqueSymbols(string), result);
    }

    @ParameterizedTest
    @CsvSource({"13AB&949Dfdssdc94///fs, 1394994", "179FDF&&&495, 179495"})
    void onlyNumbersFalse(String string,  String result) {
        assertNotEquals(uniquesymbol.uniqueSymbols(string), result);
    }
}