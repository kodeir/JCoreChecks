package com.kodeir.jcore;

/**
 * Created by Sergei "Kodeir" Riabinin on 14/03/17.
 */
public class SimpleFinalize {

    protected void finalize(){
        System.out.println("wow, finalize was called");
    }

}
