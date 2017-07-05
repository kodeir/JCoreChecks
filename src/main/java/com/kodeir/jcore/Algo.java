package com.kodeir.jcore;

/**
 * Created by Sergei "Kodeir" Riabinin on 14/03/17.
 */
public class Algo {

    public static Object[] revertArray(Object[] a) {
        int length = a.length;
        for (int i=0; i<(length)/2; i++){
            Object flag = a[length-1-i];
            a[length-1-i] = a[i];
            a[i] = flag;
        }
        return a;
    }
}
