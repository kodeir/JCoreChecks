package com.kodeir.jcore;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Sergei "Kodeir" Riabinin on 15/03/17.
 */
public class AlgoTest {

    @Test
    public void revertArray1() throws Exception {
        int[] a = {0};
        int[] b = {0};
        assertArrayEquals(a, Algo.revertArray(b));
    }

    @Test
    public void revertArray2() throws Exception {
        int[] a = {0,1};
        int[] b = {1,0};
        assertArrayEquals(a, Algo.revertArray(b));
    }

    @Test
    public void revertArray3() throws Exception {
        int[] a = {0,1,2};
        int[] b = {2,1,0};
        assertArrayEquals(a, Algo.revertArray(b));
    }

    @Test
    public void revertArray5() throws Exception {
        int[] a = {0,1,2,3,4};
        int[] b = {4,3,2,1,0};
        assertArrayEquals(a, Algo.revertArray(b));
    }

    @Test
    public void revertArray10() throws Exception {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        int[] b = {9,8,7,6,5,4,3,2,1,0};
        assertArrayEquals(a, Algo.revertArray(b));
    }

}