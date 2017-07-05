package com.kodeir.jcore;

/**
 * Created by Sergei "Kodeir" Riabinin on 14/03/17.
 */
public class Algo {

    public static int[] revertArray(int[] a) {
        int length = a.length;
        for (int i=0; i<(length)/2; i++){
            int flag = a[length-1-i];
            a[length-1-i] = a[i];
            a[i] = flag;
        }
        return a;
    }

    public static double sumArray(int[] a) {
        int length = a.length;
        double sum = 0;
        for (int i=0; i<length; i++){
            sum += a[i];
        }
        return sum;
    }
}
