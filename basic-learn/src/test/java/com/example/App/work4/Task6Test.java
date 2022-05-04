package com.example.App.work4;

import com.example.App.work0.Task1_example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Task6Test extends Task1_example {
    Task6 maxUniqal;
    @BeforeEach
    void setUp() {
        maxUniqal = new Task6();
    }

    @ParameterizedTest
    @CsvSource({"'dfkjd;lafjkdfakljfjaklfjslkfdjs" +
            " dkfjslfdkskfkvdejfdkfjdlfskdfs" +
            " eicmvjutjdkfjkfkkkkkkdsflskkfk" +
            " heldddkfsdkfvjdkfseklsfdflkvxd', eicmvjutjdkfjkfkkkkkkdsflskkfk",

            "'kkjlsklfdsjajjds;lflk;sdkjlfkjalskjl;fad" +
            " dsfkljdskjlfdkfjkdkvnklkfdjrt" +
            " yyjykttuiytktyijriotrytyr" +
            " figiitiiiiiiiiiiiiiiiiiiiiiiii', yyjykttuiytktyijriotrytyr"

    })
    void onlyNumbersTrue(String string, String result) {
        String[] str = string.split(" ");
        assertEquals(maxUniqal.maxUniqueSymbolsInString(str), result);
    }

    @ParameterizedTest
    @CsvSource({"'dfkjd;lafjkdfakljfjaklfjslkfdjs" +
            " dkfjslfdkskfkvdejfdkfjdlfskdfs" +
            " eicmvjutjdkfjkfkkkkkkdsflskkfk" +
            " heldddkfsdkfvjdkfseklsfdflkvxd', dkfjslfdkskfkvdejfdkfjdlfskdfs",


            "'kkjlsklfdsjajjds;lflk;sdkjlfkjalskjl;fad" +
            " dsfkljdskjlfdkfjkdkvnklkfdjrt" +
            " yyjykttuiytktyijriotrytyr" +
            " figiitiiiiiiiiiiiiiiiiiiiiiiii',dsfkljdskjlfdkfjkdkvnklkfdjrt"
    })
    void onlyNumbersFalse(String string,  String result) {
        String[] str = string.split(" ");
        assertNotEquals(maxUniqal.maxUniqueSymbolsInString(str), result);
    }
}