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

    private Object[] array = {0};
    private Object[] mirrorArray = {0};

    public AlgoTest(Object[] expected, Object[] result) {
        this.array = expected;
        this.mirrorArray = result;
    }

    @Parameterized.Parameters
    public static Collection createAlgos() {
        return Arrays.asList(new Object[][][] {
                {{0},{0}},
                {{0,1},{1,0}},
                {{0,1,2},{2,1,0}},
                {{0,1,2,3,4},{4,3,2,1,0}},
                {{0,1,2,3,4,5,6,7,8,9},{9,8,7,6,5,4,3,2,1,0}},
                {{"S","T","R"},{"R","T","S"}}
        });
    }

    @Test
    public void revertArrayTest() throws Exception {
        assertArrayEquals(array, Algo.revertArray(mirrorArray));
    }

}