package com.kodeir.jcore;

/**
 * Created by Sergei Riabinin on 14.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        checkInitialization();
    }

    private static void checkInitialization(){
        System.out.println("*** check initialization order ***");
        InitializationOrder initializationOrder = new InitializationOrder();
    }

}
