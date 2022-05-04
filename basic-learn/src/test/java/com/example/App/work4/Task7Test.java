package com.example.App.work4;

import com.example.App.work0.Task1_example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Task7Test extends Task1_example {
    Task6 uniqueWord;
    @BeforeEach
    void setUp() {
        uniqueWord = new Task6();
    }

    @ParameterizedTest
    @CsvSource({"'kdljsklf sdfklsdkfk kk kkk kfjdjfk s jeruu iowei jfkslfkdf l; helo bd', helo", "'djkfsdlfal jdskkk k ffdrier n vccx sdwe r ila sdfk jv aeri lkj vm kdf lksd t; sd fssa', fssa"})
    void onlyNumbersTrue(String str, String result) {
        String[] string = str.split(" ");
        assertEquals(uniqueWord.maxUniqueSymbolsInString(string), result);
    }

    @ParameterizedTest
    @CsvSource({"'kdljsklf sdfklsdkfk kk kkk kfjdjfk s jeruu iowei jfkslfkdf l; helo bd', l;", "'djkfsdlfal jdskkk k ffdrier n vccx sdwe r ila sdfk jv aeri lkj vm kdf lksd t; sd fssa', sd"})
    void onlyNumbersFalse(String str,  String result) {
        String[] string = str.split(" ");
        assertNotEquals(uniqueWord.maxUniqueSymbolsInString(string), result);
    }
}