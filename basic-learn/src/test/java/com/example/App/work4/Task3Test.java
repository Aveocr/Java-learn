package com.example.App.work4;

import com.example.App.work0.Task1_example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


class Task3Test extends Task1_example {
    Task3 onlyNumbers;
    @BeforeEach
    void setUp() {
        onlyNumbers = new Task3();
    }

    @ParameterizedTest
    @CsvSource({"13AB&949Dfdssdc94///fs, '1394994'", "179FDF&&&495, '179495'"})
    void onlyNumbersTrue(String number,  String result) {
        char[] res = result.toCharArray();
        int N = res.length;
        assertArrayEquals(onlyNumbers.numbersArray(number, N), res);
    }

    @ParameterizedTest
    @CsvSource({"13AB&949Dfdssdc94///fs, '134994'", "179FDF&&&495, '17945'"})
    void onlyNumbersFalse(String number,  String result) {
        char[] res = result.toCharArray();
        int N = res.length;
        assertFalse(onlyNumbers.numbersArray(number, N).equals( res));
    }
}