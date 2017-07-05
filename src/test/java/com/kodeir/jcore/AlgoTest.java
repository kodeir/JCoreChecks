package com.kodeir.jcore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Sergei "Kodeir" Riabinin on 15/03/17.
 */
@RunWith(Parameterized.class)
public class AlgoTest {

    private int[] array = {0};
    private int[] mirrorArray = {0};
    int sum = 0;

    public AlgoTest(int[] expected, int[] result, int[] sumArray) {
        this.array = expected;
        this.mirrorArray = result;
        sum = sumArray[0];
    }

    @Parameterized.Parameters
    public static Collection createAlgos() {
        return Arrays.asList(new int[][][] {
                {{0},{0},{0}},
                {{0,1},{1,0},{1}},
                {{0,1,2},{2,1,0},{3}},
                {{0,1,2,3,4},{4,3,2,1,0},{10}},
                {{0,1,2,3,4,5,6,7,8,9},{9,8,7,6,5,4,3,2,1,0},{45}}
        });
    }

    @Test
    public void revertArrayTest() throws Exception {
        assertArrayEquals(array, Algo.revertArray(mirrorArray));
    }

    @Test
    public void sumArrayTest() throws Exception {
        assertEquals(sum,Algo.sumArray(array),0);
    }

}