package com.example.App.work3;

import com.example.App.work0.Task1_example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class Task1Test extends Task1_example {
    Task1 sumRowArray;
    @BeforeEach
    void setUp() {
        sumRowArray = new Task1();
    }

    @Test
    void testSumRowDoubleMatrixFalse() {
        int arr[][][] = {
                {{12, 19}, {-36, -29}},
                {{-8, -83, -23}, {-8, 72, -48}, {-90, -86, 90}}
        };
        int size[] = {2, 3};
        int sum[][] = {{-24,-10}, {-106, -97, 19}};
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i]; j++) {
                assertFalse(sumRowArray.sumRowDoubleArray(arr[i], j) == sum[i][j]);
            }
        }

    }


    @Test
    void testSumRowDoubleMatrix() {
        int arr[][][] = {
                {{12, 19}, {-36, 29}},
                {{-8, -83, -23}, {-8, 72, -48}, {-90, -86, 90}}
        };
        int size[] = {2, 3};
        int sum[][] = {{31,-7}, {-114, 16, -86}};
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i]; j++) {
                assertTrue(sumRowArray.sumRowDoubleArray(arr[i], j) == sum[i][j]);
            }
        }

    }
}