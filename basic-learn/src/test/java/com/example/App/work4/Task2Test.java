package com.example.App.work4;

import com.example.App.work0.Task1_example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task2Test extends Task1_example {
    Task2 upperString;
    @BeforeEach
    void setUp() {
        upperString = new Task2();
    }

    @ParameterizedTest
    @CsvSource({"A5BCadf,ABC", "JafjdksDs,JD", "Hello World,H W"})
    void stringUpperCaseTrue(String str, String res) {
        str = upperString.stringUpperCase(str);
        assertTrue(str.equals(res));
    }

    @ParameterizedTest
    @CsvSource({"FdsfCadf,ABC", "Jagd4234sDS,JD", "342413,34324"})
    void stringUpperCaseFalse(String str, String res) {
        str = upperString.stringUpperCase(str);
        assertFalse(str.equals(res));
    }

}