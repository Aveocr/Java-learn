package com.example.App.work4;

import com.example.App.work0.Task1_example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class Task1Test extends Task1_example {
    Task1 string2array;
    String[] test;


    @BeforeEach
    void setUp() {
        string2array = new Task1();

    }

    @ParameterizedTest
    @CsvSource({"abcd, 'a ab abc abcd'", "aabcdf, 'a aa aab aabc aabcd aabcdf'"})
    void stringArrayTrue1(String str, String result) {
        test = string2array.stringArray(str);
        String[] res = result.split(" ");
        assertArrayEquals(res, test);
    }
}